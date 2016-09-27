import java.util.Scanner;

/**
 * Created by zacharywasserman on 9/26/16.
 */
public class App {
    public static void main(String[] args) {

        UserInterface userinterface = new UserInterface();
        PetList list = new PetList();
        Pet pet;
        userinterface.userInterface();

        list.printPets();


        System.out.println("END");

    }

}
