import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
/**
 * Created by zacharywasserman on 9/27/16.
 */
public class PetList {
    private ArrayList<Pet> petlist = new ArrayList<Pet>();


    public void addToList(Pet pet){
        //System.out.println(pet);
        petlist.add(pet);
        //System.out.println(petlist);
    }
    public void printPets() {
        System.out.println(petlist);

    }
}
