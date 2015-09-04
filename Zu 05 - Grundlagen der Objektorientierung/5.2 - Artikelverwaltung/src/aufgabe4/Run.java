package de.oth.pg2_3.aufgabe4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import de.oth.pg2_3.Article;

public class Run {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Article a1 = new Article();

		a1.articleNumber = 2;

		Article a2 = new Article();

		a2.articleNumber = 3;

		Warenkorb warenkorb = new Warenkorb();

		warenkorb.addArticle(a1);

		warenkorb.addArticle(a2);

		warenkorb.print();

		warenkorb.remove(2);

		warenkorb.print();
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
