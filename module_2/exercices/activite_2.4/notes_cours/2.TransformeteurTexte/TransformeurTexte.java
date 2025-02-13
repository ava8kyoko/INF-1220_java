/** MARCHE PAS
 * Quelques exemples de méthodes static et non-static
 * @author cgouin
 */
public class TransformeurTexte {
    
    protected String texte = "";
    
    // Méthode pour inverser un texte
    public static String inverserTexte(String texte) {
        
        String texteRenverse = new String();
        
        // Utilisation d'une boucle itérative, à voir dans le prochain module.
        for (char c : texte.toCharArray()) {
            texteRenverse = c + texteRenverse;
        }
        
        return texteRenverse;
        
    }

    // Méthode "get" permettant d'accéder à la variable texteInstance
    public String getTexte() {
        return texte;
    }
    
    // Méthode "set" permettant de modifier la variable texteInstance
    public void setTexte(String texteInstance) {
        this.texte = texteInstance;
    }
    
    public void transformerTexteEnHTML() {
        
        texte =  "<html><body><p>" + texte + "</p></body></html>";
        
    }
    
    public static void main(String[] args) {
        
        String test = "ohohoh";
        
        // Appel d'une méthode static
        System.out.println(inverserTexte(test));
        
        // Appel d'une méthode non-static de la classe
        TransformeurTexte transformeur = new TransformeurTexte();
        transformeur.setTexte("Bonjour le monde!");
        transformeur.transformerTexteEnHTML();
        System.out.println(transformeur.getTexte());
        
    }
    
}
