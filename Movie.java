package BookMyShow;


public class Movie {
	String mname;
	double mprice;
	double mduration;
	String mgenre;

	Movie(String mname, double mprice, double mduration, String mgenre) {
		this.mname = mname;
		this.mprice = mprice;
		this.mduration = mduration;
		this.mgenre = mgenre;
	}

	@Override
	public String toString() {
		return "Movie Name: " + mname + " Movie Price: " + mprice + " Movie Duration: " + mduration + " Movie Genre:  "
				+ mgenre;
	}

}
