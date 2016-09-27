/**
 * Created by zacharywasserman on 9/27/16.
 */
import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
public class PetTest {
    @Test
    public void speakTest(){
        Pet pet = new Pet("");
        String expected = null;
        String actual = pet.speak();
        assertEquals(expected, actual);
    }
    @Test
    public void getName(){
        Pet pet = new Pet("Puck");
        String expected = "Puck";
        String actual = pet.getName();
        assertEquals(expected, actual);
    }
    @Test
    public void setName(){
        Pet pet = new Pet("Puck");
        pet.setName("Navi");
        String expected = "Navi";
        String actual = pet.getName();
        assertEquals(expected, actual);
    }

}
