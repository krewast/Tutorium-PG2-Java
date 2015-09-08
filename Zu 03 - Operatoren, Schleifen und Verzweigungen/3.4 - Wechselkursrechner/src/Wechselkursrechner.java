import java.util.Scanner;

public class Wechselkursrechner {
    public static void main(String[] args) {
        // Wechselkurs 1 Euro == 1.2756 Dollar
        double exchangeRate = 1.2756;
        // Euro Cent coins
        int[] coins = {1, 2, 5, 10, 20, 50, 100, 200};
        int totalCents = 0;
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < coins.length; i++) {
            System.out.print(String.format("Wie viele %3d-Cent Münzen haben Sie? ", coins[i]));
            totalCents += sc.nextInt() * coins[i];
        }

        System.out.println(String.format("Sie haben %.2f Euro, das entspricht %.2f Dollar.", totalCents / 100f, totalCents * exchangeRate / 100f));
    }
}
