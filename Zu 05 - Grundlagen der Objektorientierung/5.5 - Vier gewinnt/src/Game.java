package de.oth.pg2.viergewinnt;

import java.util.Scanner;

public class Game {

    private static int _moves;
    private static Scanner _userInput;

    public static void main(String[] args) {
        System.out.println("> Vier gewinnt <\n");

        // initialize
        Field field = new Field();
        this._moves = 0;
        this._userInput = new Scanner(System.in);

        Player player1 = createPlayer('X');
        Player player2 = createPlayer('O');

        player1.setField(field);
        player2.setField(field);

        this._field.print();

        while (true) {
            // play by alternate invoking of placeChip()
            Player current = this._moves % 2 == 0 ? player1 : player2;

            if (current.placeChip(readColumn(current)) == false) {
                // wrong user input - restart
                continue;
            }

            this._moves++;
            this._field.print();

            // check for winner
            Chip check = field.check();
            if (check != null) {
                Player winner = Player.findByChip(check);
                System.out.println(winner.getName() + " gewinnt!");
                break;
            }

            // check if Field is full
            if (this._moves == Field.WIDTH * Column.HEIGHT) {
                System.out.println("Unentschieden!");
                break;
            }

        }

        System.out.println("(Spielende nach " + moves + " zügen)");
        System.out.println("\nVielen Dank für´s Spielen!");

        userInput.close();
    }

    // creates new Player from user input
    private static Player createPlayer(char consoleOut) {
        String name;
        System.out.println("Bitte geben Sie den Namen für Spieler (" + consoleOut + ") ein:");
        name = userInput.nextLine();

        Chip chip = new Chip(consoleOut);
        return (new Player(name, chip));
    }

    // prints name of player and reads column number from keyboard
    private static int readColumn(Player player) {
        int input;

        System.out.print(player.getName() + ", Sie sind an der Reihe! Bitte Spalte eingeben:");
        while (true) {
            // userInput.reset();
            input = userInput.nextInt();

            if (input > 0 && input <= Field.WIDTH) {
                return --input;
            } else {
                System.out.print("Falsche Eingabe! Bitte erneut eingeben:");
            }
        }
    }
}
