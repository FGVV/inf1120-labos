public class String4 {

    public static boolean s4 ( String chaine1, String chaine2 ) {
        int pos1 = 0;
        int pos2 = 0;
        boolean reponse;

        if (chaine2.length() == 0) {
            reponse = true;
        } else if (chaine1.length() == 0) {
            reponse = false;
        } else {           
            while (pos1 < chaine1.length() && pos2 < chaine2.length()) {
                if (chaine1.charAt(pos1) == chaine2.charAt(pos2)) {
                    pos2 = pos2 + 1;
                }
                pos1 = pos1 + 1;
            }
            reponse = pos2 == chaine2.length();
        }
        return reponse;
    }

    public static void main (String[] params) {
        String c1 = "";
        String c2 = "";
        boolean rep;
        System.out.println("c1?: ");
        c1 = Clavier.lireString();
        System.out.print("c2?: ");
        c2 = Clavier.lireString();
        rep = s4(c1, c2);

        System.out.println(rep);
    }

}
