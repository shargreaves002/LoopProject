


public class NumberUtilities {

    public static String getRange(int stop) {
        return getRange(0, stop, 1);
    }

    public static String getRange(int start, int stop) {
        return getRange(start, stop, 1);
    }


    public static String getRange(int start, int stop, int step) {
        StringBuilder result = new StringBuilder();
        int counter = start;
        while (counter < stop) {
            result.append(counter);
            counter += step;
        }
        return result.toString();
    }

    public static String getEvenNumbers(int start, int stop) {
        StringBuilder result = new StringBuilder();
        int counter = start;
        while (counter < stop) {
            if(counter % 2 == 0) result.append(counter);
            counter++;
        }
        return result.toString();
    }


    public static String getOddNumbers(int start, int stop) {
        StringBuilder result = new StringBuilder();
        int counter = start;
        while (counter < stop) {
            if(counter % 2 == 1) result.append(counter);
            counter++;
        }
        return result.toString();
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        StringBuilder result = new StringBuilder();
        int counter = start;
        while (counter <= stop) {
            result.append((int) (Math.pow(counter, exponent)));
            counter++;
        }
        return result.toString();
    }
}
