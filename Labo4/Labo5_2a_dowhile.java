public class Labo5_2a_dowhile {    
    public static void main ( String[] args) {   
        int n;
        double somme;
        int i;
        
        System.out.print( "Entrez un nombre > 0 : " );
        n = Clavier.lireInt();
        if ( n <= 0 ) {
            System.out.println( "Le nombre est rejete." );
        } else {
            somme = 0;
            i = 1;        
            do {
                somme = somme + 1.0 / i;
                i = i + 1;
            }
            while ( i <= n );
            
            System.out.println ("H(" + n + ")= " + somme);            
        }        
    } // main   
}