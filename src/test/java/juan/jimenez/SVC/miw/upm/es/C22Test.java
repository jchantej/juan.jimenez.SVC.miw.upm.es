package juan.jimenez.SVC.miw.upm.es;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class C22Test {
    private C22 c22;

    @Test
    public void testC21m1() {
        c22 = new C22();
        assertEquals("C22.mA" ,c22.mA());
    }

}
