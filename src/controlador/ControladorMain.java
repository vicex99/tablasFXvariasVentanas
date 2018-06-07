package controlador;


import Modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ControladorMain{

	private final ObservableList<Persona> data = FXCollections.observableArrayList(
			new Persona("David", "Perez", 234234443),
			new Persona("Jose", "Dominguez", 342432423),
			new Persona("Pedro", "Camacho", 453302345)
	);
	
	public ObservableList<Persona> getData() {
		return data;
	}
	
	private void setData(Persona pers) {
		data.add(pers);
	}
}
