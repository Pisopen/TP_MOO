/**
 * Created by Stephane on 24/05/2017.
 */
public class Roman extends Livre {
    public Roman(int num_renseignement, String titre, String auteur, int nbPage) {
        super(num_renseignement, titre, auteur, nbPage);
    }
    private String prix;

    @Override
    public String toString() {
        return "Roman{" +
                "prix='" + prix + '\'' +
                '}';
    }
}
