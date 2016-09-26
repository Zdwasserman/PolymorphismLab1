import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by zacharywasserman on 9/26/16.
 */
public class UserInfo {
    HashMap pets = new HashMap();
    Scanner input = new Scanner(System.in);
    String petType;
    String petName;

    public void getData(int numOfPets) {
        for (int i = 0; i < numOfPets; i++) {
            System.out.println("what type of pet do you own?");
            petType = input.next();
            System.out.println("What is that pets name?");
            petName = input.next();
            pets.put(petType, petName);
        }
    }

    public void printPets() {
            System.out.println(pets);
        
    }
}

