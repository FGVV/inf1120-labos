public class Animal {

    private String nom; // nom de l'animal
    private int sorte; // 1 = chat, 2 = chien, 0 = inconnu
    private String race;
    private String proprio;

    private static int nbAnimaux = 0;

    public Animal ( ) {
        nom = "";
        sorte = 0;
        race = "";
        proprio = "";
        nbAnimaux = nbAnimaux + 1;
    } // Animal

    public Animal ( String nom, int laSorte, String laRace, String leProprio ) {
        this.nom = nom;
        sorte = laSorte;
        race = laRace;
        proprio = leProprio;
        nbAnimaux = nbAnimaux + 1;
    } // Animal

    public String getProprio(){
        return proprio;
    }

    public void setNom(String nom){
        this.nom = nom;
    }    

    public void setNom ( String nouveauNom ) {
        nom = nouveauNom;
    } // modifierNom

    public int getNbAnimaux(){
        return nbAnimaux;
    }

    public String getNom () {
        return nom;
    } // obtenirNom

    public int getSorte () {
        return sorte;
    } // obtenirSorte

    public String getRace () {
        return race;
    } // obtenirRace

    public String getProprio () {
        return proprio;
    } // obtenirProprio

    public void afficher () {
        System.out.println ( "nom : " + nom );
        System.out.print ( "sorte : " );
        if (sorte == 1) {
            System.out.println ( "chat" );
        } else if (sorte == 2) {
            System.out.println ( "chien" );
        } else {
            System.out.println ( "inconnu" );
        }
        System.out.println ( "race : " + race );
        System.out.println ( "proprio : " + proprio );
    } // afficher
} // Animal
