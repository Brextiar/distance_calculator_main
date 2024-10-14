package fr.app;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class
 */
public class Main {

    public static void main(String[] args) {
        List<Point> points = new ArrayList<>();
        points.add(new Point(48.8566, 2.3522)); // Paris
        points.add(new Point(51.5074, -0.1278)); // London
        points.add(new Point(40.7128, -74.0060)); // New York
        points.add(new Point(34.0522, -118.2437)); // Los Angeles

        System.out.println("La distance totale du trajet est de : " + JourneyManager.totalDistance(points) + " km");
    }
}