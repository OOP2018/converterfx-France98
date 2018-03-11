package application;

/**
 * Fixed the set of static instances.
 * @author Phanuwatch Luangpradit
 *
 */
public enum Length {

	Mile(1609.344),
	Kilometer(1000.0),
	Meter(1.0),
	Centimeter(0.01),
	foot(0.3048),
	wa(2.0),
	AU(149597870700.0);
	
	private final double VALUE;

	private Length(double value){
		this.VALUE = value;
	}
	
	public double getValue(){
		return this.VALUE;
	}
}
