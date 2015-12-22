import java.util.Scanner;

public class MainProgram {

	public static void main(String[] args) {

		// Erstellt einen neue Bar
		VirtualPub vPub = new VirtualPub(10);
		// Erzeugt einen Kunden
		Person custumer = new Person();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out
					.print("Gebe die Temperatur eines kalten Getränkes ein: ");
			String input = sc.next();
			int temperature = 0;
			try {
				temperature = Integer.parseInt(input);
			} catch (NumberFormatException e) {
				System.out.println("Es werden nur ganze Zahlen akzeptiert");
				return;
			}

			// Erstellt eine neues kaltes Getränk und setzt die optimale
			// Temperatur
			Drink drink = new Drink(temperature);
			try {
				vPub.serveCustomer(custumer, drink);
				System.out
						.println("Das Getränk ist optimal und der Kunde ist zufrieden");
			} catch (TooColdException e) {
				System.out.println("Getränk ist zu kalt");
			} catch (TooHotException e) {
				System.out.println("Getränk ist zu warm");
			} catch (StorageEmpty e) {
				System.out.println("Kein Getränk mehr im Lager");
			}
		}
	}
}
