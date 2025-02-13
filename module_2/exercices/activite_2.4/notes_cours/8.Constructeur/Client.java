/*
 * Voici un exemple de constructeurs et leur utilisation.
 */

public class Client {
	
	//Constantes static, donc une seule représentation en mémoire
	public static final String DEBUTLOG = "Client :";
	public static final String SEPARATEUR = "|*|";
	
	//Variable déclaré public, nous verrons plus loins à quoi ça sert ...
	public int id;
	public String prenom;
	public String nom;
	public boolean clientActif;
	
	public Client() {
		id = (int) (Math.random() * 1000) - 1;
		prenom = "John";
		nom = "Doe";
		clientActif = false;
	}
	
	public Client(int id, String prenom, String nom) {
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		clientActif = true;
	}
	
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
		
		// Création d'une instance de la classe Client avec le constructeur sans paramètre;
		Client unClient = new Client();
   
		// Création d'une deuxième instance de la classe avec le constructeur à 3 paramètre);
		Client unAutreClient = new Client(44, "Charlie", "Chaplin");

		
		System.out.println(Client.DEBUTLOG + unClient.id + Client.SEPARATEUR + unClient.prenom + Client.SEPARATEUR + unClient.nom);
		
		System.out.println(DEBUTLOG + unAutreClient.id + Client.SEPARATEUR + unAutreClient.prenom + Client.SEPARATEUR + unAutreClient.nom);
		
	}
	
}
