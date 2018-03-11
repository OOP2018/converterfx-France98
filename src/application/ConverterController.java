package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

/**
 * UI controller for events and initializing components.
 * @author Phanuwatch Luangpradit
 *
 */
public class ConverterController {

	@FXML
	TextField tx1;
	@FXML
	TextField tx2;
	@FXML
	Button convertButton;
	@FXML
	Button clearButton;
	@FXML
	private ComboBox<Length> combo1;
	@FXML 
	private ComboBox<Length> combo2;

	/**
	 * Convert a distance from one unit to another.
	 * @param event
	 */
	public void handleConvert(ActionEvent event) {
		double first = 0;
		double second = 0;
		Length unit1 = combo1.getValue();
		Length unit2 = combo2.getValue();
		if (!tx1.getText().isEmpty()) {
			first = 0;
			try {
				first = Double.parseDouble(tx1.getText().trim());
				tx1.setStyle("-fx-text-inner-color: black;");
				tx2.setStyle("-fx-text-inner-color: black;");
				if (first == 0) {
					second = (second * unit2.getValue()) / unit1.getValue();
					tx1.setText(String.format("%.4g", second));
				} else {
					first = (first * unit1.getValue()) / unit2.getValue();
					tx2.setText(String.format("%.4g", first));
				}
			} catch (NumberFormatException e) {
				tx1.setText("Invalid Number");
				tx1.setStyle("-fx-text-inner-color: red;");
			}
		}else if(!tx2.getText().isEmpty()){
			second = 0;
			try {
				second = Double.parseDouble(tx2.getText().trim());
				tx1.setStyle("-fx-text-inner-color: black;");
				tx2.setStyle("-fx-text-inner-color: black;");
				if (first == 0) {
					second = (second * unit2.getValue()) / unit1.getValue();
					tx1.setText(String.format("%.4g", second));
				} else {
					first = (first * unit1.getValue()) / unit2.getValue();
					tx2.setText(String.format("%.4g", first));
				}
			} catch (NumberFormatException e) {
				tx2.setText("Invalid Number");
				tx2.setStyle("-fx-text-inner-color: red;");
			}
		}

	}

	/**
	 * Clear the TextField and change the color to black
	 * @param event
	 */
	public void handleClear(ActionEvent event) {
		tx1.clear();
		tx2.clear();
		tx1.setStyle("-fx-text-inner-color: black;");
		tx2.setStyle("-fx-text-inner-color: black;");
	}
	
	/**
	 * JavaFX calls the initialize() method of your controller when
	 * it creates the UI from, after the components have been created
	 * and @FXML annotated attributes have been set.
	 * 
	 * This is a hook to initialize anything your controller or UI needs.
 	 */
	@FXML
	public void initialize(){
		System.out.println("Running initialize");
		if(combo1 != null){
			combo1.getItems().addAll(Length.values());
			combo1.getSelectionModel().select(0);
		}
		if(combo2 != null){
			combo2.getItems().addAll(Length.values());
			combo2.getSelectionModel().select(1);
		}
	}

}
