 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        return "*".repeat(Math.max(0, numberOfStars));
    }
    
    public static String getTriangle(int numberOfRows) {
        StringBuilder result = new StringBuilder();
        for(int x = 1; x <= numberOfRows; x++) {
            result.append("*".repeat(x)).append("\n");
        }
        return result.toString();
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
