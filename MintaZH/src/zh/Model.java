package zh;

public class Model implements Film{
    String cim;
    String kategoria;
    String producer;
    final int ev;
    String foszereplo;


    public int getEv() {
        return ev;
    }


    public Model(String cim, String kategoria, String producer, int ev, String foszereplo) {
        this.cim = cim;
        this.kategoria = kategoria;
        this.producer = producer;
        this.ev = ev;
        this.foszereplo = foszereplo;
    }

    @Override
    public String szereplok() {
        return null;
    }

    @Override
    public String cim() {
        return null;
    }

    @Override
    public void setCim(String cim) {

    }

    @Override
    public String getCim() {
        return null;
    }

    @Override
    public void setkategoria(String kategoria) {

    }

    @Override
    public String getKategoria() {
        return null;
    }
}
