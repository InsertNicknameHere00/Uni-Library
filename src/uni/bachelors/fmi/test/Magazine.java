package uni.bachelors.fmi.test;

public class Magazine extends Paper {
private String Periodichni;

	public Magazine(String title, String year, int pages, String periodichni) {
		super(title, year, pages);
		this.Periodichni=periodichni;
	}

	public String isPeriodichni() {
		return Periodichni;
	}

	public void setPeriodichni(String periodichni) {
		Periodichni = periodichni;
	}

}
