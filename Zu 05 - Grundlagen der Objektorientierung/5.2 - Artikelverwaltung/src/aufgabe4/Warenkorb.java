package de.oth.pg2_3.aufgabe4;

import java.util.ArrayList;
import java.util.List;

import de.oth.pg2_3.Article;

public class Warenkorb {

	
	private List<Article> articles = new ArrayList<Article>();
	
	private static int artNr = 1;

	public int getSize(){
		return articles.size();
	}
	
	public List<Article> getArtList() {
		return articles;
	}
	
	public void addArticle(Article article){
		if (article.getArticleNumber() == 0){
			article.setArticleNumber(artNr++);
		}
		this.articles.add(article);
	}
	
	public boolean remove(int articleNumber){
		for (Article article : articles){
			if (article.getArticleNumber() == articleNumber){
				articles.remove(article);
				return true;
			}
		}
		return false;
	}
	
	public void print(){
		System.out.println(toString());
	}

	public void setArtList(List<Article> artList) {
		this.articles = artList;
	}

	@Override
	public String toString() {
		return "Warenkorb [articles=" + articles + "]";
	}
	
	public int getNewArtNr(){
		return artNr++;
	}
	
	
}
