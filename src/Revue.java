/**
 * Created by Stephane on 24/05/2017.
 */
public class Revue extends Document {
    public Revue(int num_renseignement, String titre) {
        super(num_renseignement, titre);
    }
    private int mois;
    private int annee;

    @Override
    public String toString() {
        return "Revue{" +
                "mois=" + mois +
                ", annee=" + annee +
                '}';
    }
}
