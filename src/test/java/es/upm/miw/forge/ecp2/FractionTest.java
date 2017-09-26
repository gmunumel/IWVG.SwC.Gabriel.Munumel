package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class FractionTest {
    private Fraction a;
    private Fraction b;
    private Fraction c;
    private Fraction myFraction;
    
    @Before
    public void before() {
        a = new Fraction(3, 6);
        b = new Fraction(2, 4);
        c = new Fraction(1, 1);
        this.myFraction = new Fraction (2,3);
    }
    
    @Test
    public void testIsEquivalente() {
        assertEquals(true, a.isEquivalente(a, b));
        assertEquals(false, a.isEquivalente(a, new Fraction(3, 4)));
    }
    
    @Test
    public void testIsPropia() {
        assertEquals(true, this.myFraction.isPropia());
        Fraction ft = new Fraction(3,2);
        assertEquals(false, ft.isPropia());
    }
    
    @Test
    public void testMayor() {
        assertEquals(true, this.myFraction.mayor(b));
        assertEquals(false, this.myFraction.mayor(c));        
    }
    
    @Test
    public void testFraction() {
    		Fraction ft = new Fraction();
    		assertEquals(1, ft.getNumerator());
    		assertEquals(1, ft.getDenominator());
    }

}
