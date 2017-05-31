/**
 * Created by Stephane on 24/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Etagere etagere = new Etagere(10);
        Bibliotheque my_bibli= new Bibliotheque();
        my_bibli.ajout_etage(etagere);
        Document roman = new Roman(13, "Sol", "Saul", 150, "EMI");
        Document revue = new Revue(12, "Dol", 05, 2016);
        Document manuel = new Manuel(12, "Pol", "Paul", 150,"CM2");
        etagere.ajout_doc(manuel); //ajout manuel
        etagere.ajout_doc(roman); //ajout roman
        etagere.ajout_doc(revue); //ajout revue
        etagere.Imprimer(); //test impression
        etagere.triEtagere(); //tri etagere
        System.out.println(etagere);
        //System.out.println(etagere.rechercher_auteur("Saul")); //recherche auteur
        //System.out.println(etagere.rechercher_titre("Dol")); //recherche titre
    }
}