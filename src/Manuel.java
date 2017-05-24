/**
 * Created by Stephane on 24/05/2017.
 */
public class Manuel extends Livre {
    public Manuel(int num_renseignement, String titre, String auteur, int nbPage) {
        super(num_renseignement, titre, auteur, nbPage);
    }
    private String niveau;

    @Override
    public String toString() {
        return "Manuel{" +
                "niveau='" + niveau + '\'' +
                '}';
    }
}
