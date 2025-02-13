/*
 * Question 10
 * Vous avez à créer une classe qui selon une constante de type nombre entier 
 * présente dans la classe, le code doit afficher le bon nombre de mots de la phrase 
 * suivante : « Veni vidi vici ». Vous ne pouvez qu’utiliser les opérateurs vus 
 * dans la leçon précédente (truc: opérateur à trois opérandes).
 */

public class veniVidiVici {
	private static final int NBR_MOTS = 3; // Vous pouvez modifier cette valeur

	public static void main(String[] args) {
		String phrase = (NBR_MOTS == 3) ? "Veni vidi vici"
						: (NBR_MOTS == 2) ? "Veni vidi"
						: (NBR_MOTS == 1) ? "Veni"
						: "Nombre de mots incorrect";

		System.out.println("Phrase : " + phrase);
	}
}


/*
 * Reponse
 
 public class Main {
    
        // La constante qui détermine le nombre de mot;
        public static final int nombreDeMot = 3;
        
        public static final String veni = "Veni";
        public static final String vidi = "vidi";
        public static final String vici = "vici";
        
        public static void main(String[] args){
            
                String phrase = new String();
            
                phrase = (nombreDeMot == 3) ? veni + vidi + vici : (nombreDeMot == 2) ? veni + vidi : (nombreDeMot == 1) ? veni : "";
                
                System.out.println("Phrase : " + phrase);
        }                        
    
}
 */