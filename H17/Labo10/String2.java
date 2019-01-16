public class String2 {
    
    public static int s2 (String chaine){
        int nbEspaces = 0;
        for(int i = 0; i < chaine.length(); i++){
            if(chaine.charAt(i) == ' '){
                nbEspaces = nbEspaces + 1;
            }
        }
        return nbEspaces;
    }
    
    public static void main (String[] params) {
    
    } // main
    
} // String2
