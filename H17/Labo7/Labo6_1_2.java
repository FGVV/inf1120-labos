
/**
 *  INF1120 - Labo 
 *  
 *  @name Vincent Lirette
 */
public class Labo6_1_2 {
    public static void harmonique(int toto){
        double somme = 0;
        
        if (toto <= 0){
            System.out.println("Valeur de toto non valide");
        } else {
            //System.out.print("H(n)= ");
            for (int i = 1; i <= toto; i++){
                somme = somme + 1.0 / i;
                //System.out.print(somme + " + ");
            }
            
            System.out.println("\nH(" + toto + ") = " + somme);
        }
    }
    
    public static int saisirEtValiderNombre(){
        int x;
        
        System.out.print("Entrez un nombre entier > 0: ");
        x = Clavier.lireInt();
        
        while (x <= 0){
            System.out.println("Le nombre doit etre superieur a 0.");
            System.out.print("Entrez un nombre entier > 0: ");
            x = Clavier.lireInt();
        }
        
        return x;
    }
    
    public static void main (String[] params) {
        int n = saisirEtValiderNombre();
        harmonique(n);
    } // main
    
} // Labo6_1_2
