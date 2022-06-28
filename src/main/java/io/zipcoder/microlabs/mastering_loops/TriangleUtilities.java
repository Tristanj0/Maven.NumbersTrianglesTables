package io.zipcoder.microlabs.mastering_loops;

public class TriangleUtilities {

    public static java.lang.String getTriangle(int numberOfRows) {
        StringBuilder s = new StringBuilder();

        for (int i = 1; i < numberOfRows; i++) {
            s.append(TriangleUtilities.getRow(i));
            s.append('\n');
        }
        return s.toString();
    }
    
    

    public static java.lang.String getRow(int numberOfStars) {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < numberOfStars; i++) {
            s.append("*");
        }
        return s.toString();
    }

    public static java.lang.String getSmallTriangle() {
        { return getTriangle( 5);}
    }

    public static String getLargeTriangle() {
        { return getTriangle(10); }
    }
}
