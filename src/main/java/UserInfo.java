import java.util.HashMap;
import java.util.Scanner;
/**
 * Created by zacharywasserman on 9/26/16.
 */
public class UserInfo {

    Scanner input = new Scanner(System.in);
    PetFactory factory = new PetFactory();
    PetList petlist = new PetList();
    Pet pet;
    int petType;
    String petName;

    public void getData(int numOfPets) {
        for (int i = 0; i < numOfPets; i++) {
            System.out.println("what type of pet do you own?");
            System.out.println("1: cat");
            System.out.println("2: dog");
            System.out.println("3: axolotl");
            petType = input.nextInt();
            System.out.println("What is that pets name?");
            petName = input.next();
            pet = factory.getPet(petType, petName);
            petlist.addToList(pet);
        }
        petlist.printPets();
    }


}

