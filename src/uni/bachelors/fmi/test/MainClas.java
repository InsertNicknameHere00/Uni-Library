package uni.bachelors.fmi.test;

import java.util.Scanner;

public class MainClas {

	public static void main(String[] args) {

		Library lib = new Library();

		lib.MainList.add(new Book("Shakespear", "2001", 150, "Barok"));
		lib.MainList.add(new Book("Hard Love", "2006", 150, "Romance"));
		lib.MainList.add(new Magazine("Shakespear", "2001", 25, "Da"));
		lib.MainList.add(new Magazine("Minecraft", "2010", 25, "Da"));
		lib.MainList.add(new Magazine("Youtuber's life", "2015", 25, "Da"));
		lib.MainList.add(new Magazine("Life of Markiplier", "2024", 25, "Da"));

		System.out.println("Enter the genre you wanna search for: ");

		Scanner input = new Scanner(System.in);
		String genre = input.nextLine();
		lib.setText(genre);

		lib.FindPeriodic();
		lib.BookGenreList();
		lib.MainList.get(5).GetInfo();
	}

}
