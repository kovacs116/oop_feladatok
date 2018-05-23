public class VizsgaZH {

    private String nev;

    public VizsgaZH(String nev) {
    }

    public String getNev() {
        return null;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public double getPont() {
        return pont;
    }

    public void setPont(double pont) {
        this.pont = pont;
    }

    private double pont;
    final int max_pont = 100;

    @Override
    public String toString() {
        return "VizsgaZH{" +
                "nev='" + nev + '\'' +
                ", pont=" + pont +
                '}';
    }

    public boolean megfeleltE(){
        return (max_pont/2) < pont;
    }
}

