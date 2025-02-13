# Exercice 2 : La recherche d'un entier

 Dans cet exercice, à partir de la solution de l’exercice 1, vous devez proposer un algorithme en pseudo-code permettant de vérifier si un entier (exemple réel … un numéro de téléphone d’un client) est présent dans un tableau et de retourner l’index de celui-ci, sinon de retourner la valeur -1. Pour ce faire, vous devrez donc utiliser une structure itérative et une structure de contrôle (SI _ ALORS _ FINSI).

Algo du prof

 ```
 Entree :
 Tableau d'entier monTableau d'une taille N
 Entier nombreATrouver

 Variables :
 Entier index = 0 // index de l'element du tableau

 Sortie:
 Index de l'entier ou -1 si l'entier n'est pas trouve

Algorithme trouverEntier :
TANT QUE index < taille de monTableau FAIRE
	SI nombreATrouver est egale a monTableau[index] ALORS
		retourner index; // fin de l'algorithme donc fin de la boucle
	FIN SI
	index = index + 1 // on incremente l'index pour la prochaine iteration
FIN TANT QUE

// SI l'iteration se termine, c'est que le nombre n'a pas ete trouve
retourner -1
 ```

Mon algo

```
Entree : 
Tableau d'entier monTableau d'une taille N
Entier nombreATrouver

Sortie :
Index de l'entier ou -1 si l'entier n'est pas trouve

Variables :
chaine de caracteres tab // tableau
entier N = taille de tab
entier i = 0
entier nbr = // nombre a trouver

Algorithme trouverEntier :
TANT QUE i < N FAIRE {
	SI nbr == tab[i]
		retourner i;
	FIN SI
	i++;
}
FIN TANT QUE

retourner -1;
```

Solution de l'AI

```
Pour vérifier si un entier est présent dans un tableau et retourner son index, vous pouvez utiliser une boucle pour parcourir chaque élément du tableau et une structure conditionnelle pour comparer chaque élément avec l'entier recherché. Voici un algorithme en pseudo-code qui décrit ce processus :

1. Initialiser une variable index à -1 pour stocker l'index de l'entier si trouvé.
2. Pour chaque élément i de 0 à la longueur du tableau - 1 :
	Si l'élément à l'index i du tableau est égal à l'entier recherché :
		Mettre à jour index avec la valeur de i.
		Sortir de la boucle (car l'entier a été trouvé).
3. Retourner la valeur de index.

En Java, cela pourrait être implémenté comme suit :

public class RechercheEntier {
    public static void main(String[] args) {
        int[] tableau = {10, 20, 30, 40, 50}; // Exemple de tableau
        int entierRecherche = 30; // Exemple d'entier à rechercher
        int index = -1; // Valeur par défaut si l'entier n'est pas trouvé

        for (int i = 0; i < tableau.length; i++) {
            if (tableau[i] == entierRecherche) {
                index = i;
                break; // Sortir de la boucle une fois l'entier trouvé
            }
        }

        System.out.println("L'index de l'entier recherché est : " + index);
    }
}

Dans cet exemple, la boucle for parcourt chaque élément du tableau tableau. Si l'entier recherché est trouvé, l'index est mis à jour et la boucle est interrompue avec break. Si l'entier n'est pas trouvé, la valeur par défaut de index reste -1.
```