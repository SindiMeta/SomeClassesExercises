package example1;

public interface CarInterface {
    void addCar(Car car, Car[] array, int size);

    void deleteCar(Car car, Car[] array);

    void modifyCar(int id, String model, Car[] array); // duam te modifikojme vtm modelin e makines me nje id te caktuar
}
