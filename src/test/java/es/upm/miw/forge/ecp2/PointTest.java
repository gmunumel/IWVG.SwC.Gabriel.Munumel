package es.upm.miw.forge.ecp2;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import es.upm.miw.forge.ecp2.Point;

public class PointTest {
    private Point pt;
    private Point ptOutOfBoundsX;
    private Point ptOutOfBoundsY;
    
    @Rule
    public ExpectedException exception = ExpectedException.none();
    
    @Before
    public void before() {
        pt = new Point(2, 3);
        ptOutOfBoundsX = new Point(-1, 101);
        ptOutOfBoundsY = new Point(-11, 11);
    }

    @Test
    public void testPuntoIntInt() {
        assertEquals(2, pt.getX());
        assertEquals(3, pt.getY());
    }

    @Test
    public void testPunto() {
        pt = new Point();
        assertEquals(0, pt.getX());
        assertEquals(0, pt.getY());
    }

    @Test
    public void testModulo() {
        assertEquals(3.6055, pt.module(), 10e-5);
    }

    @Test
    public void testFase() {
        assertEquals(0.9828, pt.phase(), 10e-5);
    }

    @Test
    public void testTranslate() {
        this.pt.translateOrigin(new Point(1, 1));
        assertEquals(1, pt.getX());
        assertEquals(2, pt.getY());
    }

    @Test
    public void testLimitX() {
        exception.expect(IllegalArgumentException.class);
        ptOutOfBoundsX.limitX();
    }

    @Test
    public void testLimitXException() {
        assertEquals(pt.getX(), pt.limitX());
    }
    @Test
    public void testLimitYException() {
        assertEquals(pt.getY(), pt.limitY());
    }
    @Test
    public void testLimitY() {
        exception.expect(IllegalArgumentException.class);
        ptOutOfBoundsY.limitY();
    }

}
