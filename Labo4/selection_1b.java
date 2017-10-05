public class selection_1b {
    public static void main ( String arguments [] ) {

        char carac;

        System.out.print ( "Entrez un caractere : " );
        carac = Clavier.lireCharLn();

        switch ( carac ) {
            case 'A' :
                System.out.println ( "Vous avez choisi le menu " + carac );
                break;
            case 'B' :
                System.out.println ( "Vous avez choisi le menu " + carac );
                break;
            case 'Q' :
                System.out.println ( "Vous avez choisi le menu " + carac );
                break;
            default :
                System.out.println ( "Votre choix est invalide " );
                break;
        }
    }
}
