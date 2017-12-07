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

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setSorte(int sorte){
        if(sorte >=0 && sorte <= 3){
            this.sorte = sorte;
        }
    }

    public void setRace(String race){
        this.race = race;
    }

    public void setProprio(String proprio){
        this.proprio = proprio;
    }

    public void afficher () {
        System.out.println ( "nom : " + nom );
        System.out.print ( "sorte : " + sorte);
        System.out.println ( "race : " + race );
        System.out.println ( "proprio : " + proprio );
    }
}
