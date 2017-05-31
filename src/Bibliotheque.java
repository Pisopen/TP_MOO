import java.util.ArrayList;

/**
 * Created by Stephane on 24/05/2017.
 */
public class Bibliotheque {
    private int nbEtage;
    private ArrayList<Etagere> biblio =new ArrayList<Etagere>();

    public void add_etage(Etagere etage){
        biblio.add(etage);
    }
}
