import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by kurtmccann on 9/26/16.
 */
public class DogTest
{
    @Test
    public void speakTest()
    {
        //put print output into string "actual" for this test
        Pet poofy = new Dog("Poofy");
        String actual = poofy.speak();
        String expected = "Woof!";
        assertEquals(actual, expected);
    }
}
