
/**
 *  INF1120 - Labo
 *
 *  @name Vincent Lirette
 */
public class Sol_labo10 {

    final static int INT_MIN =  Integer.MIN_VALUE;

    public static void main (String[] params) {

    } // main

    //Question 3
    public static void afficher(int[] tab){
        if(tab == null){
            System.out.println("Tableau null");
        } else if(tab.length == 0){
            System.out.println("Tableau vide");
        } else {
            for(int i=0; i<tab.length; i++){
                System.out.println("Element " + i + " = " + tab[i]);
            }
        }
    }               

    //Question 4
    public static int somme(int[] tab){
        int somme = 0;

        if (tab == null){
            somme = INT_MIN;
        }else if (tab.length != 0){
            for(int i=0;i<tab.length;i++){
                somme = somme + tab[i];
            }
        }
        return somme;
    }

    // Question 5
    public static boolean superieurAzero(int[] tab){
        int i = 0;
        boolean superieur = true;
        if (tab != null){
            while(i < tab.length && superieur){
                if (tab[i] < 0){
                    superieur = false;
                } else{
                    i = i + 1;
                }
            }
        }
        return superieur;
    } 

    // Question 6
    public static int maximum (int[] tab){
        int max = INT_MIN;
        if (tab != null && tab.length !=0){
            max = tab[0];
            for(int i=0; i<tab.length; i++){
                if (tab[i] > max){
                    max = tab[i];
                }
            } // End while
        }
        return max;
    }

    // Question 7
    public static int []copie (int[] tab){
        int []tabCopie = null;

        if (tab!= null){
            tabCopie = new int[tab.length];
            for(int i = 0; i < tab.length; i++){
                tabCopie[i] = tab[i];
            }
        }                         
        return tabCopie;
    }

    // Question 9
    public static int[] epure (int[] tab){        
        int position = 0;
        int tailleTabEpure = 0;
        int [] tabEpure = null;

        if (tab != null){
            for(int i=0; i<tab.length; i++){
                if (tab[i] != 0){
                    tailleTabEpure = tailleTabEpure + 1;
                }
            }
            tabEpure = new int[tailleTabEpure];
            for(int i=0; i<tab.length; i++){
                if (tab[i] != 0){
                    tabEpure[position] = tab[i];
                    position = position + 1;
                }
            }
        }
        return tabEpure;
    }

    // Question 10
    public static int[] suite (int a, int b){       
        int tabSuite[] = {};
        int tailleTabSuite;

        if (a <= b ){
            tailleTabSuite =  b - a + 1;
            
            tabSuite = new int[tailleTabSuite];           
            for(int i=0; i < tailleTabSuite; i++){
                tabSuite[i] = a + i;
            }        
        }                  
        return tabSuite;
    }

    //Question 12
    public static void afficheEtoiles (int [] tab){
        if (tab == null){
            System.out.println("Tableau null");
        } else {
            for(int i = 0; i < tab.length; i++){
                //on entre pas dans le for si le nombre est <= 0
                for (int j = 1; j <= tab[i]; j++){
                    System.out.print('*');
                }
                System.out.print("\n");
            }
        }
    }

    //Question 13
    public static void afficheEtoilesNombre (int [] tab){
        int max = 0;
        int espaces;
        if (tab == null){
            System.out.println("Tableau null");
        } else {
            for(int i = 0; i < tab.length; i++){
                if(max < tab[i]){
                    max = tab[i];
                }
            }

            for(int i = 0; i < tab.length; i++){
                if (tab[i] < 0){
                    espaces = max + 1;
                } else {
                    espaces = max - tab[i] + 1;
                }
                //on entre pas dans le for si le nombre est <= 0
                for (int j = 1; j <= tab[i]; j++){                    
                    System.out.print('*');
                }

                for (int k = 1; k <= espaces; k++){
                    System.out.print(' ');
                }
                System.out.println("(" + tab[i] + ")");
            }
        }
    }

    //Question 14
    public static void afficheEtoilesVert (int [] tab){
        int max = 0;
        if (tab == null){
            System.out.println("Tableau null");
        } else {
            for(int i = 0; i < tab.length; i++){
                if(max < tab[i]){
                    max = tab[i];
                }
            }

            for(int i = max; i >= 1; i--){
                for (int j = 0; j < tab.length; j++){
                    if(tab [j] < i){
                        System.out.print(' ');
                    } else {
                        System.out.print('*');
                    }
                }
                System.out.println();
            }
        }
    }
}
