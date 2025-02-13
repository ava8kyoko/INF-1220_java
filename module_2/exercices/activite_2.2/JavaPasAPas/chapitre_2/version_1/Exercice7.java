/*
 * Ecrivez un programme Java qui lit deux nombres réels (type double) qui représentent la largeur 
 * et la hauteur d’un rectangle et affiche la surface du rectangle. 
 */

 import javax.swing.JOptionPane; 
 public class Exercice7{ 
  
	 public static void main (String args[]) { 
		  
		 String chaine = JOptionPane.showInputDialog ("Entrez la largeur du rectangle dans cette case"); 
		 double somme = Integer.parseInt(chaine); 
		  
		 chaine = JOptionPane.showInputDialog ("Entrez la longueur du rectangle dans cette case"); 
		 somme *= Integer.parseInt(chaine); 
		  
		 JOptionPane.showMessageDialog(null,"L'aire du rectangle est " + somme); 
		 System.exit(0); 
	 } 
 } 
