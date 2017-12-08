public class TestEmp2 {
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
        String messagedInvite = "Veuillez fournir le nombre d'annees de l'employe: ";
        int nombre = 0;
        boolean valide = false;

        System.out.print(messagedInvite);
        do {
            try {
                nombre = Clavier.lireInt();
                valide = true;
            } catch (NumberFormatException e) {
                System.out.println("Le nombre fourni n'est pas de type int.");
                System.out.print(messagedInvite);
            }
        } while (!valide);

        return nombre; 
    }

    public static double lireSalaire() {
        String messagedInvite = "Veuillez fournir le salaire de l'employe: ";
        double salaire = 0.0;
        boolean valide = false;

        System.out.print(messagedInvite);
        while(!valide){
            try {
                salaire = Clavier.lireInt();
                valide = true;
            } catch (NumberFormatException e) {
                System.out.println("Le nombre fourni n'est pas de type int.");
                System.out.print(messagedInvite);
            }
        }

        return salaire; 
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
 