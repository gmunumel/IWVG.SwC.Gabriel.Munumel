package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import es.upm.miw.forge.ecp2.Point;

public class FractionTest {

    @Before
    public void before() { }

    @Test
    public void testFractionMayor() {
    		Fraction fractA = new Fraction(1, 2);
    		Fraction fractB = new Fraction(1, 4);
        assertEquals(true, new Fraction().mayor(fractA, fractB));
    }

}
