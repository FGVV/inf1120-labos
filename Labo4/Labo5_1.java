public class Labo5_1 {
    public static void main ( String[] args ) {
        int n;
        int somme = 0;

        System.out.print ( "Entrez une suite de nombres entiers (-1 pour terminer) : " );
        n = Clavier.lireInt();
        while ( n != -1 ) {
            somme = somme + n;
            System.out.print ( "Entrez le prochain nombre: " );
            n = Clavier.lireInt();
        }

        System.out.println ( "La somme des nombres est " + somme );        
    } // main
} 