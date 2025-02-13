/*
 * Ecrire un programme Java qui lit deux nombres réels a et b (type float) et affiche a/b. 
 */

 import javax.swing.JOptionPane; 
 public class Exercice6{ 
  
	 public static void main (String args[]) { 
		  
		 String chaine = JOptionPane.showInputDialog ("Entrez le premier entier dans cette case"); 
		 float somme = Integer.parseInt(chaine); 
		  
		 chaine = JOptionPane.showInputDialog ("Entrez le deuxieme entier dans cette case"); 
		 somme /= Integer.parseInt(chaine); 
		  
		 JOptionPane.showMessageDialog(null,"Le resultat de a/b est " + somme); 
		 System.exit(0); 
	 } 
 } 
