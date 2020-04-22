

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome = "";
        for(int i = 1; i <= tableSize; i++) {
            for(int x= 1; x <= tableSize; x++) {
                int numOfSpaces = Math.max(0, 2 - (int) (Math.log10(i * x)));
                outcome += " ".repeat(numOfSpaces) + (i * x) + " |";
            }
            outcome += "\n";
        }
        return outcome;
    }
}
