import java.util.Scanner;

public class batalha {

    public static void main(String[] args) {
        int x, y;
        int i;
        int vidaP1 = 5;
        int vidaP2 = 5;
        Scanner scanner = new Scanner(System.in);
        char tabuleiroPlayer1[][] = new char[5][5];
        char tabuleiroPlayer2[][] = new char[5][5];
        char tabuleiroTiroPlayer1[][] = new char[5][5];
        char tabuleiroTiroPlayer2[][] = new char[5][5];

        for (i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabuleiroPlayer1[i][j] = '-';
                tabuleiroPlayer2[i][j] = '-';
                tabuleiroTiroPlayer1[i][j] = '-';
                tabuleiroTiroPlayer2[i][j] = '-';
            }
        }
        System.out.println("Welcome to Battleship!!!");
        // player1
        System.out.println("Player1, choose your ship placement, five of them ('x' and 'y' position, from 0 to 4)");

        for (i = 0; i < 5; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            while (x > 4 || x < 0 || y > 4 || y < 0) {
                System.out.println("Wrong positions, try again...");
                x = scanner.nextInt();
                y = scanner.nextInt();
            }
            if ((tabuleiroPlayer1[x][y] == '@')) {
                System.out.println("There is already a ship in this position.");
                i = i - 1;
            }
            else if ((x <= 4 && x >= 0) && (y <= 4 && y >= 0)) {
                tabuleiroPlayer1[x][y] = '@';
            } else {
                System.out.println("Wrong positions, try again...");
                i = i - 1;
            }
        }

        System.out.println("  0 1 2 3 4");

        for (i = 0; i < 5; i++) {
            System.out.printf("%d ", i);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%c ", tabuleiroPlayer1[i][j]);
            }
            System.out.println();
        }
        // player2
        System.out.println();
        System.out.println("Player2, choose your ship placement, five of them ('x' and 'y' position, from 0 to 4)");

        for (i = 0; i < 5; i++) {
            x = scanner.nextInt();
            y = scanner.nextInt();
            while (x > 4 || x < 0 || y > 4 || y < 0) {
                System.out.println("Wrong positions, try again...");
                x = scanner.nextInt();
                y = scanner.nextInt();
            }
            if ((tabuleiroPlayer2[x][y] == '@')) {
                System.out.println("There is already a ship in this position.");
                i = i - 1;
            }
            else if ((x <= 4 && x >= 0) && (y <= 4 && y >= 0)) {
                tabuleiroPlayer2[x][y] = '@';
            } else {
                System.out.println("Wrong positions, try again...");
                i = i - 1;
            }
        }
        System.out.println();
        System.out.println("  0 1 2 3 4");

        for (i = 0; i < 5; i++) {
            System.out.printf("%d ", i);
            for (int j = 0; j < 5; j++) {
                System.out.printf("%c ", tabuleiroPlayer2[i][j]);
            }
            System.out.println();
        }

        while (vidaP1 != 0 && vidaP2 != 0) {
            // parte player1
            System.out.println("Player 1 choose where to shoot A BAZUKA");
            x = scanner.nextInt();
            y = scanner.nextInt();

            if ((x <= 4 && x >= 0) && (y <= 4 && y >= 0)) {
                while (tabuleiroPlayer2[x][y] == 'O' || tabuleiroPlayer2[x][y] == 'X') {
                    System.out.println("You have already shooted here, try again...");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    while (x > 4 || x < 0 || y > 4 || y < 0) {
                        System.out.println("Wrong positions, try again...");
                        x = scanner.nextInt();
                        y = scanner.nextInt();
                    }
                }
                if (tabuleiroPlayer2[x][y] == '@') {
                    System.out.println("Voce acertooou");
                    vidaP2 -= 1;
                    tabuleiroPlayer2[x][y] = 'X';
                    tabuleiroTiroPlayer1[x][y] = 'X';
                }
                if (tabuleiroPlayer2[x][y] == '-') {
                    System.out.println("Voce EROOOU");
                    tabuleiroPlayer2[x][y] = 'O';
                    tabuleiroTiroPlayer1[x][y] = 'O';
                }
                System.out.println("  0 1 2 3 4");
                for (i = 0; i < 5; i++) {
                    System.out.printf("%d ", i);
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("%c ", tabuleiroTiroPlayer1[i][j]);
                    }
                    System.out.println();
                }

                System.out.println("Player 2 choose where to shoot A BAZUKA");
                x = scanner.nextInt();
                y = scanner.nextInt();
                while (x > 4 || x < 0 || y > 4 || y < 0) {
                    System.out.println("Wrong positions, try again...");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                }

                while (tabuleiroPlayer1[x][y] == 'O' || tabuleiroPlayer1[x][y] == 'X') {
                    System.out.println("You have already shooted here, try again...");
                    x = scanner.nextInt();
                    y = scanner.nextInt();
                    while (x > 4 || x < 0 || y > 4 || y < 0) {
                        System.out.println("Wrong positions, try again...");
                        x = scanner.nextInt();
                        y = scanner.nextInt();
                    }
                }
                if (tabuleiroPlayer1[x][y] == '@') {
                    System.out.println("Voce acertooou");
                    vidaP1 -= 1;
                    tabuleiroPlayer1[x][y] = 'X';
                    tabuleiroTiroPlayer2[x][y] = 'X';
                }
                if (tabuleiroPlayer1[x][y] == '-') {
                    System.out.println("Voce EROOOU");
                    tabuleiroPlayer1[x][y] = 'O';
                    tabuleiroTiroPlayer2[x][y] = 'O';
                }
                System.out.println("  0 1 2 3 4");
                for (i = 0; i < 5; i++) {
                    System.out.printf("%d ", i);
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("%c ", tabuleiroTiroPlayer2[i][j]);
                    }
                    System.out.println();
                }
            }else {
                System.out.println("Wrong positions, try again...");
            }

        }
        if(vidaP1 == 0){
            System.out.println("O player 2 venceeeu");
        }
        else{
            System.out.println("O player 1 venceeeu");
        }
        scanner.close();
    }
}