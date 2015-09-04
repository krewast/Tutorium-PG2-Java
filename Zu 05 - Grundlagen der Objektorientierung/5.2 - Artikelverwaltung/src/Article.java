package de.oth.pg2_3;

public class Article {

	public  int articleNumber;
	public String description;
	public Color color;
	public Price price;
	
	public Article(){
		articleNumber = 0;
		description = "";
		price = new Price();
		color = new Color();
	}
	
	
	public int getArticleNumber() {
		return articleNumber;
	}


	public void setArticleNumber(int articleNumber) {
		this.articleNumber = articleNumber;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Color getColor() {
		return color;
	}


	public void setColor(Color color) {
		this.color = color;
	}


	public Price getPrice() {
		return price;
	}


	public void setPrice(Price price) {
		this.price = price;
	}


	public String toString(){
		return "\n Articlenumber: " + getArticleNumber()
				+ "\n Description: " + getDescription()
				+ "\n Price: " + getPrice() +
				"\n Color: " + getColor().toString();
	}

}
