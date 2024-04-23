package uni.bachelors.fmi.test;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	private String text;

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	static ArrayList<Paper> MainList = new ArrayList<>();

	static ArrayList<Paper> getMainList() {
		return MainList;
	}

	static void setMainList(ArrayList<Paper> mainList) {
		MainList = mainList;
	}

	public void FindPeriodic() {
		int counter = 0;

		for (Paper periodic : MainList) {
			if (periodic instanceof Magazine) {
				Magazine periodictemp = (Magazine) periodic;

				if (periodictemp.isPeriodichni() == "Da") {
					counter++;
				}

			}
		}
		System.out.println("The amount of periodic magazines is: " + counter);
	}

	public void BookGenreList() {

		for (Paper book : MainList) {
			if (book instanceof Book) {
				Book booktemp = (Book) book;
				if (booktemp.getGenre().equals(text)) {
					booktemp.GetInfo();
				}
			}
		}
	}
}