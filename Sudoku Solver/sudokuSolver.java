import java.util.Scanner;

class SudokuSolver 
{
    static boolean solveSudoku(int[][] board) 
    {
        int N = board.length;

        while (true) 
        {
            int emptyCellCount = 0;
            for (int row = 0; row < N; row++) 
            {
                for (int col = 0; col < N; col++)
                 {
                    if (board[row][col] == 0) 
                    {
                        emptyCellCount++;
                        boolean found = false;
                        for (int num = 1; num <= N; num++) 
                        {
                            if (isSafe(board, row, col, num)) 
                            {
                                board[row][col] = num;
                                found = true;
                                break;
                            }
                        }
                        if (!found) 
                        board[row][col] = 0;
                    }
                }
            }
            if (emptyCellCount == 0)
                return true;
            if (emptyCellCount == N * N)
                return false;
        }
    }

    static boolean isSafe(int[][] board, int row, int col, int num) 
    {
        int N = board.length;
        for (int x = 0; x < N; x++) 
        if (board[row][x] == num || board[x][col] == num)
            return false;
        int subgridRowStart = row - row % 3;
        int subgridColStart = col - col % 3;
        for (int i = 0; i < 3; i++)
        for (int j = 0; j < 3; j++)
            if (board[subgridRowStart + i][subgridColStart + j] == num)
                return false;
        return true;
    }

    static void printSudoku(int[][] board)
    {
        int N = board.length;
        for (int r = 0; r < N; r++) 
        {
            for (int d = 0; d < N; d++)
            System.out.print(board[r][d] + " ");
            System.out.println();
            if ((r + 1) % 3 == 0) 
            System.out.println();
        }
    }
}

class sudoku 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Sudoku puzzle (use 0 for empty cells):");
        int[][] puzzle = new int[9][9];
        for (int row = 0; row < 9; row++)
        for (int col = 0; col < 9; col++)
        puzzle[row][col] = scanner.nextInt();

        if (SudokuSolver.solveSudoku(puzzle)) {
            System.out.println("Sudoku solved successfully:");
            SudokuSolver.printSudoku(puzzle);
        } else {
            System.out.println("No solution exists.");
        }
    }
}
