package controlador;

import Modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControladorMain {

	private final static ObservableList<Persona> data = FXCollections.observableArrayList(
			new Persona("Javier", "Sanchez", 234534639), new Persona("Víctor", "Álvarez", 256435734));

	public static ObservableList<Persona> getData() {
		return data;
	}

	public static void setdata(Persona pers) {
		data.add(pers);
	}
	
	public static void setdata(Persona pers, int index) {
		data.set(index, pers);
	}
	
	public static Alert errorAlert(String error) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Error al borrar");
		alert.setHeaderText("");
		alert.setContentText(error);

		alert.showAndWait();
		return alert;
	}
}
