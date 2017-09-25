package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction a;
    private Fraction b;
    
    @Before
    public void before() {
        a = new Fraction(3, 6);
        b = new Fraction(2, 4);
    }
    
    @Test
    public void testIsEquivalente() {
        assertEquals(true, a.isEquivalente(a, b));
    }

}
