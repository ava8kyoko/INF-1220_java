// Le programme ci-dessous illustre l’utilisation d’une fonction avec type retourné

public class NombreAleatoire {
    //déclaration des attributs : variable de classe et variable d'instance  

    /**
     * La fonction getNombreAleatoire permet de générer un nombre aléatoire
     *
     * @return typeRetourné
     */
    public static int getNombreAleatoire() {
        // Utilisation de la fonction Math.random qui retourne un nombre aléatoire 
		// de type "double" (donc nombre à virgule flottante de 64 bits) entre 0 et 1. 
		// Utilisation d'un "cast" en int pour convertir le double en int.
        int num = (int) (Math.random() * 10) + 1;
        return num;
    }

    /**
     * La fonction main
     *
     * @param args tableau d'arguments
     */
    public static void main(String args[]) {//corps de la fonction  
        int nombre = getNombreAleatoire();
        System.out.println("le nombre est " + nombre);
    }
}
