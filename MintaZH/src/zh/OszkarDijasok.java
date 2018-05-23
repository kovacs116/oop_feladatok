package zh;
import java.util.*;

public class OszkarDijasok extends Model {

    private int nyeresEve;

    public OszkarDijasok(String cim, String kategoria, String producer, int ev, String foszereplo, int nyeresEve) throws Exception {
        super(cim, kategoria, producer, ev, foszereplo);
        this.nyeresEve = nyeresEve;

        if (nyeresEve < ev){
            throw new Exception();
        }
    }
    @Override
    public String toString() {
        return "OszkarDijasok{" +
                "nyeresEve=" + nyeresEve +
                ", cim='" + cim + '\'' +
                ", kategoria='" + kategoria + '\'' +
                ", producer='" + producer + '\'' +
                ", ev=" + ev +
                ", foszereplo='" + foszereplo + '\'' +
                '}';
    }
}
