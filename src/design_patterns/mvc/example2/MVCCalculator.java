package design_patterns.mvc.example2;

// referred from https://www.youtube.com/watch?v=dTVVa2gfht8

public class MVCCalculator {

	public static void main(String[] args) {
		CalculatorView theView = new CalculatorView();
		CalculatorModel theModel = new CalculatorModel();
		CalculatorController theController = new CalculatorController(theView, theModel);
		theView.setVisible(true);
	}
}