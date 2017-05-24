/**
 * Created by Stephane on 24/05/2017.
 */
public class Revue extends Document {
    public Revue(int num_renseignement, String titre) {
        super(num_renseignement, titre);
    }
    private int mois;
    private int annee;

    public Revue(int num_renseignement, String titre, int mois, int annee) {
        super(num_renseignement, titre);
        this.mois = mois;
        this.annee = annee;
    }

    @Override
    public String toString() {
        return "Revue{" +
                "mois=" + mois +
                ", annee=" + annee +
                ", num_renseignement=" + num_renseignement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
