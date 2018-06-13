package Controler;

import Modelo.Alumno;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class ControlerMain {

	private final static ObservableList<Alumno> data = FXCollections.observableArrayList(
			new Alumno("Javier", "Sanchez", 234534639), new Alumno("Víctor", "Álvarez", 256435734));

	public static ObservableList<Alumno> getData() {
		return data;
	}

	public static void setdata(Alumno pers) {
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
