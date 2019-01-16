public class Labo6_1_3 {

    public static void harmonique ( int m ) {
    
        double somme;
     
        somme = 0;
        
        for ( int i = 1; i <= m; i = i + 1 ) {
            somme = somme + 1.0 / i;
        }
        
        System.out.println ( "H(" + m + ") = " + somme );
        
    } // harmonique

    public static void main ( String [] arguments ) {
    
        for ( int i = 1; i <= 10; i = i + 1 ) {
            harmonique ( i );
        }
        
    } // main
    
} // Labo6_1_3