public class TicTacToe {

    static char[][] board = {
        {'-', '-', '-'},
        {'-', '-', '-'},
        {'-', '-', '-'}
    };

    public static void main(String[] args) {
        System.out.println(isValidMove(1, 1)); // Test case
    }

    /**
     * Checks if the given row and column are within bounds
     * and if the target cell is empty.
     */
    static boolean isValidMove(int row, int col) {

        // Step 1: Check boundaries (0 to 2)
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        // Step 2: Check if cell is empty
        if (board[row][col] != '-') {
            return false;
        }

        // Step 3: Valid move
        return true;
    }
}