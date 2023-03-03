import java.util.ArrayList;
import java.util.Scanner;

public class GestionComptesBancaires {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CompteBancaire> comptes = new ArrayList<>();
        
        // Création de quelques comptes bancaires pour des clients
        comptes.add(new CompteBancaire("Jean Dupont", "1234", 5000));
        comptes.add(new CompteBancaire("Marie Martin", "5678", 2000));
        comptes.add(new CompteBancaire("Pierre Durand", "9012", 10000));
        
        // Menu pour gérer les comptes bancaires
        int choix = 0;
        do {
            System.out.println("---- Menu Gestion des comptes bancaires ----");
            System.out.println("1- Afficher tous les comptes");
            System.out.println("2- Faire un versement");
            System.out.println("3- Faire un débit");
            System.out.println("4- Afficher l'état de compte d'un client");
            System.out.println("0- Quitter");
            System.out.print("Entrez votre choix : ");
            choix = input.nextInt();
            
            switch (choix) {
                case 1:
                    // Affichage de tous les comptes
                    System.out.println("Liste des comptes :");
                    for (CompteBancaire compte : comptes) {
                        System.out.println(compte);
                    }
                    break;
                case 2:
                    // Faire un versement
                    System.out.print("Entrez le numéro de compte : ");
                    String numero = input.next();
                    System.out.print("Entrez le montant à verser : ");
                    double montant = input.nextDouble();
                    for (CompteBancaire compte : comptes) {
                        if (compte.getNumero().equals(numero)) {
                            compte.verser(montant);
                            System.out.println("Versement effectué avec succès.");
                            System.out.println(compte);
                            break;
                        }
                    }
                    break;
                case 3:
                    // Faire un débit
                    System.out.print("Entrez le numéro de compte : ");
                    numero = input.next();
                    System.out.print("Entrez le montant à débiter : ");
                    montant = input.nextDouble();
                    for (CompteBancaire compte : comptes) {
                        if (compte.getNumero().equals(numero)) {
                            if (compte.debiter(montant)) {
                                System.out.println("Débit effectué avec succès.");
                                System.out.println(compte);
                            } else {
                                System.out.println("Débit impossible : solde insuffisant.");
                            }
                            break;
                        }
                    }
                    break;
                case 4:
                    // Afficher l'état de compte d'un client
                    System.out.print("Entrez le numéro de compte : ");
                    numero = input.next();
                    for (CompteBancaire compte : comptes) {
                        if (compte.getNumero().equals(numero)) {
                            System.out.println(compte);
                            break;
                        }
                    }
                    break;
                case 0:
                    // Quitter le programme
                    System.out.println("Merci d'avoir utilisé notre service.");
                    break;
                default:
                    System.out.println("Choix invalide.");
