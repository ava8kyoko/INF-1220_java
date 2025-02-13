/*
 * En vous inspirant de l’exemple précédent, écrivez un programme 
 * qui dessine un bonhomme de votre cru ou encore le bonhomme Iti suivant. 
 * La taille de la fenêtre de Iti est 300 par 300.
 */

import java.awt.*; 
import javax.swing.JFrame; 
public class ExerciceDessinIti extends JFrame { 
  public ExerciceDessinIti() { 
    super("Dessin de Iti"); 
    this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
    this.setSize(300, 300); 
    this.setVisible(true); 
  } 
  public void paint(Graphics g) { 
    super.paint(g); 
    // Dessin de Iti
    // Les cheveux
    g.setColor(Color.yellow); 
    g.drawLine(150, 50, 50, 200); 
    g.drawLine(150, 50, 250, 200); 
    // La tête 
    g.setColor(Color.pink); 
    g.fillOval(133, 50, 33, 50); 
    // Le sourire 
    g.setColor(Color.black); 
    g.drawArc(133, 34, 33, 50, -125, 70); 
    // Les yeux 
    g.fillOval(138, 66, 8, 8); 
    g.fillOval(154, 66, 8, 8); 
    // Le corps 
    g.drawLine(150, 100, 150, 200); 
    // Les bras 
    g.drawLine(100, 100, 150, 150); 
    g.drawLine(200, 100, 150, 150); 
    // Les jambes 
    g.drawLine(100, 250, 150, 200); 
    g.drawLine(200, 250, 150, 200);
  } 
 
  public static void main(String args[]) { 
    new ExerciceDessinIti(); 
  } 
} 

