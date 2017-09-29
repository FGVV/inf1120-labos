public class Labo3_Q3BissextileValidation {

    public static void main (String[] params) {

        int annee;

        System.out.print("Entrez une annee : ");
        annee = Clavier.lireInt();

        while(annee < 0) {
            System.out.println("ERREUR. Les annees negatives sont refusees!");
            System.out.print("Entrez une annee : ");
            annee = Clavier.lireInt();
        }

        if ((annee % 4 == 0 && annee % 100 != 0) || annee % 400 == 0) {
            System.out.print("L'annee entree est bissextile.");
        } else {
            System.out.print("L'annee entree n'est PAS bissextile.");
        }

    } // main

} // Q3BissextileValidation
