
/**
 *  INF1120 - Labo 3 - Question #1
 *
 *  @name Vincent Lirette
 */

public class Bissextile {

    public static void main (String[] params) {

        int annee;

        System.out.print("Entrez une annee : ");
        annee = Clavier.lireInt();

        if (annee < 0) {
            System.out.print("Annee negative refusee.");
        } else if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0)) {
            System.out.print("L'annee entree est bissextile.");
        } else {
            System.out.print("L'annee entree n'est PAS bissextile.");
        }

    } // main

} // Bissextile
