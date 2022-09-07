package example2;

public class Address {
    private int kati;
    private int pallati;
    private String qyteti;

    public Address(){

    }

    public Address(int paramKati, int paramPallati, String paramQyteti) {
        this.kati = paramKati;
        this.pallati = paramPallati;
        this.qyteti = paramQyteti;
    }

    public int getKati() {
        return kati;
    }

    public void setKati(int kati) {
        this.kati = kati;
    }

    public int getPallati() {
        return pallati;
    }

    public void setPallati(int pallati) {
        this.pallati = pallati;
    }

    public void setQyteti(String qyteti) {
        this.qyteti = qyteti;
    }
    public String getQyteti() {
        return qyteti;
    }
}

