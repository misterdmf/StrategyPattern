
public class StudentFareStrategy implements FaresStrategy{
	@Override
	public double getPrice(double normalFare) {
		return normalFare*0.5;
	}
}
