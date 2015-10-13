package oth.pg2;

import java.util.List;
import java.util.Scanner;

public class Run2 {

    public static void main(String[] args) {
        List<Article> articles = MainHelper.initializeArticles();
        System.out.println("Bitte zu suchendende Artikelnummer eingeben:");

        Scanner sc = new Scanner(System.in);
        int searchAricleNumber = sc.nextInt();
        
        boolean found = false;
        for (Article article : articles) {
            if (article.getArticleNumber() == searchAricleNumber) {
                System.out.println(article);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No article found");
        }

        sc.close();
    }

}
