import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (game.getCurrentPlayer() == 'X') {
                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (game.placeXAndY(a, b)) {
                    game.printBoard();
                    if (game.win()) {
                        System.out.println("Игрок '" + game.getCurrentPlayer() + "' выиграл!");
                        break;
                    }
                    game.changePlayer();
                } else {
                    System.out.println("Неверный ход. Попробуйте еще раз.");
                }
                System.out.println("_________________________");
            } else {
                game.botMove();
             game.printBoard();
                if (game.win()) {
                    System.out.println("Бот выиграл!");
                    break;
                }
                game.changePlayer();
            }
        }
    }
}








            




