// Soit deux entiers positifs (int) x et y. Sachant que la moyenne 
// des deux valeurs est aussi un entier, 
// donnez une expression qui calcule cette moyenne.
// Réponse
// On peut la calculer avec l’expression y+(x - y)/2. 
// Il pourrait être tentant d’utiliser l’expression (x + y)/2, 
// mais cette dernière est incorrecte comme vous pouvez 
// le vérifier avec ce programme:

class moyenneEntiers {
  public static void main(String[] args) {
    int x = 2147483647;
    int y = 2147483645;

    System.out.println((x+y)/2);
    System.out.println(y+(x-y)/2);
  }
}

/* Explication chatGPT
 * Même si dans la plupart des cas (x + y) / 2 fonctionne correctement, 
 * la forme y + (x - y)/2 est préférée pour éviter un éventuel overflow 
 * lors de l'addition de x et y.
 * C'est pourquoi, dans certains contextes, on considère que la bonne 
 * réponse est bien : y + (x - y) / 2
 */
