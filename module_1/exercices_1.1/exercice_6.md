# Exercice 6

Exercice 6
Trouvez l'erreur dans le pseudo-code suivant :

```
Entrées  :
Tableau R de longueur N
Valeur X

Sortie :
Est-ce que la valeur X se trouve dans le tableau R ?

Variables :
Itérateur i = 0

Tant que i <= N
   Si R[i] = X Alors retourne Vrai
   i = i + 1

retourne Faux
```

Reponse : La variable itérateur va successivement prendre les valeurs de 0 à N. Il va donc avoir accès à N + 1 valeurs au sein du tableau R.

```
Tant que i < N
   Si R[i] = X Alors retourne Vrai
   i = i + 1

retourne Faux
```