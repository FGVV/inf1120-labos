public class TestEmp1 {

    public static String lireNom() {
        String nom;

        System.out.print("Veuillez fournir le nom de l'employe: ");
        nom = Clavier.lireString();
        return nom;
    }

    public static String lirePrenom() {
        String prenom;

        System.out.print("Veuillez fournir le prenom de l'employe: ");
        prenom = Clavier.lireString();
        return prenom;   
    }

    public static int lireNbAnnees() {
        int nombre = 0;

        System.out.print("Entrez le nombre d'années: ");
        try {
            nombre = Clavier.lireInt();
        } catch (NumberFormatException e) {
            System.out.println("Le nombre n'est pas un int");
        } finally {
            return nombre;
        }
    }

    public static double lireSalaire() {
        double salaire = 0.0;

        System.out.print("Entrez le salaire: ");
        try {
            salaire = Clavier.lireDouble();
        } catch (NumberFormatException e) {
            System.out.println("Le nombre n'est pas un double.");
        } finally {
            return salaire;
        }
    }

    public static void afficherEmploye(Employe unEmploye) {        
        System.out.println("Nom: " + unEmploye.nomEmploye());
        System.out.println("Prenom: " + unEmploye.prenomEmploye());
        System.out.println("ID: " + unEmploye.numeroEmploye());
        System.out.println("Nombre d'annes: " + unEmploye.nbdAnneesEmploye());
        System.out.println("Salaire: " + unEmploye.salaireEmploye());
    }

    public static void main(String[] args) {
        String nom;
        String prenom;
        int nbAnnees;
        double salaire;

        nom = lireNom();
        prenom = lirePrenom();
        nbAnnees = lireNbAnnees();
        salaire = lireSalaire();

        Employe e = new Employe(nom, prenom, nbAnnees, salaire);
        afficherEmploye(e);
    }
}
    