package example1;

import javax.jws.soap.SOAPBinding;

public interface UserInterface {
    int addUser(User user, User[] array, int size);

    void deleteUser(User user, User[] array);

    void modifyUser(int id, String password, User[] array);

    void carBought(Car car, User user);
}
