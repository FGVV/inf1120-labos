public class Solution4 {
    public static int maximum(int[] tab){
        int maximum = Integer.MIN_VALUE;
        if(tab == null || tab.length == 0){
            maximum = Integer.MIN_VALUE;
        } else {
            for(int i = 0; i < tab.length; i++){
                if(tab[i] > maximum){
                    maximum = tab[i];
                }
            }
        }
        return maximum;
    }
    
    public static void main (String[] params) {
    
    } // main
    
} // Solution4
