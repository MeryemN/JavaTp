import java.util.Scanner;

public class MaximumTableau {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Demander à l'utilisateur le nombre d'éléments dans le tableau
        System.out.print("Entrez le nombre d'éléments dans le tableau : ");
        int n = input.nextInt();
        
        // Créer un tableau de réels pour stocker les éléments
        double[] tableau = new double[n];
        
        // Demander à l'utilisateur de saisir les éléments du tableau
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez l'élément " + (i+1) + " : ");
            tableau[i] = input.nextDouble();
        }
        
        // Trouver le maximum du tableau
        double maximum = tableau[0];
        for (int i = 1; i < n; i++) {
            if (tableau[i] > maximum) {
                maximum = tableau[i];
            }
        }
        
        // Afficher le maximum du tableau
        System.out.println("Le maximum du tableau est : " + maximum);
    }
}
