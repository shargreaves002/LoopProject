 

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    }

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        StringBuilder result = new StringBuilder();
        for(int row = 1; row <= tableSize; row++) {
            for(int col = 1; col <= tableSize; col++){
                //int colSize = (int) (Math.log10(tableSize * col) + 1);
                //int numOfSpaces = colSize - (int) (Math.log10(row * col));
                int numOfSpaces = 2 - (int) (Math.log10(row * col));
                result.append(" ".repeat(numOfSpaces)).append(row * col).append(" |");
            }
            result.append('\n');
        }
        return result.toString();
    }
}
