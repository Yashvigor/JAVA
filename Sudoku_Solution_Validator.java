import java.util.Scanner;
 public class Sudoku_Solution_Validator {
    public static void main(String[] args) {
        // Read a Sudoku solution
        int[][] grid = readASolution();

        // Check and print if it's valid
        System.out.println(isValid(grid) ? "Valid solution" : "Invalid solution");
    }

    /** Read a Sudoku solution from the console */
    public static int[][] readASolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Sudoku puzzle solution:");

        int[][] grid = new int[9][9]; // 9x9 grid
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                grid[i][j] = input.nextInt(); // read values

        return grid;
    }

    /** Check whether the solution is valid */
    public static boolean isValid(int[][] grid) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                // Check if the number is within range and valid in row, column, and box
                if (grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
                    return false;
            }
        }
        return true; // all cells are valid
    }

    /** Check whether grid[i][j] is valid in the grid */
    public static boolean isValid(int i, int j, int[][] grid) {
        // Check uniqueness in the row
        for (int column = 0; column < 9; column++) {
            if (column != j && grid[i][column] == grid[i][j])
                return false;
        }

        // Check uniqueness in the column
        for (int row = 0; row < 9; row++) {
            if (row != i && grid[row][j] == grid[i][j])
                return false;
        }

        // Check uniqueness in the 3x3 box
        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++) {
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++) {
                if (row != i && col != j && grid[row][col] == grid[i][j])
                    return false;
            }
        }

        return true; // value at grid[i][j] is valid
    }
}
