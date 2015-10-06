package de.oth.pg2.grosseUebung.aufgabe3;

import java.util.ArrayList;
import java.util.List;

public class Person {

	private String name;

	private List<String> likesList = new ArrayList<String>();
	private List<String> lovesList = new ArrayList<String>();
	private List<String> hatesList = new ArrayList<String>();

	private String text;

	public Person(String text) {

		this.text = text;

		// Casten
		generateName();

		firstStatment(text.substring(0, text.indexOf(",")));

		if (text.substring(text.indexOf(",") + 1).indexOf(",") != -1) {
			lastStatment(text.substring(text.indexOf(","),
					text.indexOf(",", text.indexOf(",") + 1)));

			lastStatment(text.substring(text.indexOf(",",text.indexOf(",")+1)));
		}
		else {

			lastStatment(text.substring(text.indexOf(",")));
		}


	}

	private void firstStatment(String substring) {

		if (substring.indexOf("likes") != -1) {

			if (substring.indexOf("and") != -1) {
				likesList.add(substring.substring(
						substring.indexOf("likes") + 6,
						substring.indexOf("and") - substring.indexOf("likes")
								+ 3));

				likesList
						.add(substring.substring(substring.indexOf("and") + 4));

			} else {
				likesList
						.add(substring.substring(substring.indexOf("likes") + 6));
			}
		} else if (substring.indexOf("hates") != -1) {
			if (substring.indexOf("and") != -1) {
				hatesList.add(substring.substring(
						substring.indexOf("hates") + 6,
						substring.indexOf("and") - substring.indexOf("hates")
								+ 3));

				hatesList
						.add(substring.substring(substring.indexOf("and") + 4));

			} else {
				hatesList
						.add(substring.substring(substring.indexOf("hates") + 6));
			}
		} else if (substring.indexOf("loves") != -1) {
			if (substring.indexOf("and") != -1) {
				lovesList.add(substring.substring(
						substring.indexOf("loves") + 6,
						substring.indexOf("and") - substring.indexOf("loves")
								+ 3));

				lovesList
						.add(substring.substring(substring.indexOf("and") + 4));

			} else {
				lovesList
						.add(substring.substring(substring.indexOf("loves") + 6));
			}
		}
	}

	private void lastStatment(String substring) {

		// Aussortieren von "and", wenn dieses zweimal vorkommt.

		if (substring.indexOf("and") != -1) {
			if (substring.indexOf("and", substring.indexOf("and")) != -1) {
				substring = substring.substring(4);
			}
		}

		if (substring.indexOf("likes") != -1) {

			if (substring.indexOf("and") != -1) {
				likesList.add(substring.substring(
						substring.indexOf("likes") + 6,
						substring.indexOf("and") - substring.indexOf("likes")
								+ 1));

				likesList
						.add(substring.substring(substring.indexOf("and") + 4));

			} else {
				likesList
						.add(substring.substring(substring.indexOf("likes") + 6));
			}
		} else if (substring.indexOf("hates") != -1) {
			if (substring.indexOf("and") != -1) {
				hatesList.add(substring.substring(
						substring.indexOf("hates") + 6,
						substring.indexOf("and") - substring.indexOf("hates")
								+ 1));

				hatesList
						.add(substring.substring(substring.indexOf("and") + 4));

			} else {
				hatesList
						.add(substring.substring(substring.indexOf("hates") + 6));
			}
		} else if (substring.indexOf("loves") != -1) {
			if (substring.indexOf("and") != -1) {
				lovesList.add(substring.substring(
						substring.indexOf("loves") + 6,
						substring.indexOf("and") - substring.indexOf("loves")
								+ 1));

				lovesList
						.add(substring.substring(substring.indexOf("and") + 4));

			} else {
				lovesList
						.add(substring.substring(substring.indexOf("loves") + 6));
			}
		}
	}

	private void generateName() {

		name = text.substring(0, text.indexOf(" "));

	}

	public void print() {
		System.out.println(name + " likes: " + likesList + " loves: "
				+ lovesList + " hates: " + hatesList);
	}
}
