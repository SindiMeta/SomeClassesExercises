package example1;

public class StaffImplementation implements StaffInterface {
    @Override
    public void addStaff(Staff staff, Staff[] array, int size) {
        array[size] = staff;
    }

    @Override
    public void deleteStaff(Staff staff, Staff[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != null && array[i].getId() == staff.getId()) {
                array[i] = null;
                break;
            }
            if (i == array.length - 1) {
                System.out.println("Nuk eshte i punesuar ne kete firme personi qe kerkoni te fshini");
            }
        }
    }
}

