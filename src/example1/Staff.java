package example1;

public class Staff {
    private int id;
    private String name;
    private String surname;
    private int mosha;

    public Staff(int id, String name, String surname, int mosha) {
        this.name = name;
        this.surname = surname;
        this.mosha = mosha;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
