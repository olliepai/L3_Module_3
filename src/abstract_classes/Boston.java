package abstract_classes;

public class Boston extends City {
	Boston(int population, double growthRate) {
		super(population, growthRate);
	}
	
	public double getAnnualTaxes() {
		return (population * growthRate) + (population * 0.5);
	}
}
