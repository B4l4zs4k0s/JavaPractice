public class Colors {
    public static void main(String[] args) {
        String[][] matrix = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}
        };
        printMatrix(matrix);
    }

    private static void printMatrix(String[][] matrix) {
        for (String[] lineOfColors : matrix) {
            System.out.println(buildStringWithComa(lineOfColors));
        }
    }

    private static String buildStringWithComa(String[] lineOfColors) {
        StringBuilder stringBuilder = new StringBuilder();
        for (String color : lineOfColors) {
            stringBuilder.append(color).append(", ");
        }
        removeLastComma(stringBuilder);
        return stringBuilder.toString();
    }

    private static void removeLastComma(StringBuilder stringBuilder) {
        stringBuilder.delete(stringBuilder.length() - 2, stringBuilder.length() - 1);
    }
}
// - Create a two-dimensional array (of Strings)
//   which can contain the different shades of specified colors
// - In `colors[0]` store the shades of green:
//   `"lime", "forest green", "olive", "pale green", "spring green"`
// - In `colors[1]` store the shades of red:
//   `"orange red", "red", "tomato"`
// - In `colors[2]` store the shades of pink:
//   `"orchid", "violet", "pink", "hot pink"`
// - Print the array in the following format:
//
//   lime, forest green, oline, pale green, spring green
//   orange red, red, tomato
//   orchid, violet, pink, hot pink
//