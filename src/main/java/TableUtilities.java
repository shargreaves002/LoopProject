 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String result = "";
        for (int x = 1; x <= tableSize; x++) {
            for (int i = 1; i <= tableSize; i++) {
                int spaces = 2 - (int) (Math.log10(x * i));
                result += " ".repeat(spaces) + x * i + " |";
            }
            result += "\n";
        }
        return result;
    }
}
