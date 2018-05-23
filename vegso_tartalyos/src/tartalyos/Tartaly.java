package tartalyos;

public class Tartaly extends Tarolo {

    private double nyomas;

    public Tartaly(int terfogat, double nyomas) {
        super(terfogat);
        this.nyomas = nyomas;
    }

    @Override
    public boolean veszelyesE() {
        return nyomas*getTerfogat() > 100;
    }

    @Override
    public String toString() {
        return "Tartaly{" +
                "nyomas=" + nyomas +
                "terfogat=" + getTerfogat() +
                "veszelyes=" + veszelyesE() +
                '}';
    }

    protected Tartaly nagyobb(Tartaly egyik, Tartaly masik){
        if(egyik.getTerfogat() > masik.getTerfogat()){
            return egyik;
        }
        else{
            return masik;
        }
    }

    public boolean nagyobbNyomasuE(Tartaly masik){
        return masik.nyomas > nyomas;
    }

    public double getNyomas() {
        return nyomas;
    }

    public void setNyomas(double nyomas) {
        this.nyomas = nyomas;
    }
}
