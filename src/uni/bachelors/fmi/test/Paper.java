package uni.bachelors.fmi.test;

public class Paper {

	private String Title;

	public String getTitle() {
		return Title;
	}

	public void setTitle(String title) {
		Title = title;
	}

	public String getYear() {
		return Year;
	}

	public void setYear(String year) {
		Year = year;
	}

	public Paper(String title, String year, int pages) {
		super();
		Title = title;
		Year = year;
		Pages = pages;
	}

	public int getPages() {
		return Pages;
	}

	public void setPages(int pages) {
		Pages = pages;
	}

	private String Year;
	private int Pages;
	
 public void GetInfo() {
	 System.out.println("The Title is: " + Title + "\n The Year is: " + Year + "\n The amount of Pages is: " + Pages);
 }
}
