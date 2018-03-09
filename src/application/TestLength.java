package application;

public class TestLength {

	public static void main(String[] args) {
		Length[] lengths = Length.values();
		for (Length x : lengths) {
			System.out.println(x.toString() + " = " + x.getValue());
		}
	}
}
