package example2;

public class Person {
    private String emri;
    private String mbiemri;
    private Address adresa;

    public Person(String emer, String mbiemer, Address add){
        this.emri = emer;
        this.mbiemri = mbiemer;
        this.adresa = add;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public Address getAdresa() {
        return adresa;
    }

    public void setAdresa(Address adresa) {
        this.adresa = adresa;
    }

    public void printSomething(){
        System.out.println("stoppp");
    }

    @Override
    public String toString() {
        return "Person{" +
                "emri='" + emri + '\'' +
                ", mbiemri='" + mbiemri + '\'' +
                ", adresa=" + adresa +
                '}';
    }
}


