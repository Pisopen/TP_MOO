/**
 * Created by Stephane on 24/05/2017.
 */
public class Document implements Comparable<Document>{
    protected int num_renseignement;
    protected String titre;

    public Document(int num_renseignement, String titre) {
        this.num_renseignement = num_renseignement;
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "Document{" +
                "num_renseignement=" + num_renseignement +
                ", titre='" + titre + '\'' +
                '}';
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    @Override
    public int compareTo(Document o) {
        return titre.compareToIgnoreCase(o.getTitre());
    }
}
