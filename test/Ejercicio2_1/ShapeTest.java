package Ejercicio2_1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Martin Belda
 */
public class ShapeTest {
    
   
    public ShapeTest() {
    }
    
    /**
     * Test of area method, of class Shape.
     */
    
    @Test
    public void testCuadradoTrue() {
        Shape instance = new Shape(1,5.0);
        double expResult = 25.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCuadradoFalse() {
        Shape instance = new Shape(1,5.0);
        double expResult = 10.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCirculoTrue() {
        Shape instance = new Shape(2,0.0);
        double expResult = 0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testCirculoFalse() {
        Shape instance = new Shape(2,5.0);
        double expResult = 25.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTrianguloTrue() {
        Shape instance = new Shape(3,5.0);
        double expResult = 12.5;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testTrianguloFalse() {
        Shape instance = new Shape(3,5.0);
        double expResult = 25.0;
        double result = instance.area();
        assertEquals(expResult, result, 0.0);
    }
}
