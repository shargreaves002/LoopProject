 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String outcome = "";
        for(int i = 0; i < numberOfStars; i++){
          outcome = outcome + "*";
        } return outcome;
    }
    
    public static String getTriangle(int numberOfRows) {
        String outcome = "";
        for(int i = 1; i <= numberOfRows; i++){
            outcome = outcome + getRow(i) + "\n";
        } return outcome;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
