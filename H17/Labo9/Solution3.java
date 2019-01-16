public class Solution3 {
    
    // Question #5
    public static boolean superieurAZero(int[] tab){
        boolean supAZero = true;
        int i = 0;
        if(tab != null){
            while(i < tab.length && supAZero){
                if(tab[i] < 0){
                    supAZero = false;
                } else {
                    i = i + 1;
                }
            }
        }
        return supAZero;
    }
    
    public static void main (String[] params) {
    
    } // main
    
} // Solution3
