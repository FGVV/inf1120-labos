public class String3 {
    
    public static String s3 (String chaine){
        String reponse = "";
        for(int i = 0; i < chaine.length(); i++){
            if(chaine.charAt(i) != 'e'){
                reponse = reponse + chaine.charAt(i);
            }
        }
        return reponse;
    }
    
    public static void main (String[] params) {
        String texte = "Allo";
        char carac = texte.charAt(0);
    } // main
    
} // String3
