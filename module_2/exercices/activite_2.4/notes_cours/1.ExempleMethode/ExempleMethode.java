/**
 * Quelques exemples d'appel de méthodes
 * @author cgouin
 */
public class ExempleMethode {
    
    public static void main(String[] args) {
        
        // Définition d'une chaîne de caractères
        String texte = "Veni, vidi";
        
        // Appel de la méthode de concaténation qui revient à faire l'opération "+".
        texte = texte.concat(", vici");
        
        // Appel de la méthode permettant d'imprimer dans la console
        System.out.println(texte);
        
        String autreTexte = "J'aime les patates";
		String bonTexte = "Veni, vidi, vici";
        
        // Appel de la méthode equals qui permet de vérifier si les deux string 
		// sont égaux
        System.out.println("Textes égaux ? : " + texte.equals(autreTexte));     
		System.out.println("Textes égaux ? : " + texte.equals(bonTexte));            
        
    }
    
}
