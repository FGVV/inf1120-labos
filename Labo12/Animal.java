public class Animal {

    private String nom;
    private int sorte; // 1 = chat, 2 = chien, 0 = inconnu
    private String race;
    private String proprio;

    private static int nbAnimaux = 0;

    public Animal (){
        nom = "";
        sorte = 0;
        race = "";
        proprio = "";
        nbAnimaux = nbAnimaux + 1;
    }

    public Animal (String nom, int laSorte, String laRace, String leProprio) {
        this.nom = nom;
        sorte = laSorte;
        race = laRace;
        proprio = leProprio;
        nbAnimaux = nbAnimaux + 1;
    }

    public String getNom () {
        return nom;
    }

    public int getSorte () {
        return sorte;
    }

    public String getRace () {
        return race;
    }

    public String getProprio () {
        return proprio;
    }

    public int getNbAnimaux(){
      return nbAnimaux;
    }

    public void setNom(String nom){
      this.nom = nom;
    }

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
    }
}
