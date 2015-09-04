package de.oth.pg2_3.aufgabe_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.oth.pg2_3.Article;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		boolean oneMore = true;
		boolean found = false;
		List<Article> articles = new ArrayList<Article>();
		Scanner sc = new Scanner(System.in);

		while (oneMore) {
			articles.add(getArticle(sc));
			System.out.print("\nWeiteren Artikel einlesen? (0/1)");
			oneMore = sc.nextInt() == 1;
		}
		sc.close();

		for (Article article : articles){
			if (article.getPrice().getValue() > 100.0f) {
				System.out.println(article);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No articles found");
		}
	}
	
	public static Article getArticle(Scanner sc) {
		Article ret = new Article();

		System.out.println("Neuer Artikel:");
		System.out.print("Artikelnummer: ");
		ret.setArticleNumber(sc.nextInt());

		System.out.print("Beschreibung: ");
		String tmp = sc.next();
		tmp += sc.nextLine();
		ret.setDescription(tmp);
		// ret.setDescription(sc.nextLine());

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
