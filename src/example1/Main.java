package example1;

public class Main {
    public static void main(String[] args) {

        User[] userArray = new User[100];
        Staff[] staffArray = new Staff[10];
        Car[] carArray = new Car[300];
        Sales[] salesArray = new Sales[300];

        UserImplementation userImplementation = new UserImplementation();
        StaffImplementation staffImplementation = new StaffImplementation();
        CarImplementation carImplementation = new CarImplementation();
        SalesImplementation salesImplementation = new SalesImplementation();


        User firstUser = new User();
        firstUser.setId(1);
        firstUser.setUsername("sjfsk");
        firstUser.setSurname("Meta");
        firstUser.setName("Sindi");
        firstUser.setPassword("sfsfsfggfs");

        int userPosition = 0;
        int staffPosition = 0;
        int carPosition = 0;
        int salesPosition = 0;
        userImplementation.addUser(firstUser, userArray, userPosition);

        System.out.println(userArray[0].getSurname());
        userImplementation.deleteUser(firstUser, userArray);
        System.out.println(userArray[0]);


    }
}
