package fr.app;

/**
 * Point class
 */
public record Point(double latitude, double longitude) {
    /**
     * check if the latitude and longitude are valid on initialization
     *
     * @param latitude  the latitude
     * @param longitude the longitude
     */
    public Point {
        if (latitude < -90 || latitude > 90) {
            throw new IllegalArgumentException("La latitude doit être comprise entre -90 et 90");
        }
        if (longitude < -180 || longitude > 180) {
            throw new IllegalArgumentException("La longitude doit être comprise entre -180 et 180");
        }
    }
}
