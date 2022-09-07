package example1;

public class Sales {
    private int id;
    private Car car;
    private User user;
    private Staff staff;

    public Sales(int id, Car car, User user, Staff staff) {
        this.car = car;
        this.user = user;
        this.staff = staff;
        this.id = id;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
