package ffos.p3.tbizik;

import java.io.Serializable;

public class Automobil implements Serializable {

    public Automobil() {
        this.sifra = sifra;
        this.automobil = automobil;
        this.proizvodac = proizvodac;
        this.kupac = kupac;
        this.cijena = cijena;
        this.blagajnik = blagajnik;
    }

    public int getSifra() {
        return sifra;
    }

    public void setSifra(int sifra) {
        this.sifra = sifra;
    }

    public String getAutomobil() {
        return automobil;
    }

    public void setAutomobil(String automobil) {
        this.automobil = automobil;
    }

    public String getProizvodac() {
        return proizvodac;
    }

    public void setProizvodac(String proizvodac) {
        this.proizvodac = proizvodac;
    }

    public String getKupac() {
        return kupac;
    }

    public void setKupac(String kupac) {
        this.kupac = kupac;
    }

    public float getCijena() {
        return cijena;
    }

    public void setCijena(float cijena) {
        this.cijena = cijena;
    }

    public String getBlagajnik() {
        return blagajnik;
    }

    public void setBlagajnik(String blagajnik) {
        this.blagajnik = blagajnik;
    }

    private int sifra;

    private String automobil;

    private String proizvodac;

    private String kupac;

    private float cijena;

    private String blagajnik;

}
