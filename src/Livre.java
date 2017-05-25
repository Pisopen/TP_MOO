/**
 * Created by Stephane on 24/05/2017.
 */
public class Livre extends Document implements Interface{
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

    @Override
    public String toString() {
        return "Livre{" +
                "auteur='" + auteur + '\'' +
                ", nbPage=" + nbPage +
                ", num_renseignement=" + num_renseignement +
                ", titre='" + titre + '\'' +
                '}';
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public int getNbPage() {
        return nbPage;
    }

    public void setNbPage(int nbPage) {
        this.nbPage = nbPage;
    }

    @Override
    public void Imprimer() {
        System.out.println("Imprime "+toString());
    }
}
