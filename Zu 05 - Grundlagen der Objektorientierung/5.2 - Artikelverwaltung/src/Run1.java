package oth.pg2;

import java.util.List;

import oth.pg2.Article;

public class Run1 {

    public static void main(String[] args) {
        // we will use initializeArticles in other functions, that is why 
        // you can look it up in MainHelper
        List<Article> articles = MainHelper.initializeArticles();

        for (Article article : articles) {
            System.out.println(article);
        }
    }

}
