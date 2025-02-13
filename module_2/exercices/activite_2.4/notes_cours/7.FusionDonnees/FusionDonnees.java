// Voici un exemple de surdéfinition de méthodes.

public class FusionDonnees {
    
    protected String texte = "";

    public String getTexte() {
        return texte;
    }

    public void setTexte(String texte) {
        this.texte = texte;
    }
    
    public String fusion(String autreTexte) {
                      
        return texte + "|+s|" + autreTexte;
    }
    
    public String fusion(int entier) {
        // ou bien texte + "|i|" + entier; fait la même chose ...
        return texte + "|+i|" + Integer.toString(entier);
    }
    
    public static void main(String[] args) {

        String hiTexte = "Hi";
        
        FusionDonnees fusionneur = new FusionDonnees();
        fusionneur.setTexte("Bonjour");
              
        System.out.println(fusionneur.fusion(hiTexte));
        System.out.println(fusionneur.fusion(13));
        
    }
    
}