package Modelo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class DataAgenda {

	private final ObservableList<Persona> data = FXCollections.observableArrayList(
			new Persona("Javier", "Sanchez", 234534639), 
			new Persona("Víctor", "Álvarez", 256435734)
		);
	
	public ObservableList<Persona> getData() {
		return data;
	}
	
	public Persona getData(int index) {
		return data.get(index);
	}
	
	private void setData(String nombre, String apellido, int telf) {
		data.add(new Persona(nombre, apellido, telf));
	}
}
