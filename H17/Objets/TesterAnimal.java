public class TesterAnimal {

    public static void afficher ( Animal a ) {
        //System.out.println ( a.getNom() + " " + a.getSorte() + a.getRace() + a.getProprio());
        System.out.println(a.getNbAnimaux() + "\n");
    } // afficher
    
    public static void main ( String[] x ) {
        
        final String tirets = "---------------------";
        Animal unAnimal = new Animal();

        unAnimal.nom = "choupette";
        unAnimal.sorte = 1;
        unAnimal.race = "domestique";
        unAnimal.proprio = "Louise";
        unAnimal.afficher();
        System.out.println ( tirets );
        
        afficher(unAnimal);
        
        unAnimal = new Animal ( "marcelle", 2, "siamois", "Gilles" );
        unAnimal.afficher();
        System.out.println ( tirets );
        unAnimal.setNom ( "grizette" );
        unAnimal.afficher();
        System.out.println ( tirets );
        
        
        afficher(unAnimal);
        
    } // main
} // TesterAnimal
