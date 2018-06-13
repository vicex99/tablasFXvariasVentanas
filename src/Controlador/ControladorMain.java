package Controlador;

import Modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControladorMain {
	
	private static double media;

	private final static ObservableList<Persona> data = FXCollections.observableArrayList(
			new Persona("Javier", "Sanchez", 8, 8, 8, 8, 8, 8), new Persona("Víctor", "Álvarez", 10, 10, 10, 10, 10, 10));

	public static ObservableList<Persona> getData() {
		return data;
	}

	public static void setdata(Persona pers) {
		data.add(pers);
	}

	public static void setdata(Persona pers, int index) {
		data.set(index, pers);
	}
	
	public void setMedia(double bbdd, double ends, double fola, double lmsgi, double prog, double ssii) {
		media = (bbdd + ends + fola + lmsgi + prog + ssii) / 2;
	}
	
	public static double getMedia() {
		return media;
	}

	public static Alert errorAlert(String error) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("mensaje error");
		alert.setHeaderText("");
		alert.setContentText(error);

		alert.showAndWait();
		return alert;
	}
}
