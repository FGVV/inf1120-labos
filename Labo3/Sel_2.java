public class Sel_2 {
    
    public static void main (String[] params) {
        int nombre;
        
        System.out.print("Entrez nombre: ");
        nombre = Clavier.lireInt();
        
        if (nombre >= 0){
            if(nombre % 2 == 0){
                System.out.println(nombre + " est une nombre pair");
                if (nombre % 10 == 0){
                    System.out.println(nombre + " est un nombre multiple de 10");
                }
            } else {
                System.out.println(nombre + " est un nombre impair");
            }
            
            if (nombre < 10){
                System.out.println(nombre + " est un nombre a 1 chiffre");
            } else if (nombre < 100){
                System.out.println(nombre + " est un nombre a deux chiffres");
            } else {
                System.out.print(nombre + " est un nombre de trois chiffres ou plus");
            }
        } else {
            System.out.println("Nombre refuse.");
        }
    } // main
    
} // Sel_2
