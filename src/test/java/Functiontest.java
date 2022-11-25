import org.example.Function;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class Functiontest {
    @Test
    public void tesIsFive() {
        Function main = new Function();
        boolean five = main .isFive(5);
        Assertions.assertEquals(five, true);
    }
    @Test
    public void tesPow() {
        Function main = new Function();
        double res = main.Pow(2,2);
        double four = 4;
        Assertions.assertEquals(res, four);
    }
    @Test
    public void testConcat() {
        Function main = new Function();
        String res= main.Concat("a", "b");
        String eq = "ab";
        Assertions.assertEquals(res, eq);
    }
}
