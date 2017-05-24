import java.util.ArrayList;

/**
 * Created by Stephane on 24/05/2017.
 */
public class Etagere {
    private ArrayList<Document> etage_1=new ArrayList<Document>();
    private int taille;

    public Etagere(ArrayList<Document> etage_1, int taille) {
        this.etage_1 = etage_1;
        this.taille = taille;
    }
    public Etagere(){
    }
}
