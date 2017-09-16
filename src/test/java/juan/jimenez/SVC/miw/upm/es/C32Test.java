package juan.jimenez.SVC.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C32Test {
    private C32 c32;

    @Test
    public void testC32m1() {
        c32 = new C32();
        assertEquals("mA" ,c32.mA());
    }

}
