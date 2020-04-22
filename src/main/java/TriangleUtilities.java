 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String output = "";
        for (int x = 0; x < numberOfStars; x++ ){

            output = output + "*";

        }
        return output;
    }
    
    public static String getTriangle(int numberOfRows) {
        String output = "";
        for (int x = 1; x <= numberOfRows; x++){
            output = output + getRow(x) + "\n";

        }return output;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
