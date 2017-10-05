public class Labo5_2a_while {    
    public static void main ( String[] args ) {
        int n;
        double somme;
        int i;
        
        System.out.print ( "Entrez un nombre > 0 : " );
        n = Clavier.lireInt();
        if ( n <= 0 ) {
            System.out.println ( "Le nombre est rejete." );
        } else {
            somme = 1;
            i = 2;
            while ( i <= n ) {
                somme = somme + 1.0 / i;
                i = i + 1;
            }
            
            System.out.println ( "H(" + n + ")= " + somme);
        }      
    } // main   
}