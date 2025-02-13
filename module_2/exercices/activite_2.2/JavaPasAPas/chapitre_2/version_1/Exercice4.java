/*
 * Ecrire un programme Java qui lit trois entiers a, b et c. 
 * Le programme affiche le resultat de : ab-c.
 */

 import javax.swing.JOptionPane; 
 public class Exercice4{ 
  
	 public static void main (String args[]) { 
		  
		 String chaine = JOptionPane.showInputDialog ("Entrez le premier entier dans cette case"); 
		 int somme = Integer.parseInt(chaine); 
		  
		 chaine = JOptionPane.showInputDialog ("Entrez le deuxieme entier dans cette case"); 
		 somme *= Integer.parseInt(chaine); 

		 chaine = JOptionPane.showInputDialog ("Entrez le troisieme entier dans cette case"); 
		 somme -= Integer.parseInt(chaine); 
		  
		 JOptionPane.showMessageDialog(null,"Le resultat de ab-c est " + somme); 
		 System.exit(0); 
	 } 
 } 
