public class TestMatrice {

    public static void main(String[] args) {

        // Création et initialisation de la matrice contenant deux tableaux de 2 et 3 points respectivement
        Point[][] matrice = new Point[2][];
        matrice[0] = new Point[2];
        matrice[1] = new Point[3];

        // Création de 5 objets de type "Point"
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        Point point3 = new Point(5, 6);
        Point point4 = new Point(7, 8);
        Point point5 = new Point(9, 10);

        // Affectation des 5 objets aux 5 éléments de la matrice
        matrice[0][0] = point1;
        matrice[0][1] = point2;
        matrice[1][0] = point3;
        matrice[1][1] = point4;
        matrice[1][2] = point5;

        // Affichage de la matrice
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
