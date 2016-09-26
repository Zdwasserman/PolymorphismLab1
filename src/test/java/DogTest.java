import org.junit.Test;

/**
 * Created by kurtmccann on 9/26/16.
 */
public class DogTest
{
    @Test
    public void speakTest
    {
        //put print output into string "actual" for this test
        Pet poofy = new Dog("Poofy");
        actual = poofy.speak();  ///MAKE SURE YOU TEMPORARILY FORCE SPEAK TO RETURN STRING
        expected = "Ruff";
    }
}
