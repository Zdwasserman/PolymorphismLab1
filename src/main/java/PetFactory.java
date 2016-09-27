/**
 * Created by zacharywasserman on 9/26/16.
 */
public class PetFactory {
    PetList petlist = new PetList();
    Pet pet;
    public Pet getPet(int petType, String name){
        switch(petType) {
            case 1:
                pet = new Cat(name);
                break;
            case 2:
                pet = new Dog(name);
                break;
            case 3:
                pet =  new Axolotl(name);
                break;

        }
        return pet;
    }
}
