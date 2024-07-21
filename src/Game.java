import java.util.Random;

public class Game {


  private   char currentPlayer = 'X';

    private char[][] matrix;

    public Game() {
        matrix = new char[3][3];
        initializeBoard();
    }

    public char getCurrentPlayer() {
        return currentPlayer;
    }

    public void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = '-';
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public boolean placeXAndY(int a, int b) {
        if (a >= 0 && b >= 0 && a <3 && b <3) {
            if (matrix[a][b] == '-') {
                matrix[a][b] = currentPlayer;
                return true;
            }
        }
        return false;
    }

    public void changePlayer() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }
    public boolean win(){

            for (int i = 0; i < 3; i++) {
                if (matrix[i][0] == currentPlayer && matrix[i][1] == currentPlayer && matrix[i][2] == currentPlayer) {
                    return true;
                }
            }


            for (int i = 0; i < 3; i++) {
                if (matrix[0][i] == currentPlayer && matrix[1][i] == currentPlayer && matrix[2][i] == currentPlayer) {
                    return true;
                }
            }


            if (matrix[0][0] == currentPlayer && matrix[1][1] == currentPlayer && matrix[2][2] == currentPlayer) {
                return true;
            }

            if (matrix[0][2] == currentPlayer && matrix[1][1] == currentPlayer && matrix[2][0] == currentPlayer) {
                return true;
            }

            return false;

        }

    public void botMove() {
        Random rand = new Random();
        int a, b;
        while (true) {
            a = rand.nextInt(3);
            b = rand.nextInt(3);
            if (matrix[a][b] == '-') {
                matrix[a][b] = 'O';
                break;
            }
        }
    }


    }




