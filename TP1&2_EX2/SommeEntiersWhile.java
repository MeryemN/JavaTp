public class SommeEntiersWhile {
    public static void main(String[] args) {
        int somme = 0;
        int i = 1;
        while (i <= 10) {
            somme += i;
            i++;
        }
        System.out.println("La somme des entiers de 1 à 10 est : " + somme);
    }
}
