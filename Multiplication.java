import java.util.Scanner;

public class Multiplication {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Demande à l'utilisateur de saisir un nombre.
		System.out.println("Veuillez saisir un nombre :");
		int nombre = sc.nextInt();

		// Affiche la table de multiplication par le nombre saisi par l'utilisateur.
		for (int i = 0; i <= 10; i++) {
			System.out.println(nombre + " * " + i + " = " + nombre * i);
		}
	}
}