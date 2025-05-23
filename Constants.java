/**
 *  game constants
 */

public class Constants
{
    // Valid board size
    public static final int BOARD_SIZE = 10;

    // Valid board values
    public static final int X = -1;    // Indicates an "X"
   
    public static final int BLANK = 0; // Indicates a blank square

    // Game states
    public static final int STANDBY = 0;
    public static final int GET_X_NAME = 1;
    public static final int GET_X_MOVE = 3;
    public static final int MAKE_MOVE = 5;
    public static final int CHECK_IF_LOSE = 6;
    public static final int CHECK_IF_WIN = 7;
    public static final int X_LOSES = 8;
    public static final int GAME_OVER = 10;
    public static final int QUIT_PROGRAM = 11;
    public static final int X_WINS = 12;
    
    // Strings
    public static final String DIVIDER_STRING = "|---|---|---|---|---|---|---|---|---|---|";
    public static final String BOARD_STRING = "| %s | %s | %s | %s | %s | %s | %s | %s | %s | %s |";
    public static final String GET_PLAYER_NAME = "Player %s: What is your name?";
    public static final String TITLE = "Thanks for playing Tic-Tac-Toe!";
    public static final String GET_ROW_MOVE = "Player %s (%s): Enter the row for your next move. Enter 0 to pull out.";
    public static final String GET_COL_MOVE = "Player %s (%s): Enter the column for your next move";
    public static final String INVALID_ROW_OR_COLUMN = "Your row and column must be 1, 2, 3, 4, 5, 6, 7, 8, 9, 10";
    public static final String INVALID_MOVE_ERROR = "Row %d column %d is not a valid move. Please try again";
    public static final String PRINT_MOVE = "Player %s (%s) move to %d %d";
    public static final String WINNER = "%s - %s is the loser!";
    public static final String TIE_GAME = "It's a tie game!";
    public static final String START_NEW_GAME = "Start a new game (Y or N)?";
    public static final String PULL_OUT = "Are you sure you want to pull out? Enter 0 again if you want to pull out.";
}
