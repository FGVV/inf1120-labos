public class Math2 {    
    public static double mathQ2 ( double taux, double montant, double periode, double duree ) {
        double facEquivalent;
        double nbTotalVersements;
        double versParMois;

        facEquivalent = Math.pow (( 1 + taux / 200 ), 1.0 / 6);
        nbTotalVersements = 12 * periode;
        versParMois = montant * Math.pow ( facEquivalent, nbTotalVersements ) * ( facEquivalent - 1 ) / ( Math.pow ( facEquivalent, nbTotalVersements ) - 1 ) ;
        return versParMois;
    }
    
    public static void main (String[] params) {
    
    } // main
    
} // Math2
