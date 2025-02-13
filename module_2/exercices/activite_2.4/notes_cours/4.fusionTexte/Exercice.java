// L’exemple de code ci-dessous présente une méthode avec plusieurs paramètres
public class Exercice {
    
    public static String fusionDeTexte(String texte1, String texte2) {
        
        return texte1 + "::" + texte2;
		
    }
       
    public static void main(String[] args) {
        
        String bonjourTexte = "Bonjour";
        String hiTexte = "Hi";
        
        System.out.println(fusionDeTexte(bonjourTexte, hiTexte));
        
    }
    
}
