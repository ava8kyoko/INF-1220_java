// Classes, objets, atributs et methodes en Java

class Exemple {
	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle();

		rect1.hauteur = 3.0;
		rect1.largeur = 4.0;

		System.out.println("hauteur : " + rect1.hauteur);
		System.out.println("surface : " + rect1.surface());
	}
}
