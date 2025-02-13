/*
 * Exercice. Écrivez un programme qui effectue le même traitement que le 
 * précédent mais en utilisant une seule variable de type String (plutôt que 
 * trois) et une variable entière plutôt que quatre ! 
 *
 * Solution. La solution suivante réutilise la même variable chaine pour lire 
 * chacune des chaînes de caractère qui représente un entier et la même variable 
 * somme pour cumuler les valeurs intermédiaires.  
 */

 /** 
 * Exercice2.java 
 * Lire 3 entiers et en faire la somme. Utiliser seulement une variable String 
 * et deux variables int. 
 */ 
import javax.swing.JOptionPane; 
public class Exercice2{ 
 
    public static void main (String args[]) { 
         
        String chaine = JOptionPane.showInputDialog ("Entrez un entier dans cette case"); 
        int somme = Integer.parseInt(chaine); 
         
        chaine = JOptionPane.showInputDialog ("Entrez un entier dans cette case"); 
        somme += Integer.parseInt(chaine); 
         
        chaine = JOptionPane.showInputDialog ("Entrez un entier dans cette case"); 
        somme += Integer.parseInt(chaine); 
         
        JOptionPane.showMessageDialog(null,"La somme des trois entiers est " + somme); 
        System.exit(0); 
    } 
} 
