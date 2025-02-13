/*
 * Exercice. Modifiez le programme Exemple1 afin qu’il lise trois entiers (plutôt 
 * que deux) et en affiche la somme. 
 * 
 * Solution. La solution suivante est une adaptation directe de Exemple1.java. 
 * La nouvelle variable chaine3 de type String est introduite pour y lire la 
 * troisième chaîne de caractère ainsi qu’une variable entier3 pour l’entier 
 * correspondant. 
 */

/** 
* Exercice1.java 
* Lire 3 entiers et en afficher la somme 
*/ 
import javax.swing.JOptionPane; 
public class Exercice1{ 
	public static void main (String args[]) { 
		String chaine1 = JOptionPane.showInputDialog("Entrez un premier nombre entier"); 
		String chaine2 = JOptionPane.showInputDialog("Entrez un second nombre entier"); 
		String chaine3 = JOptionPane.showInputDialog("Entrez un troisième nombre entier"); 
		int entier1 = Integer.parseInt(chaine1); 
		int entier2 = Integer.parseInt(chaine2); 
		int entier3 = Integer.parseInt(chaine3); 
		int somme = entier1 + entier2 + entier3; 
		JOptionPane.showMessageDialog(null,"La somme des trois entiers est " + somme); 
		System.exit(0); 
	} 
} 
