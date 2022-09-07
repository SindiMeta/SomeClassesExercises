package example1;

public class UserImplementation implements UserInterface {

    @Override
    public int addUser(User user, User[] array, int size) {
        array[size] = user;
        return size + 1;
    }

    @Override
    public void deleteUser(User user, User[] array) {

        for(int i=0; i<array.length-1; i++){
            if(array[i] != null && array[i].getId() == user.getId()){
                array[i] = null;
                break;
            }
            if(i==array.length-1){
                System.out.println("Nuk eshte i punesuar ne kete firme personi qe kerkoni te fshini");
            }
        }
    }

    @Override
    public void modifyUser(int id, String password, User[] array) {
        for(int i=0; i<array.length-1; i++){
            if(array[i] != null && array[i].getId() == id){
                array[i].setPassword(password);
                break;
            }
            if(i==array.length-1){
                System.out.println("Nuk eshte i punesuar ne kete firme personi qe kerkoni te fshini");
            }
        }
    }

    @Override
    public void carBought(Car car, User user) {
        System.out.println("User " + user.getName() + " has purchased " + car.getCarType());

    }
}
