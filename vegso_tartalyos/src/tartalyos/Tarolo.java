package tartalyos;

public abstract class Tarolo {
    private int terfogat;

    public Tarolo(int terfogat) {
        this.terfogat = terfogat;
    }

    public int getTerfogat() {
        return terfogat;
    }

    public void setTerfogat(int terfogat) {
        this.terfogat = terfogat;
    }
    public abstract boolean veszelyesE();

}
