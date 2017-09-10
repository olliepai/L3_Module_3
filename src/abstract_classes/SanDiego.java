package abstract_classes;

public class SanDiego extends City {
	SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}
	
	public double getAnnualTaxes() {
		return (population * growthRate) + 1000000;
	}
}
