public class Labo7 {

    public static double mathQ1 ( double a, double b, double c ) {
        double discriminant = (b * b) - (4 * a * c);
        return ( -b + Math.sqrt ( discriminant ) ) / (2 * a);
    } // mathQ1

    public static double mathQ2 ( double taux, double montant, double periode, double duree ) {
        double facEquivalent;
        double nbTotalVersements;
        double versParMois;

        facEquivalent = Math.pow (( 1 + taux / 200 ), 1.0 / 6);
        nbTotalVersements = 12 * periode;
        versParMois = montant * Math.pow ( facEquivalent, nbTotalVersements ) * ( facEquivalent - 1 ) / ( Math.pow ( facEquivalent, nbTotalVersements ) - 1 ) ;
        return versParMois;
    } // mathQ2

    public static boolean stringQ1 ( String chaine ) {
        boolean reponse = false;
        //         if ( chaine.charAt ( 0 ) >= 'A' && chaine.charAt ( 0 ) <= 'Z' ) {
        //             reponse = true;
        //         }
        //         return reponse;
        // ou bien 
        return chaine.length () > 0 && chaine.charAt ( 0 ) >= 'A' && chaine.charAt ( 0 ) <= 'Z';
    } // stringQ1

    public static int stringQ2 ( String chaine ) {
        int reponse = 0;
        for ( int i = 0; i < chaine.length (); i++ ) {
            if ( chaine.charAt ( i ) == ' ' ) {
                reponse = reponse + 1;
            }
        }
        return reponse;
    } // stringQ2

    public static String stringQ3 ( String chaine ) {
        String reponse = "";
        for ( int i = 0; i < chaine.length (); i++ ) {
            if ( chaine.charAt ( i ) != 'e' ) {
                reponse = reponse + chaine.charAt ( i );
            }
        }
        return reponse;
    } // stringQ3

    public static boolean stringQ4 ( String chaine1, String chaine2 ) {
        int pos1;
        int pos2;
        boolean reponse;

        if ( chaine2.length() == 0 ) {
            // la chaine vide fait partie de toute chaine
            reponse = true;
        } else if ( chaine1.length() == 0 ) {
            // a part la chaine vide, la chaine vide ne contient aucune chaine
            reponse = false;
        } else {
            // chaine1 et chaine2 contiennent au moins un caractere
            pos1 = 0; // de positionner au debut de chaine1
            pos2 = 0; // de positionner au debut de chaine2            
            while ( pos1 < chaine1.length() && pos2 < chaine2.length() ) { // tant qu'il reste des caracteres a verifier
                if ( chaine1.charAt ( pos1 ) == chaine2.charAt ( pos2 ) ) {
                    // avancer dans chaine2
                    pos2 = pos2 + 1;
                }
                // avancer dans chaine1
                pos1 = pos1 + 1;
            }
            reponse = pos2 == chaine2.length(); // vrai si on a trouve tous les caracteres de chaine2 dans chaine1
        }
        return reponse;
    } // stringQ4
}
