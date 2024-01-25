package tictactoe;

/**
 * Tic-Tac-Toe state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE][Constants.BOARD_SIZE];

    public boolean isWinner() {
        boolean isWinner = false;
        int rowCount;
        int columnCount;
        int diagonalCount;
        for (int i = 0; i < BOARD_SIZE; i++) {
            rowCount = 0;
            for (int c = 0; c < BOARD_SIZE; c++) {
                rowCount += board[i][c];
            } 
            if (rowCount == 3 * X_VALUE || rowCount == 3 * O_VALUE) {
                isWinner = true;
            }
        }
        
        for (int i = 0; i < BOARD_SIZE; i++) {
            coulmnCount = 0;
            for (int c = 0; c < BOARD_SIZE; c++) {
                columnCount += board[c][i];
            } 
            if (columnCount == 3 * X_VALUE || columnCount == 3 * O_VALUE) {
                isWinner = true;
            }
        }
    }
    
        public boolean isTie() {
            // You will write this code too!!
        }

        public int getGameState() {
            return this.gameState;
        }

        public void setGameState(int gameState) {
        this.gameState = gameState;
    }

    public int getWhoseMove() {
        return this.whoseMove;
    }

    public void setWhoseMove() {
        this.whoseMove = whoseMove;
    }

    public String getXName() {
        return this.xName;
    }

    public void setXName(){
        this.xName = xName;
    }

    public String getOName() {
        return this.oName;
    }

    public void setOName(){
        this.oName = oName;
    }

    public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }

    public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }

}
