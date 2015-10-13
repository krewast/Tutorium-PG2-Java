package oth.pg2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainHelper {
    
    /*
     * Ask the user to enter all articles.
     */
    public static List<Article> initializeArticles() {
        boolean oneMore = true;
        List<Article> articles = new ArrayList<Article>();
        Scanner sc = new Scanner(System.in);

        while (oneMore) {
            articles.add(MainHelper.getArticle(sc));
            System.out.print("\nWeiteren Artikel einlesen? (0/1)");
            oneMore = sc.nextInt() == 1;
        }
        sc.close();
        return articles;
    }

    /*
     * Ask user to enter one specific article 
     */
    public static Article getArticle(Scanner sc) {
        Article ret = new Article();

        System.out.println("Neuer Artikel:");
        System.out.print("Artikelnummer: ");
        ret.setArticleNumber(sc.nextInt());

        System.out.print("Beschreibung: ");
        String tmp = sc.next();
        tmp += sc.nextLine();
        ret.setDescription(tmp);

        System.out.print("Preis: ");
        ret.getPrice().setValue(sc.nextDouble());

        System.out.print("Waehrung: ");
        ret.getPrice().setCurrency(sc.next());

        System.out.print("Farbe (rot-Komponente): ");
        ret.getColor().setRed(sc.nextInt());

        System.out.print("Farbe (gruen-Komponente): ");
        ret.getColor().setGreen(sc.nextInt());

        System.out.print("Farbe (blau-Komponente): ");
        ret.getColor().setBlue(sc.nextInt());

        return ret;
    }
    
}
