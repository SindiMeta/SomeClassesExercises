package example1;

public class CarImplementation implements CarInterface {



    @Override
    public void addCar(Car car, Car[] array, int size) {
        array[size] = car;

    }

    @Override
    public void deleteCar(Car car, Car[] array) {
        for(int i=0; i<array.length-1; i++){
            if(array[i] != null && array[i].getId() == car.getId()){
                array[i] = null;
                break;
            }
            if(i==array.length-1){
                System.out.println("Nuk eshte kjo makine");
            }
        }
    }

    @Override
    public void modifyCar(int id, String model, Car[] array) {
        for(int i=0; i<array.length-1; i++){
            if(array[i] != null && array[i].getId() == id){
                array[i].setModel(model);
                break;
            }
            if(i==array.length-1){
                System.out.println("Nuk eshte kjo makine");
            }
        }
    }
}
