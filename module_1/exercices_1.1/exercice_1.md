# Exercice 1 - La somme d'un tableau

Dans le cadre de cet exercice, vous devez proposer un algorithme qui permettra de calculer la somme des nombres entiers d’un tableau à une dimension d’un longueur quelconque (c’est à dire qu’il peut y avoir 0 à 1 millions et plus de nombre à l’intérieur). Pour ce faire, vous devrez spécifier dans votre algorithme une structure d’itération (une boucle) qui récupèrera chaque nombre du tableau.

Algo du prof
```
Entree :
Tableau d'entier monTableau d'une taille N

Variables :
Entier somme = 0 // la somme du tableau
Entier index = 0 // index de l'element du tableau

Sortie :
Entier somme

Algorithme sommeTableau :
TANT QUE index < taille de monTableau FAIRE
	somme = somme + monTableau[index]; // on fait la somme des nombres
	index = index + 1; // on incremente l'index pour la prochaine iteration
FIN TANT QUE

retourner somme
```

Mon algo
```
Entree :
Tableau d'entrier monTableau d'un taille N

Sortie :
Entier somme

Variables :
Chaine de caractere = monTableau
Entier constant N = taille de monTableau
Entier somme = 0
Entier i = 0

Algorithme sommeTableau :
TANT QUE i < N FAIRE {
	somme += monTableau[i];
	i++;
}
FIN TANT QUE

retourner somme;
```

Solution de l'AI

```
Pour calculer la somme des nombres entiers d'un tableau à une dimension de longueur quelconque, vous pouvez utiliser une boucle pour parcourir chaque élément du tableau et accumuler la somme. Voici un algorithme en pseudo-code qui décrit ce processus :

1. Initialiser une variable somme à 0 pour stocker la somme des éléments du tableau.
2. Pour chaque élément nombre dans le tableau :
	Ajouter nombre à somme.
3. Afficher la valeur de somme.

En Java, cela pourrait être implémenté avec une boucle for comme suit :

public class SommeTableau {
    public static void main(String[] args) {
        int[] tableau = {1, 2, 3, 4, 5}; // Exemple de tableau, peut contenir n'importe quel nombre d'éléments
        int somme = 0;

        for (int i = 0; i < tableau.length; i++) {
            somme += tableau[i];
        }

        System.out.println("La somme des éléments du tableau est : " + somme);
    }
}

Dans cet exemple, la boucle for parcourt chaque élément du tableau tableau, et la variable somme est mise à jour en ajoutant chaque élément du tableau. À la fin, la somme totale est affichée. Cette méthode fonctionne pour un tableau de n'importe quelle taille, y compris un tableau vide, où la somme serait simplement 0.
```