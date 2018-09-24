
public class Program {

	public static void main(String[] args) {
		double total;
		AdultFareStrategy adultFareStrategy = new AdultFareStrategy();  
		StudentFareStrategy studentFareStrategy = new StudentFareStrategy();
		ChildFareStrategy childFareStrategy = new ChildFareStrategy();
		
		Transport bus = new Transport(adultFareStrategy, 2.0);
		bus.addPassager();
		bus.addPassager();
		bus.addPassager();
		
		total = bus.getAmount();
		
		System.out.println("Total with adult strategy: $"+total);
		
		Transport scholarBus = new Transport(studentFareStrategy, 2.0);
		scholarBus.addPassager();
		scholarBus.addPassager();
		scholarBus.addPassager();
		
		total = scholarBus.getAmount();
		
		System.out.println("Total with student strategy: $"+total);
		
		Transport littleBus = new Transport(childFareStrategy, 2.0);
		littleBus.addPassager();
		littleBus.addPassager();
		littleBus.addPassager();
		
		total = littleBus.getAmount();
		
		System.out.println("Total with child strategy: $"+total);
		
	}

}
