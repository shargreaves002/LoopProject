
public class NumberUtilities {

    public static String getRange(int stop) {
       String outcome = "";
       for (int x = 0; x<stop; x++){
           outcome = outcome + x;
       }
       return outcome;

    }


    public static String getRange(int start, int stop) {
        String outcome = "";
        for (int x = start; x<stop; x++){
            outcome = outcome + x;
        }
        return outcome;
    }


    public static String getRange(int start, int stop, int step) {
        String outcome = "";
        for (int x = start; x<stop; x +=step){
            outcome = outcome + x;
        }
        return outcome;
    }


    public static String getEvenNumbers(int start, int stop) {

        String outcome = "";
        for (int x = start; x<stop; x++){
            if (x % 2 == 0){
                outcome = outcome + x;
            }
        }
        return outcome;
    }




    public static String getOddNumbers(int start, int stop) {
        String outcome = "";
        for (int x = start; x < stop; x++){

            if (x % 2 != 0) {
                outcome = outcome + x;
            }
        }
        return outcome;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String outcome = "";
        for (int x = start; x <= stop; x++){
            outcome = outcome + (int) Math.pow(x , exponent);
        }
        return outcome;
    }
}
