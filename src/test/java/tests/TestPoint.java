package tests;

import fr.app.Point;
import org.junit.jupiter.api.Test;

public class TestPoint {

    /**
     * Test the Point class
     */
    @Test
    public void testPoint() {
        Point point = new Point(48.8566, 2.3522);
        assert point.latitude() == 48.8566;
        assert point.longitude() == 2.3522;
    }

    /**
     * Test the Point class with invalid latitude
     */
    @Test
    public void testPointWithInvalidLatitude() {
        try {
            new Point(-100d, 2.3522);
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }

    /**
     * Test the Point class with invalid longitude
     */
    @Test
    public void testPointWithInvalidLongitude() {
        try {
            new Point(48.8566, 200d);
            assert false;
        } catch (IllegalArgumentException e) {
            assert true;
        }
    }
}
