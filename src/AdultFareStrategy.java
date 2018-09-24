
public class AdultFareStrategy implements FaresStrategy{
	@Override
	public double getPrice(double normalFare) {
		return normalFare;
	}
}
