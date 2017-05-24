/**
 * Created by Stephane on 24/05/2017.
 */
public class Main {
    public static void main(String[] args) {
        Etagere etagere=new Etagere(1);
        Document roman=new Roman(13,"Sol","Saul",150);
        Document revue=new Revue(15,"Dol");
        Document livre=new Livre(12,"Pol","Paul",150);
        etagere.add_doc(livre);
        etagere.add_doc(roman);
        etagere.add_doc(revue);
        System.out.println(etagere);
        /*etagere.search_auteur("Paul");
        etagere.search_titre("Pol");*/
    }
}
