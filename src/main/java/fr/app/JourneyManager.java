package fr.app;

import java.util.List;

/**
 * JourneyManager class
 */
public class JourneyManager {
    /**
     * Calculate the distance between two points
     *
     * @param point1 the first point
     * @param point2 the second point
     * @return the distance between the two points
     */
    public static double calculate(Point point1, Point point2) {

        double lat1 = point1.latitude();
        double lon1 = point1.longitude();
        double lat2 = point2.latitude();
        double lon2 = point2.longitude();

        // Formule de Haversine pour calculer la distance entre deux points
        double earthRadius = 6371; // rayon de la Terre en kilomètres
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);
        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return earthRadius * c;
    }

    /**
     * Calculate the total distance of a journey
     *
     * @param points the list of points
     * @return the total distance of the journey
     */
    public static double totalDistance(List<Point> points) {
        if (points.size() < 2) {
            return 0;
        }
        double totalDistance = 0;
        for (int i = 0; i < points.size() - 1; i++) {
            Point point1 = points.get(i);
            Point point2 = points.get(i + 1);
            double distance = calculate(point1, point2);// Using Haversine formula
            totalDistance += distance;
        }
        return totalDistance;
    }

}
