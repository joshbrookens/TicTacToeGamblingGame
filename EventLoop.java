public class EventLoop {

  // Instance variables for the UI and State classes
  State state = new State();
  UI ui = new UI();
  int row, col;
  double score = 12.50;
  
  public static void main(String[] args) {
      EventLoop eventLoop = new EventLoop();
      eventLoop.run();
  }

  public void run() {
    while (state.getGameState() != Constants.QUIT_PROGRAM) {
      int gameState = state.getGameState();
      if (gameState == Constants.STANDBY) {
        state.setGameState(Constants.GET_X_NAME);

      } else if (gameState == Constants.GET_X_NAME) {
        state.setXName(ui.promptForName("X"));
        state.setGameState(Constants.GET_X_MOVE);
    
      } else if (gameState == Constants.GET_X_MOVE) {
        ui.printBoard(state);
        System.out.print("Your money is $ "+score+" ");
        row = ui.getMoveRow(state.getWhoseMove(), state.getXName(), state.getOName());
        col = ui.getMoveCol(state.getWhoseMove(), state.getXName(), state.getOName());
        if (1 <= row && row <= Constants.BOARD_SIZE &&1 <= col && col <= Constants.BOARD_SIZE &&state.getBoardCell(row-1, col-1) == Constants.BLANK) {
          state.setGameState(Constants.MAKE_MOVE);
        }
        if (0 == row && 0 == col){
            state.setGameState(Constants.X_WINS);
        }

      
      }else if(gameState == Constants.X_WINS){
          System.out.println("You pulled out. You have $ "+score+" "+ "You have made $ "+(score-12.5));
          state.setGameState(Constants.GAME_OVER);
      }
      
      else if (gameState == Constants.MAKE_MOVE) {
        ui.printMove(state, row, col);
        state.setBoardCell(row-1, col-1, state.getWhoseMove());
        state.setGameState(Constants.CHECK_IF_LOSE);

      } else if (gameState == Constants.CHECK_IF_LOSE) {
        if (state.isWinner(row,col)) {
          
            state.setGameState(Constants.X_LOSES);
          
        } 
        else { 
            score = score/10;
            score = score*1.25;
            score = score*10;
            state.setGameState(Constants.GET_X_MOVE);
            
        }

   

      } else if (gameState == Constants.X_LOSES) {
           ui.printBoard(state);
        ui.printWinner(state);
        score = score*0;
        System.out.println("You have $ "+score+" ");
        System.out.println("x x      *   *");
        System.out.println("           *");
        System.out.println("---/     *   *");
        state.setGameState(Constants.GAME_OVER);
    
      } else if (gameState == Constants.GAME_OVER) {
        if (ui.startNewGame()) {
          state.clearBoard();
          score = 12.5;
          state.setGameState(Constants.STANDBY);
        } else {
         state.setGameState(Constants.QUIT_PROGRAM);
        }
      }
    }
  }
}
