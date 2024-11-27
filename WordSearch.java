public class WordSearch {
    // Directions for movinf
    private static final int[][] DIRECTIONS = {
        {0, 1},   // Horizontal right
        {1, 0},   // Vertical down
        {1, 1},   // Diagonal down-right
        {-1, 0},  // Vertical up
        {0, -1},  // Horizontal left
        {-1, -1}, // Diagonal up-left
        {1, -1},  // Diagonal down-left
        {-1, 1}   // Diagonal up-right
    };

    public static boolean searchWord(char[][] grid, String word) {
        int rows = grid.length;
        int cols = grid[0].length;

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (searchFromCell(grid, word, row, col)) {
                    return true; // If it return true then it means word found
                }
            }
        }
        return false; // Word not found
    }

    private static boolean searchFromCell(char[][] grid, String word, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;
        int wordLen = word.length();

        // Check all 8 directions
        for (int[] dir : DIRECTIONS) {
            int newRow = row, newCol = col;
            int index;

            // Check if the word can fit in this direction
            for (index = 0; index < wordLen; index++) {
                if (newRow < 0 || newRow >= rows || newCol < 0 || newCol >= cols || grid[newRow][newCol] != word.charAt(index)) {
                    break;
                }
                newRow += dir[0];
                newCol += dir[1];
            }

            if (index == wordLen) {
                return true; // Found the word in this direction
            }
        }
        return false; 
    }

    public static void main(String[] args) {
        char[][] grid = {
            {'W', 'E', 'L', 'C', 'O', 'M', 'E'},
            {'T', 'O', 'T', 'H', 'E', 'W', 'O'},
            {'R', 'D', 'P', 'U', 'Z', 'Z', 'L'},
            {'E', 'E', 'A', 'C', 'H', 'T', 'H'},
            {'F', 'I', 'N', 'D', 'I', 'T', 'N'}
        };

        String word = "WELCOME";

        if (searchWord(grid, word)) {
            System.out.println("Word found in the grid");
        } else {
            System.out.println("Word not found in the grid");
        }
    }
}
