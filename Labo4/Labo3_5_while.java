public class Labo3_5_while {

    public static void main (String[] params) {
        int n;
        int i = 0;

        System.out.print("Entrez un nombre: ");
        n = Clavier.lireInt();

        System.out.println("\nSolution avec la boucle while");
        while( n > 0){
            if(i % 2 != 0){
                System.out.print(i + " ");
                n = n - 1;
            }
            i = i + 1;
        }
    } // main

} // Labo3_5
