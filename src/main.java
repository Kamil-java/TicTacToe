
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        table game = new table();
        game.spaceBoard();
        String player = "X";
        do {
            System.out.println(game.printBoard());
            System.out.println("Enter your position row");
            int row = scanner.nextInt();
            System.out.println("Enter your position column");
            int col = scanner.nextInt();
            game.setPlay(row,col, player);
            if (game.isGameOver()){
                System.out.println(game.printBoard() + "\n" + "the player with " + player + " wins" );
                break;
            }
            if (player == "X")
                player = "O";
            else
                player = "X";
        }while (true);
    }
}
