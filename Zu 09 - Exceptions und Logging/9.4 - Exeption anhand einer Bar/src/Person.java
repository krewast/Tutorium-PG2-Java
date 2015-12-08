public class Person
{
    // Public Methods
    /*
     * Die Methode "drink" stellt den Vorgang des Trinkens dar und wirft im Falle eines zu
     * heißen bzw. zu kalten Getränkes die entprechende Exception
     */
    public void drink(Drink drink) throws TooColdException, TooHotException
    {
        if (drink.getActTemperature() < drink.getPerfektTemperature() - 2)
        {
            throw new TooColdException();
        } else if (drink.getActTemperature() > drink.getPerfektTemperature() + 2)
        {
            throw new TooHotException();
        }
    }
}
