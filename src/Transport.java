
public class Transport {
	private FaresStrategy faresStrategy;
	private int passagers;
	private double normalPrice;
	
	public Transport(FaresStrategy faresStrategy, double normalPrice) {
		this.faresStrategy = faresStrategy;
		passagers = 0;
		this.normalPrice = normalPrice;
	}
	
	public void addPassager() {
		passagers++;
	}
	
	public double getAmount() {
		return passagers * faresStrategy.getPrice(normalPrice);
	}
}
