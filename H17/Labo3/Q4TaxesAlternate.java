
/**
 *  INF1120 - Labo 3 - Question #4 reponse alternative
 *
 *  @name Vincent Lirette
 */

import java.text.*; // pour utiliser DecimalFormat pour l'affichage de nombres reels

public class Q4TaxesAlternate {

    final static double TPS = 0.06;
    final static double TVQ = 0.075;

    public static DecimalFormat dec2 = new DecimalFormat ( "0.00" );  // pour l'affichage de reels avec deux decimales

    public static void main (String[] params) {
        double montant;
        double montantAvecTaxes;
        double totalFacture = 0;
        double tps = 0;
        double tvq = 0;
        char repOuiNon;

        System.out.print("Entrez un montant (0 pour terminer) : ");
        montant = Clavier.lireDouble();

        while (montant != 0){

            if (montant < 0) {
                System.out.println("ERREUR! LE montant ne peut pas etre negatif.");
            } else {

                System.out.print("   Est-ce que la TPS s'applique ('O', 'o', 'N', 'n') ? ");
                repOuiNon = Character.toUpperCase(Clavier.lireCharLn());

                if(repOuiNon == 'O'){
                    tps = montant * TPS;
                    System.out.println("   TPS = " + dec2.format(tps));
                }

                System.out.print("   Est-ce que la TVQ s'applique ('O', 'o', 'N', 'n') ? ");
                repOuiNon = Character.toUpperCase(Clavier.lireCharLn());

                if(repOuiNon == 'O'){
                    tvq = (montant + tps) * TVQ;
                    System.out.println("   TVQ = " + dec2.format(tvq));
                }

                montantAvecTaxes = montant + tps + tvq;
                totalFacture = totalFacture + montantAvecTaxes;

                System.out.println("   Montant total (avec taxe(s) si applicable) = " + dec2.format(montantAvecTaxes));

                tvq = 0;
                tps = 0;

            }

            System.out.print("Entrez un montant (0 pour terminer) : ");
            montant = Clavier.lireDouble();

        }

        System.out.print("   Totale de la facture = " + dec2.format(totalFacture));

    } // main

} // Q4TaxesAlternate
