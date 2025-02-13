# Exercice 3 : 

Additionnez tous les nombres naturels plus petits que 1000 qui sont des multiples de 3 ou de 5.

```
Voici un algorithme inefficace. Vous pouvez faire mieux:
Variable entière i = 0
Variable entière somme = 0

TANT QUE i < 1000
  SI le reste de la division par 3 de i est zero OU le reste de la division par 5 de i est zero ALORS
     somme = somme + i
  i = i + 1
FIN TANT QUE

Retourne somme
```

```
entier i = 0
entier somme = 0

TANT QUE i < 1000 {
	SI i%3 == 0 || i%5 == 0 ALORS
		somme++;
	FIN SI
	i++
}
FIN TANT QUE

retourner somme
```