package Polaznik;

public class Polaznik implements Comparable<Polaznik> {
    private int dob;
    private String ime;
    private String prezime;

    public Polaznik(int dob, String ime, String prezime) {
        this.dob = dob;
        this.ime = ime;
        this.prezime = prezime;
    }

    public int getDob() {
        return dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    @Override
    public String toString() {
        return "Polaznik{" +
                "dob=" + dob +
                ", ime='" + ime + '\'' +
                ", prezime='" + prezime + '\'' +
                '}';
    }

    @Override
    public int compareTo(Polaznik o) {
        return Integer.compare(dob, o.dob);
    }
}
