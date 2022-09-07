package example1;

public class SalesImplementation implements SalesInterface {

    @Override
    public void soldCar(Car car, User user, Staff staff, Sales[] array, int position) {
        Sales sales = new Sales(position, car, user, staff);
        array[position] = sales;
    }

    @Override
    public void totalSales(Sales[] array) {

        System.out.println("Kemi shitur " + array.length);
    }
}
