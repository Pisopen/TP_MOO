/**
 * Created by Stephane on 24/05/2017.
 */
public class Dictionnaire extends Document {
    public Dictionnaire(int num_renseignement, String titre) {
        super(num_renseignement, titre);
    }

    @Override
    public String toString() {
        return "Dictionnaire{" +
                "langue='" + langue + '\'' +
                '}';
    }

    private String langue;

}
