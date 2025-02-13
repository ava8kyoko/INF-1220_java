# Exercide 4

Trouver le plus grand nombre premier qui divise 317584931803.


Algo du prof 

```
Voici un algorithme inefficace (qui fait plus d'opérations que nécessaire). Vous pouvez faire mieux:
Variable entière i = 1
Variable entière solution = 1
TANT QUE i < 317584931803
  SI le reste de la division de 317584931803 par i est zero ALORS
     Variable entière j = 3
     Variable booléenne premier = vrai
     TANT QUE j < i
        SI le reste de la division de i par j est zero ALORS
           premier = faux
        j = j + 1
      FIN TANT QUE
      SI premier ALORS
         solution = i
  i = i + 1
FIN TANT QUE
Retourne solution

Pour les étudiants curieux, voici une solution pouvant être exécutée par la machine en Python:

i = 1
solution = 1
while i < 317584931803:
  if 317584931803 % i == 0:
     j = 3
     premier = True
     while j < i:
        if i%j == 0:
           premier = False
        j = j + 1
     if premier:
         print(i, " est premier")
         solution = i
  i = i + 1
print(solution)

Vous pouvez biffer la ligne 'print(i, " est premier")' en Python si vous ne souhaitez qu'avoir la réponse finale. Notez que dans cet exemple, la variable j est introduite et définie au sein d'une boucle. Nous comptons aussi sur le fait que tout nombre qui divise print(i, " est premier") ne peut être lui-même pair d'après le théorème fondamental de l'arithmétique.
```

Mon algo

```
entier i = 1
entier solution = 1
entier j = 3
booleen premier = vrai

TANT QUE i < 317584931803 {
	SI 317584931803%i == 0 ALORS {
		TANT QUE j < i {
			SI i%j == 0
				premier == faux;
			j++;
		}
		SI premier ALORS
			solution = i;
	}
	i++;
}

retourner solution
```

Solution chatGPT

```
fonction PlusGrandDiviseurPremier(n : entier) : entier
    // On travaille sur une copie de n
    m ← n
    // On commence par le plus petit diviseur premier
    facteur ← 2
    tant que facteur * facteur ≤ m faire
        si m modulo facteur = 0 alors
            // On divise autant que possible par ce facteur
            tant que m modulo facteur = 0 faire
                m ← m ÷ facteur
            fin tant que
        sinon
            facteur ← facteur + 1
        fin si
    fin tant que
    // À la fin, s’il reste un nombre m > 1, c'est un nombre premier.
    retourner m
fin fonction

// Programme principal
n ← 317584931803
plusGrand ← PlusGrandDiviseurPremier(n)
afficher "Le plus grand diviseur premier de", n, "est", plusGrand
```

Ma version

```
entier fonction PlusGrandDiviseurPremier() {
	nbr = 317584931803;
	facteur = 2;

	TANT QUE facteur * facteur <= nbr FAIRE {
		SI nbr%facteur == 0 ALORS {
			TANT QUE nbr%facteur == 0 FAIRE
				nbr /= facteur;
		}
		SINON
			facteur++;
	}
	RETOURNER nbr;
}







```

