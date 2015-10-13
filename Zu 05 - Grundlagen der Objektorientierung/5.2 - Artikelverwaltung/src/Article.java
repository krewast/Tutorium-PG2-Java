package oth.pg2;

public class Article {

    public int _articleNumber;
    public String _description;
    public Color _color;
    public Price _price;

    public Article() {
        this._articleNumber = 0;
        this._description = "";
        this._price = new Price();
        this._color = new Color();
    }

    public int getArticleNumber() {
        return this._articleNumber;
    }

    public void setArticleNumber(int articleNumber) {
        this._articleNumber = articleNumber;
    }

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String description) {
        this._description = description;
    }

    public Color getColor() {
        return this._color;
    }

    public void setColor(Color color) {
        this._color = color;
    }

    public Price getPrice() {
        return this._price;
    }

    public void setPrice(Price price) {
        this._price = price;
    }

    public String toString() {
        return "\n Articlenumber: " + getArticleNumber() + 
                "\n Description: " + getDescription() + 
                "\n Price: " + getPrice() + 
                "\n Color: " + getColor().toString();
    }

}
