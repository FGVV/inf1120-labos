public class Solution2 {

    // Question #4
    public static int somme(int[] tab){
        int somme = 0;
        if(tab == null){
            somme = Integer.MIN_VALUE;
        }else if(tab.length != 0){
            for(int i = 0; i < tab.length; i++){
                somme = somme + tab[i];
            }
        }
        return somme;
    }
    
    public static void main (String[] params) {
    
    } // main
    
} // Solution2
