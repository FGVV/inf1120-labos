public class Labo6_1_2 {
    public static void harmonique(int n){
        double somme = 0;

        if (n <= 0){
            System.out.println("Valeur de n non valide");
        } else {
            //System.out.print("H(n)= ");
            for (int i = 1; i <= n; i++){
                somme = somme + 1.0 / i;
                //System.out.print(somme + " + ");
            }
            System.out.println("\nH(" + n + ") = " + somme);
        }
    }

    public static void main (String[] params) {
        int n = 5;
        harmonique(n);
    }
}
