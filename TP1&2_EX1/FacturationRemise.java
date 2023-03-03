import java.util.Scanner;

public class FacturationRemise {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Lecture du prix hors taxes en DH
        System.out.print("Entrez le prix hors taxes en DH : ");
        double prixHT = input.nextDouble();
        
        // Calcul du prix TTC avec un taux de TVA de 18,6%
        double prixTTC = prixHT * 1.186;
        
        // Calcul de la remise en fonction du montant TTC
        double remise = 0;
        if (prixTTC >= 5000) {
            remise = 0.05;
        } else if (prixTTC >= 2000) {
            remise = 0.03;
        } else if (prixTTC >= 1000) {
            remise = 0.01;
        }
        
        // Calcul du prix final après remise
        double prixFinal = prixTTC * (1 - remise);
        
        // Affichage des résultats
        System.out.printf("Le prix TTC est de %.2f DH%n", prixTTC);
        System.out.printf("La remise est de %.0f %% %n", remise * 100);
        System.out.printf("Le prix final après remise est de %.2f DH%n", prixFinal);
        
        input.close();
    }

}
