/**
 * Created by Stephane on 24/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Etagere etagere = new Etagere(10);
        Document roman = new Roman(13, "Sol", "Saul", 150, "EMI");
        Document revue = new Revue(12, "Dol", 05, 2016);
        Document livre = new Livre(12, "Pol", "Paul", 150);
        //Interface livre1=new Livre(12,"lol","teemo",150);
        //livre1.Imprimer();
        etagere.add_doc(livre); //ajout livre
        etagere.add_doc(roman); //ajout roman
        etagere.add_doc(revue); //ajout revue
        etagere.Imprimer(); //test impression
        etagere.triEtagere(); //tri etagere
        System.out.println(etagere.search_auteur("Saul")); //recherche auteur
        System.out.println(etagere.search_titre("Dol")); //recherche titre
    }
}
