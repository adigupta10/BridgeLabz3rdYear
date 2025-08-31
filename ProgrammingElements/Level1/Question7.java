package Level1;
public class Question7 {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double kmToMiles = 1.6;
        double radiusMiles = radiusKm * kmToMiles;
        double volumeKm3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusKm, 3);
        double volumeMiles3 = (4.0 / 3.0) * Math.PI * Math.pow(radiusMiles, 3);
        System.out.println("The volume of Earth in cubic kilometers is " + volumeKm3);
        System.out.println("The volume of Earth in cubic miles is " + volumeMiles3);
    }
}
