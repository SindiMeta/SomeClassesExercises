package example2;

public class MainAddress {
    public static void main(String[] args) {
        Address ad1 = new Address();
        ad1.setKati(1);
        ad1.setPallati(97);
        ad1.setQyteti("Tirane");

        Address ad2 = new Address();
        ad2.setKati(2);
        ad2.setPallati(7);
        ad2.setQyteti("Librazhd");

        Address ad3 = new Address();
        ad3.setQyteti("Durres");
        ad3.setKati(2);
        ad3.setPallati(7);

        Address a = new Address(2, 4, "Tirane");
        System.out.println("Adresa ne qytetin " + a.getQyteti() + " ndodhet ne pallatin " + a.getPallati() + " " +
                " ne katin " + a.getKati());


        Person per = new Person("Sindi", "Meta", (new Address(6, 2, "Tirane")));
        Person per1 = new Person("Mariglen", "Rreshka", (new Address(6, 2, "Tirane")));
        Person per2 = new Person("Violeta", "Meta", (new Address(3, 79, "Librazhd")));

        Person[] person = new Person[3];
        person[0] = per;
        person[1] = per1;
        person[2] = per2;
        int maxValue = 0;
        String emri = null;
        int maxValue2 = 0;
        String emri2 = null;
        for (int i = 0; i < person.length; i++) {
            if ((person[i].getAdresa().getKati() > maxValue)) {
                maxValue = person[i].getAdresa().getKati();
                emri = person[i].getEmri();

            }
        }

        System.out.println("Ne katin me te larte jeton " + emri);

    }
}
