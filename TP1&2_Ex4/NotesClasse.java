import java.util.Scanner;

public class NotesClasse {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Demander à l'utilisateur le nombre d'étudiants dans la classe
        System.out.print("Entrez le nombre d'étudiants dans la classe : ");
        int n = input.nextInt();
        
        // Créer un tableau de réels pour stocker les notes des étudiants
        double[] notes = new double[n];
        
        // Demander à l'utilisateur de saisir les notes des étudiants
        for (int i = 0; i < n; i++) {
            System.out.print("Entrez la note de l'étudiant " + (i+1) + " : ");
            notes[i] = input.nextDouble();
        }
        
        // Calculer la moyenne de la classe
        double moyenne = 0;
        for (int i = 0; i < n; i++) {
            moyenne += notes[i];
        }
        moyenne /= n;
        System.out.println("La moyenne de la classe est : " + moyenne);
        
        // Compter le nombre d'étudiants ayant une note supérieure à la moyenne
        int nbEtudiantsSupMoyenne = 0;
        for (int i = 0; i < n; i++) {
            if (notes[i] > moyenne) {
                nbEtudiantsSupMoyenne++;
            }
        }
        System.out.println("Il y a " + nbEtudiantsSupMoyenne + " étudiants ayant une note supérieure à la moyenne.");
    }
}
