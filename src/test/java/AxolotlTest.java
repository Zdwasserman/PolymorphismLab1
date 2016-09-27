import org.junit.Test;
import static org.junit.Assert.*;
/**
 * Created by kurtmccann on 9/26/16.
 */
public class AxolotlTest
{
    @Test
    public void speakTest()
    {
        Axolotl dave = new Axolotl("dave");
        String actual = dave.speak();
        String expected = "-Excited axolotl noises";
        assertEquals(actual, expected);
    }
}
