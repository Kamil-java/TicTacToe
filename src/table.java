
public class table {
    private String[][] board;
    private int row = 3;
    private int column = 3;
    private String regex = "\\s{3}";

    public table() {
        board = new String[row][column];
    }
       public void spaceBoard(){
           for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                   board[i][j] = "   ";
               }
           }
       }
       public void setPlay (int i, int j, String player){
        if (this.board[i][j].matches(regex))
            board[i][j] = " " + player + " ";
       }

       public boolean isGameOver(){
           for (int i = 0; i < row; i++) {
               if (!board[i][0].matches(regex) && board[i][0].equals(board[i][1]) && board[i][1].equals(board[i][2])) {
                   return true;
               }
           }
           for (int j = 0; j < column; j++) {
               if (!board[0][j].matches(regex) && board[0][j].equals(board[1][j]) && board[1][j].equals(board[2][j])) {
                   return true;
               }
           }
           if (!board[0][0].matches(regex) && board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]))
           return true;
           if (!board[0][2].matches(regex) && board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0]))
           return true;
        return false;
       }

       public String printBoard(){
        StringBuilder strBoard = new StringBuilder();
           for (int i = 0; i < row; i++) {
               for (int j = 0; j < column; j++) {
                   if (j != column-1)
                   strBoard.append(board[i][j]).append("|");
                   else
                       strBoard.append(board[i][j]);
               }
               if (i !=column-1)
               strBoard.append("\n---+---+---\n");
           }
           return strBoard.toString();
       }
}

