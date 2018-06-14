package Controler;

import Modelo.Alumno;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControlerMain {

	private final static ObservableList<Alumno> data = FXCollections.observableArrayList();

	public static ObservableList<Alumno> getData() {
		return data;
	}

	public static void setdata(Alumno pers) {
		System.out.println(pers.getMedia());
		data.add(pers);
	}

	public static void setdata(Alumno pers, int index) {
		data.set(index, pers);
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
