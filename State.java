//back end of the program, 
/**
 *  state variables.
 */
public class State
{
    private int gameState = Constants.STANDBY;
    private int whoseMove = Constants.X;
    private String xName = "";
    private String oName = "";
    private int[][] board = new int[Constants.BOARD_SIZE+1][Constants.BOARD_SIZE+1];

    public void clearBoard(){ //at the end of the game all cells become blank
        for (int row=0; row<Constants.BOARD_SIZE; row++) {
            for (int col=0; col<Constants.BOARD_SIZE; col++) {
                board[row][col] = Constants.BLANK;
            }
        }
    }
    public int moveRandom(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }/*
    public int moveRandom2(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom3(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom4(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom5(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom6(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom7(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom8(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom9(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }
    public int moveRandom10(int row, int col){
        col = (int)(Math.random()*9)+1;
        row = (int)(Math.random()*9)+1;
        return this.board[row][col];
    }*/
         public int getBoardCell(int row, int col) {
        return this.board[row][col];
    }
    
    public boolean isWinner(int row,int col) {
        int total;
        
        /*for (int row=0; row<Constants.BOARD_SIZE; row++) {
            total = getBoardCell(row, 0) + getBoardCell(row,1) + getBoardCell(row,2);
            if (total == -3 || total == 3) return true;
        }  //check the rows 
        for (int col=0; col<Constants.BOARD_SIZE; col++) {
            total = getBoardCell(0, col) + getBoardCell(1,col) + getBoardCell(2, col);
            if (total == -3 || total == 3) return true;
        } //check for the column
        total = getBoardCell(0, 0) + getBoardCell(1,1) + getBoardCell(2, 2);
        if (total == -3 || total == 3) return true;
        total = getBoardCell(2, 0) + getBoardCell(1,1) + getBoardCell(0, 2);
        if (total == -3 || total == 3) return true;*/
       if (getBoardCell(row,col)== moveRandom(row,col)){
           return false;
        }/*
        if (getBoardCell(row,col)== moveRandom2(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom3(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom4(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom5(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom6(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom7(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom8(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom9(row,col)){
           return true;
        }if (getBoardCell(row,col)== moveRandom10(row,col)){
           return true;
        }*/
        return true; 
    }

    public boolean isTie() {
        for (int row=0; row<Constants.BOARD_SIZE; row++) {
            for (int col=0; col<Constants.BOARD_SIZE; col++) {
                if (getBoardCell(row,col) == Constants.BLANK) {
                    return false; 
                }
            }
        }
        return true;
    }
    

    public int getGameState() {
        return this.gameState;
    }

    public void setGameState(int gameState) {
        this.gameState = gameState;
    }
    
     public int getWhoseMove() {
        return whoseMove;
    }
    
        public void setWhoseMove(int whoseMove) {
        this.whoseMove = whoseMove;
    }
    
        public String getXName() {
        return xName;
    }
    
    public void setXName(String xName) {
        this.xName = xName;
    }
    
        public String getOName() {
        return oName;
    }
    
        public void setOName(String oName) {
        this.oName = oName;
    }
    
    
        public void setBoardCell(int row, int col, int value) {
        this.board[row][col] = value;
    }
}
