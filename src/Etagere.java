import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Stephane on 24/05/2017.
 */
public class Etagere {
    private ArrayList<Document> etage_1;
    private int taille;

    public Etagere(int taille) {
        etage_1 = new ArrayList<Document>();
        this.taille = taille;
    }

    public void add_doc(Document document) {
        if (taille >= etage_1.size()) {
            etage_1.add(document);
        } else
            System.out.println("etagere pleine");
    }

    public Document search_titre(String text,ArrayList<Document> etagere) {
        for (int i = 0; i < etage_1.size(); i++)
            if (etagere.get(i).getTitre() == text) {
                return (etagere.get(i));
            } else
                System.out.println("doc no exist");
        return null;
    }


    public Document search_auteur(String text) {
        for (int i = 0; i < etage_1.size(); i++) {
            if (etage_1.get(i) instanceof Livre) {
                Livre livre = (Livre) etage_1.get(i);
                if (livre.getAuteur() == text) {
                    return etage_1.get(i);
                } else
                    System.out.println("doc no exist");
            }
        }
        return null;
    }

    public void triEtagere() {
        Collections.sort(etage_1);
    }

    @Override
    public String toString() {
        return "Etagere{" + etage_1 +
                '}';
    }
}
