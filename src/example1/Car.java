package example1;

public  class Car {
    private int id;
    private String model;
    private int motor;
    private String color;
    private Enum carType;
    //todo add all other missing attribution


    public Car(int id, String model, int motor, String color, Enum carType) {
        this.model = model;
        this.motor = motor;
        this.color = color;
        this.carType = carType;
        this.id = id;
    }

    public String getModel() {

        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Enum getCarType() {
        return carType;
    }

    public void setCarType(Enum carType) {
        this.carType = carType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
