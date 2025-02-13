/*
 * Ecrire un programme Java qui lit deux entiers et affiche la difference des deux nombres.
 */

import javax.swing.JOptionPane; 
public class Exercice3{ 
 
    public static void main (String args[]) { 
         
        String chaine = JOptionPane.showInputDialog ("Entrez le premier entier dans cette case"); 
        int somme = Integer.parseInt(chaine); 
         
        chaine = JOptionPane.showInputDialog ("Entrez le deuxieme entier dans cette case"); 
        somme -= Integer.parseInt(chaine); 
         
        JOptionPane.showMessageDialog(null,"La difference des deux entiers est " + somme); 
        System.exit(0); 
    } 
} 
