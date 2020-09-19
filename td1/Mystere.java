// Pour utiliser les bibliothèques standards
import java.util.Random;
import java.util.Scanner;

class Mystere {

	// Permet de lire ce que l'utilisateur saisi au clavier
	public static Scanner clavier = new Scanner(System.in);

	public static void main(String[] args) {
		// Un générateur de nombre aléatoire
		Random aleatoire = new Random();
		// Génère un nombre compris entreo 0 et 100 (exclus)
		int mystere = aleatoire.nextInt(100);

    boolean found = false;
    int count = 0;

    while ((count < 10) && (!found)) {
      System.out.print("Nombre : ");
  		// Lit un entier au clavier, génère une erreur si la valeur saisie n'est pas un entier
  		int essai = clavier.nextInt();

      if (essai == mystere){
        System.out.println("Votre nombre est " + essai + " et le nombre mystere est " + mystere);
        System.out.println("Bravo vous avez trouvé en " + count + " essais !");
        found = true;
      }else{
        count++;
        if (essai < mystere){
          System.out.println("Le nombre mystere est plus elevé");
        }else{
          System.out.println("Le nombre mystere est plus faible");
        }
      }
    }

    System.out.println("Vous n'avez pas reussi à trouver en 10 essais !");

	}
}
