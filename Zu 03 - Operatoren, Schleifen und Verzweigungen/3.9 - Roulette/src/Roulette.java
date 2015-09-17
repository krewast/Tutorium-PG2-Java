import java.util.Scanner;

public class Roulette {
    public static void main(String[] args) {
        // "Initialisierung" des Spiels
        Scanner sc = new Scanner(System.in);
        System.out.println("Willkommen beim Roulette");
        int playerMoney = 1000;

        // Check, ob noch Geld zur Verfügung steht
        while (playerMoney > 0) {
            System.out.println("Ihr aktuelles Guthaben beträgt " + playerMoney + " Euro.");
            System.out.print("Bitte setzen Sie einen Betrag für Ihr nächstes Spiel: ");
            int bet = sc.nextInt();

            // Check, ob gesetzter Betrag kleiner oder gleich dem verbleibenden Geld des Spielers
            if (bet <= playerMoney) {
                System.out.print("Bitte setzen Sie auf eine Farbe (r/s) oder eine Zahl (1-35): ");
                String choice = sc.next();

                // Gewählten Einsatz vom Guthaben des Spielers abziehen
                playerMoney -= bet;

                // Spielen
                int random = getRandomNumber();
                boolean playerWon = false;
                if (choice.equals("r")) {
                    // Wenn gerade Zahl, dann rot
                    if (random % 2 == 0) {
                        System.out.println(random + " - Rot gewinnt, Glückwunsch");
                        playerMoney += bet * 2;
                        playerWon = true;
                    }
                } else if (choice.equals("s")) {
                    // Wenn ungerade Zahl, dann schwarz
                    if (random % 2 != 0) {
                        System.out.println(random + " - Schwarz gewinnt, Glückwunsch");
                        playerMoney += bet * 2;
                        playerWon = true;
                    }
                } else if ((Integer.valueOf(choice) >= 1 && Integer.valueOf(choice) <= 36)) {
                    if (random == Integer.valueOf(choice)) {
                        System.out.println(random + " - Sie gewinnen, Glückwunsch");
                        playerMoney += bet * 35;
                        playerWon = true;
                    }
                } else {
                    System.err.println("Ungueltige Auswahl, neu beginnen!");
                }

                if (!playerWon) {
                    System.out.println(random + " - Leider verloren");
                }
            } else {
                System.err.println("Der eingesetzte Betrag übersteigt Ihr Guthaben. Bitte neu setzen.");
            }

            System.out.println("--------------------");
        }
        System.out.println("Vielen Dank für Ihren Besuch");
    }

    public static int getRandomNumber() {
        // Achtung: Zufallszahlen richtig hinzubekommen ist gar nicht immer so leicht wie es vielleicht scheint
        // Eine schöne Anleitung findet sich hier: http://stackoverflow.com/a/363732
        int min = 1;
        int max = 36;
        int randomInteger = min + (int)(Math.random() * ((max - min) + 1));
        return randomInteger;
    }
}
