package abstract_classes;

public class Atlanta extends City {
	Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}
	
	public double getAnnualTaxes() {
		return (population * growthRate) * (2 * growthRate);
	}
}
