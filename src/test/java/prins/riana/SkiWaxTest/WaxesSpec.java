package prins.riana.SkiWaxTest;
import org.junit.Test;
import static org.junit.Assert.*;
import prins.riana.SkiWax.Wax;

/**
 * Created by rianaprins on 2/3/16.
 */
public class WaxesSpec {
    @Test
    public void createWaxSpec() {
        Wax w1 = new Wax();
        w1.createWax(32,"crusty");
        String out = w1.getColor() + " " + w1.getType();
        assertEquals("wax needed ","Red Extra",out);
    }
}
