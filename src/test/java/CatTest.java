import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by kurtmccann on 9/26/16.
 */
public class CatTest
{
    @Test
    public void speakTest()
    {
        Pet jerkface = new Cat("cat");
        String actual = jerkface.speak();
        String expected = "Meow";
        assertEquals(actual, expected);
    }
}
