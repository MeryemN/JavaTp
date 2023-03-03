public class SommeEntiersDoWhile {
    public static void main(String[] args) {
        int somme = 0;
        int i = 1;
        do {
            somme += i;
            i++;
        } while (i <= 10);
        System.out.println("La somme des entiers de 1 à 10 est : " + somme);
    }
}
