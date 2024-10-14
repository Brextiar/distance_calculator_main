package tests;

import fr.app.JourneyManager;
import fr.app.Point;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class TestJourneyManager {

    /**
     * Test the total distance of a journey
     */
    @Test
    public void testTotalDistance() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(48.8566, 2.3522)); // Paris
        points.add(new Point(51.5074, -0.1278)); // Londres
        points.add(new Point(40.7128, -74.0060)); // New York
        points.add(new Point(34.0522, -118.2437)); // Los Angeles
        assert JourneyManager.totalDistance(points) == 9849.524494688721;
    }

    /**
     * Test the total distance of a journey with one point
     */
    @Test
    public void testTotalDistanceWithOnePoint() {
        List<Point> points = new ArrayList<>();
        points.add(new Point(48.8566, 2.3522)); // Paris
        assert JourneyManager.totalDistance(points) == 0;
    }

    /**
     * Test the distance calculation of two points
     */
    @Test
    public void testDistance() {
        Point point1 = new Point(48.856667, 2.350987);
        Point point2 = new Point(40.714268, -74.005974);
        assert JourneyManager.calculate(point1, point2) == 5837.057346290527;
    }
}
