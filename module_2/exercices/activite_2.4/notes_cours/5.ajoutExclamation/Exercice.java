// Voici un exemple pour illustrer le comportement du passage de paramètre en référence

public class Exercice {
    
    protected int compteur = 0;

    public static void mettreDesPointsExclamations(StringBuffer texte) {
        
        // On modifie le texte
        texte.insert(3, "!!!");
        texte.append("$$$");
        
    }
   
    public static void main(String[] args) {
        
        // Utilisation du StringBuffer, une chaîne de caractère "mutable" 
		// (donc pouvant être modifié grâce à des méthodes offertes par l'API).
        StringBuffer test = new StringBuffer("Bonjour");
        
        //Affichage avant de l'appel de méthode
        System.out.println(test);
        
        mettreDesPointsExclamations(test);
        
        //Affichage après l'appel de méthode avec le test de paramètre par référence.
        System.out.println(test);
        
    }
    
}
