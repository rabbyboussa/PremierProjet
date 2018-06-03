public class Multiplication {
	public static void main(String[] args) {
		// Demande à l'utilisateur de saisir un nombre.
		int nombre = 5;

		// Affiche la table de multiplication par le nombre saisi par l'utilisateur.
		for (int i = 0; i <= 10; i++) {
			System.out.println(nombre + " * " + i + " = " + nombre * i);
		}
	}
}