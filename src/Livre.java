/**
 * Created by Stephane on 24/05/2017.
 */
public class Livre extends Document {
    public Livre(int num_renseignement, String titre) {
        super(num_renseignement, titre);
    }
    protected String auteur;
    protected int nbPage;

    public Livre(int num_renseignement, String titre, String auteur, int nbPage) {
        super(num_renseignement, titre);
        this.auteur = auteur;
        this.nbPage = nbPage;
    }
}
