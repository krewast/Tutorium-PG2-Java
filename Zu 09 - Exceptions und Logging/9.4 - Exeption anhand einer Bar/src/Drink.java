public class Drink
{
    // Instance fields
    //Die perfekte Temperatur für ein kaltes Getränk
    private int _perfektTemperature = 8;
    //Die aktuelle Temperatur des Getränkes
    private int _actTemperature;

    // Constructors
    public Drink(int temperature)
    {
        this.setActTemperature(temperature);
    }

    // Getters
    public int getActTemperature()
    {
        return _actTemperature;
    }
    public int getPerfektTemperature()
    {
        return _perfektTemperature;
    }

    // Setters
    public void setActTemperature(int actTemperature)
    {
        this._actTemperature = actTemperature;
    }

    public void setPerfektTemperature(int perfektTemperature)
    {
        this._perfektTemperature = perfektTemperature;
    }
}
