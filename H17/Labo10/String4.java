public class String4 {

    public static boolean stringQ4 ( String chaine1, String chaine2 ) {
        int pos1;
        int pos2;
        boolean reponse;

        if ( chaine2.length() == 0 ) {
            reponse = true;
        } else if ( chaine1.length() == 0 ) {
            reponse = false;
        } else {
            pos1 = 0; // de positionner au debut de chaine1
            pos2 = 0; // de positionner au debut de chaine2            
            while ( pos1 < chaine1.length() && pos2 < chaine2.length() ) { // tant qu'il reste des caracteres a verifier
                if ( chaine1.charAt ( pos1 ) == chaine2.charAt ( pos2 ) ) {
                    pos2 = pos2 + 1;
                }
                pos1 = pos1 + 1;
            }
            reponse = pos2 == chaine2.length();
        }
        return reponse;
    }

    public static void main (String[] params) {
        String toto = "";
        String titi = "";
        boolean rep;
        System.out.println("Toto?: ");
        toto = Clavier.lireString();
        System.out.print("Titi?: ");
        titi = Clavier.lireString();
        rep = stringQ4(toto, titi);

        System.out.println(rep);
    }

}
