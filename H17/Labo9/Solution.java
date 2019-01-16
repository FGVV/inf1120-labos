public class Solution {
    
    //Question #3
    public static void afficher(int[] tab){
        if(tab == null){
            System.out.println("tableau null");
        }else if(tab.length == 0){
            System.out.println("tableau vide");
        }else {
            for(int i = 0; i < tab.length; i++){
                System.out.println("Element " + i + " = " + tab[i]);
            }
        }
    }
    
    public static void main (String[] params) {
    
    } // main
    
} // Solution
