package abstract_classes;

public class LosAngeles extends City {
	LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	}
	
	public double getAnnualTaxes() {
		return (population * growthRate) * (0.5 * growthRate);
	}
}
