import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit test for Triangle class
 * Checks if the area calculation is correct for a given base and height
 */
public class TriangleTest {
    
    /**
     * Verifies that the calculateArea method returns the correct mathematical result.
     * This test specifically checks a standard triangle with base 10 and height 5.
     */
    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle();

        double expected = 25.0;
        double actual = triangle.calculateArea(10.0, 5.0);

        /**
         * Asserts that the calculated value is within a 0.001 margin of error.
         * This delta is necessary for floating-point comparisons in Java.
         */
        assertEquals(expected, actual, 0.001);
    }
}
