public class TestEmp3 {

    public static String lireNom() throws ErrChaineNom {
        String nom;
        boolean trouve = false;

        System.out.print("Veuillez fournir le nom de l'employe en lettres majuscules: ");
        nom = Clavier.lireString();
        for (int i = 0; i < nom.length(); i++) {
            trouve = (trouve || nom.charAt(i) < 'A' || nom.charAt(i) > 'Z');
        }

        if (trouve) {
            throw new ErrChaineNom();
        } else {
            return nom;
        }
    }

    public static String lirePrenom() throws ErrChaineNom {
        String prenom;
        boolean trouve = false;

        System.out.print("Veuillez fournir le prenom de l'employe en lettres majuscules: ");
        prenom = Clavier.lireString();
        for (int i = 0; i < prenom.length(); i++) {
            trouve = (trouve || prenom.charAt(i) < 'A' || prenom.charAt(i) > 'Z');
        }

        if (trouve) {
            throw new ErrChaineNom();
        } else {
            return prenom;
        }
    }

    public static int lireNbAnnees() throws NumberFormatException {
        int nombre = 0;

        System.out.print("Veuillez fournir le nombre d'annees de l'employe: ");
        nombre = Clavier.lireInt();
        return nombre;
    }

    public static double lireSalaire() throws NumberFormatException {
        double salaire = 0.0;

        System.out.print("Veuillez fournir le salaire de l'employe: ");
        salaire = Clavier.lireDouble();
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
        String nom = "";
        String prenom = "";
        int nbAnnees = 0;
        double salaire = 0.0;
        String msg = "La chaine fournie n'est pas en lettres majuscules.";

        try {
            nom = lireNom();
        } catch (ErrChaineNom err) {
            System.out.println(msg);
        }

        try {
            prenom = lirePrenom();
        } catch (ErrChaineNom err) {
            System.out.println(msg);
        }

        try {
            nbAnnees = lireNbAnnees();
        } catch (NumberFormatException e) {
            System.out.println(msg);
        }

        try {
            salaire = lireSalaire();
        } catch (NumberFormatException e) {
            System.out.println(msg);
        }

        Employe e = new Employe(nom, prenom, nbAnnees, salaire);
        afficherEmploye(e);
    }
}

/*
 * La classe ci-dessous represente les exceptions declenchees lorsqu'une
 * chaine de caracteres contient des caracteres qui ne sont pas des 
 * lettres majuscules.
 */

class ErrChaineNom extends Exception {
}
 