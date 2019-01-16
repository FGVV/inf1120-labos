public class Labo6_2 {

    public static void afficherNfois ( int nbFois, char carac ) {

        /* antecedent : -
         * consequent : Affiche nbFois le caractere carac a la console.
         *              Si nbFois <= 0, la methode n'affiche rien.
         */

        for ( int i = 1 ; i <= nbFois ; i = i + 1 ) {
            System.out.print ( carac + " ");
        }

    } // afficherNfois

    public static void afficherVide ( int largeur ) {

        /* antecedent : -
         * consequent : Affiche a la console une ligne vide : *       *.
         *              Le nombre d'espaces entre les deux * est largeur - 2.
         *              Si largeur = 2, affiche **
         *              Si largeur <= 1, affiche *
         */

        afficherNfois ( 1, '*' );
        afficherNfois ( largeur - 2, ' ' );
        if ( largeur > 1 ) {
            afficherNfois ( 1, '*' );
        }

    } // afficherVide

    public static void afficherRectangle ( int largeur, int hauteur ) {

        /* antecedent : -
         * consequent : Affiche a la console un rectangle de hauteur hauteur et de largeur largeur.
         *              Si largeur <= 0 et/ou hauteur <= 0, la methode mentionne que les parametres
         *              ne sont pas valide puis termine son execution.
         */

        if ( largeur <= 0 || hauteur <= 0 ) {

            System.out.println ( "*** largeur et/ou hauteur invalide(s)." );

        } else {

            // Afficher la ligne du haut

            afficherNfois ( largeur, '*' );
            System.out.println ();

            // Afficher le milieu

            for ( int ligne = 2; ligne < hauteur; ligne = ligne + 1 ) {
                afficherVide ( largeur );
                System.out.println ();
            } // for

            // Afficher la ligne du bas s'il y a lieu ( hauteur > 1 )

            if ( hauteur > 1 ) {
                afficherNfois ( largeur, '*' );
                System.out.println ();
            } // if hauteur > 1

        } // if largeur et/ou hauteur invalide(s)

    } // afficherRectangle

    public static void afficherCarre  ( int cote ) { 

        /* antecedent : -
         * consequent : Affiche a la console un carre de cote cote.
         *              Si cote <= 0, la methode mentionne que les parametres
         *              ne sont pas valide puis termine son execution.
         */

        if ( cote <= 0 ) {

            System.out.println ( "*** cote invalide." );

        } else {

            afficherRectangle ( cote, cote );
        }

    } // afficherCarre 

    public static void afficherTriangleIsoGauche  ( int hauteur ) { 
        /* antecedent : -
         * consequent : Affiche a la console un triangle rectangle isocele dont l'angle droit est en bas a gauche,
         *              dont les deux cotes egaux mesurent hauteur.
         *              Si hauteur <= 0, la methode mentionne que le parametre
         *              n'est pas valide puis termine son execution.
         */

        if ( hauteur <= 0 ) {

            System.out.println ( "*** hauteur invalide." );

        } else {

            System.out.println ( "*" );

            for ( int i = 2; i < hauteur; i = i + 1 ) {
                afficherVide ( i );
                System.out.println ( );  
            } // for

            if ( hauteur > 1 ) {
                afficherNfois ( hauteur, '*' );
                System.out.println ( ); 
            }
        }

    } // afficherTriangleIsoGauche 

    public static void afficherTriangleIsoDroit   ( int hauteur ) { 

        /* antecedent : -
         * consequent : Affiche a la console un triangle rectangle isocele dont l'angle droit est en bas a droite,
         *              dont les deux cotes egaux mesurent hauteur.
         *              Si hauteur <= 0, la methode mentionne que le parametre
         *              n'est pas valide puis termine son execution.
         */

        if ( hauteur <= 0 ) {

            System.out.println ( "*** hauteur invalide." );

        } else {

            afficherNfois ( hauteur - 1, ' ' );
            System.out.println ( "*" );

            for ( int i = 2; i < hauteur; i = i + 1 ) {
                afficherNfois ( hauteur - i, ' ' );
                afficherVide ( i );
                System.out.println ( );  
            } // for

            if ( hauteur > 1 ) {
                afficherNfois ( hauteur, '*' );
                System.out.println ( ); 
            }
        }

    } // afficherTriangleIsoDroit  

    public static void afficherTriangleEqui   ( int hauteur ) { 

        /* antecedent : -
         * consequent : Affiche a la console un triangle (pseudo)equilateral,
         *              de hauteur hauteur.
         *              Si hauteur <= 0, la methode mentionne que le parametre
         *              n'est pas valide puis termine son execution.
         */

        if ( hauteur <= 0 ) {

            System.out.println ( "*** hauteur invalide." );

        } else {

            afficherNfois ( hauteur - 1, ' ' );
            System.out.println ( "*" );

            for ( int i = 2; i < hauteur; i = i + 1 ) {
                afficherNfois ( hauteur - i, ' ' );
                afficherVide ( 2 * i - 1 );
                System.out.println ( );  
            } // for

            if ( hauteur > 1 ) {
                afficherNfois ( 2 * hauteur - 1, '*' );
                System.out.println ( );  
            }
        }

    } // afficherTriangleEqui  

} // Labo6_2