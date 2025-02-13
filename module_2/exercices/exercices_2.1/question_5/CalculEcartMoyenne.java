/* 
 * Question 5
 * À l’aide d’une classe Java et en utilisant l’arithmétique entière, 
 * vous devez calculer la moyenne des tailles de 5 enfants, puis imprimer 
 * la moyenne à la console et l’écart à la moyenne pour chaque enfant:
 * 
 * Alice : 104 cm
 * Bob : 80 cm
 * Chuck : 76 cm
 * Danielle : 110 cm
 * Éloi : 102 cm
 */

 public class CalculEcartMoyenne {
	public static void main(String[] args) {
		int tailleAlice = 104;
		int tailleBob = 80;
		int tailleChuck = 76;
		int tailleDanielle = 110;
		int tailleEloi = 102;
		int somme = 0;
		int moyenne = 0;
		int ecart = 0;

		somme = tailleAlice + tailleBob + tailleChuck + tailleDanielle + tailleEloi;
		moyenne = (somme / 5);
		System.out.println("Moyenne : " + moyenne);

		ecart = tailleAlice - moyenne;
		System.out.println("Ecart a la moyenne d'Alice : " + ecart);
		ecart = tailleBob - moyenne;
		System.out.println("Ecart a la moyenne de Bob : " + ecart);
		ecart = tailleChuck - moyenne;
		System.out.println("Ecart a la moyenne de Chuck : " + ecart);
		ecart = tailleDanielle - moyenne;
		System.out.println("Ecart a la moyenne de Danielle : " + ecart);
		ecart = tailleEloi - moyenne;
		System.out.println("Ecart a la moyenne d'Eloi : " + ecart);
	}
 }


 /* chatGPT
  * 
  public class CalculEcartMoyenne {
    public static void main(String[] args) {
        // Exemple de tableau de valeurs
        double[] valeurs = {2.0, 4.0, 6.0, 8.0, 10.0};
        
        // 1. Calcul de la somme des éléments
        double somme = 0;
        for (double v : valeurs) {
            somme += v;
        }
        
        // 2. Calcul de la moyenne
        double moyenne = somme / valeurs.length;
        System.out.println("La moyenne est : " + moyenne);
        
        // 3. Calcul et affichage de l'écart de chaque valeur par rapport à la moyenne
        for (double v : valeurs) {
            double ecart = v - moyenne;
            System.out.println("L'écart de " + v + " par rapport à la moyenne est : " + ecart);
        }
    }
}

Valeur absolue de l'écart :
Si vous souhaitez obtenir uniquement la distance sans tenir compte 
du signe (écart absolu), vous pouvez utiliser Math.abs() :

		double ecartAbsolu = Math.abs(v - moyenne);

  */



/* reponse
 *
public class CalculMoyenne {
    
	public static void main(String[] args) {
		
		int tailleAlice = 104;
		int tailleBob = 80;
		int tailleChuck = 76;
		int tailleDanielle = 110;
		int tailleEloi = 102;
		
		//Calculer la moyenne
		int moyenne = (tailleAlice + tailleBob + tailleChuck + tailleDanielle + tailleEloi) / 5;
		
		//Imprimer la moyenne
		System.out.println("Moyenne : " + moyenne);

		//Calcul des écart. Utilisation de la méthode Math.abs pour avoir la valeur absolue
		System.out.println("ECT Alice : " + Math.abs(tailleAlice - moyenne));
		System.out.println("ECT Bob : " + Math.abs(tailleBob - moyenne));
		System.out.println("ECT Chuck : " + Math.abs(tailleChuck - moyenne));
		System.out.println("ECT Danielle : " + Math.abs(tailleDanielle - moyenne));
		System.out.println("ECT Eloi : " + Math.abs(tailleEloi - moyenne));
		
	}
 
}
 */