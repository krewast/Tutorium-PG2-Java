package oth.pg2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    // instance variables
    private List<Article> _articles = new ArrayList<Article>();
    private int _articleNumber = 1;

    // getter
    public int getSize() {
        return this._articles.size();
    }

    public List<Article> getArtList() {
        return this._articles;
    }
    
    public int getNewArtNr() {
        return this._articleNumber++;
    }
    
    // setter 
    public void setArtList(List<Article> artList) {
        this._articles = artList;
    }

    // operations
    public void add(Article article) {
        if (article.getArticleNumber() == 0) {
            article.setArticleNumber(this._articleNumber++);
        }
        this._articles.add(article);
    }

    public boolean remove(int articleNumber) {
        for (Article article : this._articles) {
            if (article.getArticleNumber() == articleNumber) {
                this._articles.remove(article);
                return true;
            }
        }
        return false;
    }

    public void print() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Shopping Cart [articles=" + this._articles + "]";
    }

    

}
