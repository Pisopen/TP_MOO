/**
 * Created by Stephane on 24/05/2017.
 */
public class Dictionnaire extends Document {
    public Dictionnaire(int num_renseignement, String titre) {
        super(num_renseignement, titre);
    }
    private String langue;

    public Dictionnaire(int num_renseignement, String titre, String langue) {
        super(num_renseignement, titre);
        this.langue = langue;
    }

    @Override
    public String toString() {
        return "Dictionnaire{" +
                "langue='" + langue + '\'' +
                ", num_renseignement=" + num_renseignement +
                ", titre='" + titre + '\'' +
                '}';
    }
}
