public class VirtualPub
{
    // Instance fields
    int _storage;

    // Constructors
    public VirtualPub(int storage)
    {
        this._storage = storage;
    }

    // Public methods
    /*
     * Die Methode "serveCustomer" stellt das Bedienen eines Kunden dar, sie versorgt die Person
     * mit dem Gewünschten Drink und löst das Trinken aus. Falls das Lager leer ist wird eine
     * entsprechende Exception geworfen
     */
    public void serveCustomer(Person custumer, Drink drink)
            throws TooColdException, TooHotException, StorageEmpty
    {
        if (_storage >= 1)
        {
            // Alles Prima, Getränke wurde bestellt und zum Kunden gebracht
            _storage--;
            System.out.println("Neuer Vorrat: " + _storage);

            custumer.drink(drink);

        } else
        {
            // Vorrat reicht nicht mehr aus, und eine Fehlermeldung wird geworfen
            throw new StorageEmpty();
        }
    }
}
