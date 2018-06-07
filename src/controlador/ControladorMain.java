package controlador;

import Modelo.Persona;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class ControladorMain{

	private final ObservableList<Persona> data = FXCollections.observableArrayList(
			new Persona("Javier", "Sanchez", 234534639), 
			new Persona("Víctor", "Álvarez", 256435734)
		);
	
	public ObservableList<Persona> getData() {
		return data;
	}
	
	private void setdata(Persona pers) {
		data.add(pers);

	}
}
