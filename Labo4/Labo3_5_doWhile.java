public class Labo3_5_doWhile {
    
    public static void main (String[] params) {
        int n;
        int i = 0;
        
        System.out.print("Entrez un nombre: ");
        n = Clavier.lireInt();
        
        System.out.println("\nSolution avec la boucle do..while");
        do{
            if(i % 2 != 0){
                System.out.print(i + " ");
                n = n - 1;
            }
            i = i + 1;
        }while(n > 0);
    } // main
    
} // Labo3_5_doWhile
