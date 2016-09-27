import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by zacharywasserman on 9/26/16.
 */
public class UserInterface {
    UserInfo user = new UserInfo();

    public void userInterface(){
        Scanner input = new Scanner(System.in);
        int numOfPets;
        System.out.println("How many pets do you own?");
        numOfPets = input.nextInt();
        user.getData(numOfPets);





    }
}
