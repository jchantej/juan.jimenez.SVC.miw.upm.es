package juan.jimenez.SVC.miw.upm.es;

import static org.junit.Assert.*;

import org.junit.Test;

public class C11Test {
    private C11 c11;

    @Test
    public void testC11m1() {
        c11 = new C11();
        assertEquals("m1" ,c11.m1());
    }
    
    @Test
    public void testC11m2() {
        c11 = new C11();
        assertEquals("m2" ,c11.m2());
    }


}
