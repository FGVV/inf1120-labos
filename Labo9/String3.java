public class String3 {
    
    public static String supprimerE (String chaine){
        String reponse = "";
        for(int i = 0; i < chaine.length(); i++){
            if(chaine.charAt(i) != 'e'){
                reponse = reponse + chaine.charAt(i);
            }
        }
        return reponse;
    }
    
    public static void main (String[] params) {
        String chaine = "ete";
        String nouvelleChaine = supprimerE(chaine);
        System.out.print(nouvelleChaine);
    } // main
    
} // String3
