


public class NumberUtilities {

    public static String getRange(int stop) {
        String result = "";
        for(int x = 0; x < stop; x++){
            result += x;
        }
        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        while(start < stop){
            result += start;
            start++;
        }
        return result;
    }


    public static String getRange(int start, int stop, int step) {
        String result = "";
        while (start < stop){
            result += start;
            start += step;
        }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        while(start < stop){
            if(start % 2 == 0){
                result += start;
            }
            start++;
        }
        return result;
    }


    public static String getOddNumbers(int start, int stop) {
        String result = "";
        while(start < stop){
            if (start % 2 == 1){
                result += start;
            }
            start++;
        }
        return result;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        while(start <= stop){
            result += (int) Math.pow(start, exponent);
            start++;
        }
        return result;
    }
}
