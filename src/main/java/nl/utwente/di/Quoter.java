package nl.utwente.di;

public class Quoter {
	double temp;
	public double getBookPrice(String s) {
		switch(s) {
		case("1"):
			temp = 10.0;
			break;
		case("2"):
			temp = 45.0;
			break;
		case("3"):
			temp = 20.0;
			break;
		case("4"):
			temp = 35.0;
			break;
		case("5"):
			temp = 50.0;
			break;
		case("others"):
			temp = 0.0;
			break;
		}
		return temp;
	}
}
