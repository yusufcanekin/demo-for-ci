import org.junit.Test;
import static org.junit.Assert.*;

public class TriangleTest {
    @Test
    public void testCalculateArea() {
        Triangle triangle = new Triangle();

        double expected = 25.0;
        double actual = triangle.calculateArea(10.0, 5.0);

        assertEquals(expected, actual, 0.001);
    }
}
