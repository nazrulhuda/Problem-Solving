import java.util.HashSet;

public class NeetCode8ValidSudoku {

    public static boolean isValidSudokBrute(char[][] board) {

        // 1️⃣ Check all rows
        for (int row = 0; row < 9; row++) {
            HashSet<Character> seen = new HashSet<>();
            for (int col = 0; col < 9; col++) {
                char value = board[row][col];
                if (value == '.') {
                    continue; // empty, skip
                }
                if (seen.contains(value)) {
                    return false; // duplicate in this row
                }
                seen.add(value);
            }
        }

        // 2️⃣ Check all columns
        for (int col = 0; col < 9; col++) {
            HashSet<Character> seen = new HashSet<>();
            for (int row = 0; row < 9; row++) {
                char value = board[row][col];
                if (value == '.') {
                    continue; // empty, skip
                }
                if (seen.contains(value)) {
                    return false; // duplicate in this column
                }
                seen.add(value);
            }
        }

        // 3️⃣ Check all 3x3 sub-boxes
        // Each box starts at (boxRow, boxCol) = (0,0), (0,3), (0,6), (3,0), ...
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {
            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Character> seen = new HashSet<>();

                // Now scan the 3x3 box starting at (boxRow, boxCol)
                for (int r = boxRow; r < boxRow + 3; r++) {
                    for (int c = boxCol; c < boxCol + 3; c++) {
                        char value = board[r][c];
                        if (value == '.') {
                            continue;
                        }
                        if (seen.contains(value)) {
                            return false; // duplicate in this 3x3 box
                        }
                        seen.add(value);
                    }
                }

            }
        }

        // If we never found a problem, it's valid
        return true;
    }

    public static boolean isValidSudokuOptimized(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                char value = board[r][c];

                if (value == '.') continue; // ignore empty cells

                // Build unique "rules" we must not break:
                String rowRule = value + " in row " + r;
                String colRule = value + " in col " + c;
                String boxRule = value + " in box " + (r / 3) + "," + (c / 3);

                // If we've already seen any of these rules, it's invalid
                if (seen.contains(rowRule) ||
                    seen.contains(colRule) ||
                    seen.contains(boxRule)) {
                    return false;
                }

                // Otherwise mark them as seen
                seen.add(rowRule);
                seen.add(colRule);
                seen.add(boxRule);
            }
        }
        return true;
    }

    // Simple tester
    public static void main(String[] args) {
        char[][] board = {
            {'5','3','.','.','7','.','.','.','.'},
            {'6','.','.','1','9','5','.','.','.'},
            {'.','9','8','.','.','.','.','6','.'},
            {'8','.','.','.','6','.','.','.','3'},
            {'4','.','.','8','.','3','.','.','1'},
            {'7','.','.','.','2','.','.','.','6'},
            {'.','6','.','.','.','.','2','8','.'},
            {'.','.','.','4','1','9','.','.','5'},
            {'.','.','.','.','8','.','.','7','9'}
        };

        boolean valid = isValidSudokBrute(board);
        System.out.println("Is board valid? " + valid);
    }
}
