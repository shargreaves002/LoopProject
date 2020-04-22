

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(2);
    }

    public static String getMultiplicationTable(int tableSize) {
        String outcome = "";
        for(int i = 1; i <= tableSize; i++){
            outcome += i * tableSize + " |" + "\n";
        } return outcome;
    }
}
