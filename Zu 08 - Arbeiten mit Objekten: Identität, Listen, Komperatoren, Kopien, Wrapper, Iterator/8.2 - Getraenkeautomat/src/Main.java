public class Main {

    public static void main(String[] args) {

        VendingMachine vendingMachine = new VendingMachine();

        // Endlosschleife
        while (true) {
            System.out.println("--------------------------------------------------------------------");
            vendingMachine.showAvailableBeverages();
            vendingMachine.chooseAndPayBeverage();
            System.out.println("--------------------------------------------------------------------");
            // Ausgabe des Reports erleichtert die Fehlersuche (Teilaufgabe 8.2.3)
            vendingMachine.printStatusReport();
        }
    }
}
