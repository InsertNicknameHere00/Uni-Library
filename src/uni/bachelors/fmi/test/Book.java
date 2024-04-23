package uni.bachelors.fmi.test;

public class Book extends Paper {
private String Genre;
	public String getGenre() {
	return Genre;
}
public void setGenre(String genre) {
	Genre = genre;
}
	public Book(String title, String year, int pages,String genre) {
		super(title, year, pages);
		this.Genre=genre;
	}

}
