/*
 * L’exemple suivant créé trois fenêtres qui correspondent à trois objets 
 * de la classe ExempleDessin2DDansJFrame. 
 */

 import java.awt.*; 
 import javax.swing.JFrame; 
  
 public class ExempleDessin2DDansJFrame2 extends JFrame { 
  
	 public ExempleDessin2DDansJFrame2() { 
		 super("Exemples de dessin avec les méthodes de Graphics"); 
		 this.setDefaultCloseOperation(EXIT_ON_CLOSE); 
		 this.setSize(400,600); 
		 this.setVisible(true); 
	 } 
  
	 // La méthode paint() est appelée automatiquement lors de la création du JFrame 
	 // La méthode paint() fait un dessin d'un bonhomme 
	 public void paint (Graphics g) { 
		 super.paint(g); 
  
		 g.setColor(Color.green); 
		 g.fillOval(100,100,200,200); // La tête 
		 g.setColor(Color.black); 
		 g.fillRect(150,150,20,20); // L'oeil gauche 
		 g.fillRect(230,150,20,20); // L'oeil droit 
		 g.drawLine(150,250,250,250); // La bouche 
		 g.setColor(Color.red); 
		 g.fillRect(100,300,200,200); // Le corps 
	 } 
  
	 public static void main (String args[]) { 
		 new ExempleDessin2DDansJFrame2(); 
		 new ExempleDessin2DDansJFrame2(); 
		 new ExempleDessin2DDansJFrame2(); 
	 } 
 } 
