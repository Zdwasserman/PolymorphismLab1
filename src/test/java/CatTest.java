import org.junit.Test;

/**
 * Created by kurtmccann on 9/26/16.
 */
public class CatTest
{
    @Test
    public void speakTest()
    {
        Pet jerkface = new Cat();
        String actual = jerkface.speak();  //MAKE SURE TO SET OUTPUT TO STRING
        String expected = "I just vommed on the rug.";
    }
}
