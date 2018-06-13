package Controlador;

import Modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControladorMain {
	
	private static double media;

	//Datos de la tabla
	private final static ObservableList<Persona> data = FXCollections.observableArrayList();

	public static ObservableList<Persona> getData() {
		return data;
	}

	public static void setdata(Persona pers) {
		data.add(pers);
	}

	public static void setdata(Persona pers, int index) {
		data.set(index, pers);
	}
	
	//alertas de error
	public static Alert errorAlert(String error) {
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("mensaje error");
		alert.setHeaderText("");
		alert.setContentText(error);

		alert.showAndWait();
		return alert;
	}
}
