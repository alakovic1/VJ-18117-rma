package ba.unsa.etf.rma.VJ_18117;

public class Muzicar {
    private String imeIPrezime, zanr, webStrabica, biografija;
    private int idSlike;

    public Muzicar(String imeIPrezime, String zanr, String webStrabica, String biografija, int id) {
        this.imeIPrezime = imeIPrezime;
        this.zanr = zanr;
        this.webStrabica = webStrabica;
        this.biografija = biografija;
        this.idSlike = id;
    }

    public String getImeIPrezime() {
        return imeIPrezime;
    }

    public void setImeIPrezime(String imeIPrezime) {
        this.imeIPrezime = imeIPrezime;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public String getWebStrabica() {
        return webStrabica;
    }

    public void setWebStrabica(String webStrabica) {
        this.webStrabica = webStrabica;
    }

    public String getBiografija() {
        return biografija;
    }

    public void setBiografija(String biografija) {
        this.biografija = biografija;
    }

    public int getIdSlike() {
        return idSlike;
    }

    public void setIdSlike(int idSlike) {
        this.idSlike = idSlike;
    }
}
