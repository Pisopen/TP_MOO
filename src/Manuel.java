/**
 * Created by Stephane on 24/05/2017.
 */
public class Manuel extends Livre {
    public Manuel(int num_renseignement, String titre, String auteur, int nbPage) {
        super(num_renseignement, titre, auteur, nbPage);
    }
    private String niveau;

    public Manuel(int num_renseignement, String titre, String auteur, int nbPage, String niveau) {
        super(num_renseignement, titre, auteur, nbPage);
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Manuel{" +
                "niveau='" + niveau + '\'' +
                ", auteur='" + auteur + '\'' +
                ", nbPage=" + nbPage +
                ", num_renseignement=" + num_renseignement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
