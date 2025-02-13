/*
 * Pour éviter des effets de bord difficiles à comprendre lors de modification 
 * de paramètres dans une fonction, il est possible d’éviter de modifier les valeurs 
 * des paramètres en faisant une copie locale comme dans cet exemple.
 */

public class Exercice {
    
    protected int compteur = 0;
   
    
    public static StringBuffer mettreDesPointsExclamations(StringBuffer texte) {
        
        StringBuffer copieLocal = new StringBuffer(texte.toString());
        
        // On modifie le texte
        copieLocal.insert(0, "!!!");
        copieLocal.append("%%%");
        
        return copieLocal;
           
    }
   
    public static void main(String[] args) {
        
        // Utilisation du StringBuffer, une chaîne de caractère "mutable" (donc pouvant être modifié grâce à des méthodes offertes par l'API).
        StringBuffer test = new StringBuffer("Bonjour");
        
        //Affichage avant de l'appel de méthode
        System.out.println(test);
        
        StringBuffer texteModifie = mettreDesPointsExclamations(test);
        
        //Affichage après l'appel de méthode avec le test de paramètre par référence.
        System.out.println(texteModifie);
        
    }
    
}
