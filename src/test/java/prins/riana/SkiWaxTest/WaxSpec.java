package prins.riana.SkiWaxTest;

import org.junit.Test;
import prins.riana.SkiWax.Wax;

import static org.junit.Assert.*;

public class WaxSpec {
    @Test
    public void createWaxSpec() {
        Wax w1 = new Wax();
        w1.createWax(32,"crusty");
        String out = w1.getColor() + " " + w1.getType();
        assertEquals("wax needed ","Red Extra",out);
    }

    @Test
    public void getColorSpec() {
        Wax wax = new Wax();
        wax.createWax(40,"Firm");
        assertEquals("get color ", "Yellow", wax.getColor());
    }
    @Test
     public void getTypeSpec() {
        Wax wax = new Wax();
        wax.createWax(40,"Firm");
        assertEquals("get type ","Standard",wax.getType());

    }
}
