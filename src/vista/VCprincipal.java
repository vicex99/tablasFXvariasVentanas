package vista;

import java.net.URL;
import java.util.ResourceBundle;

import Modelo.Persona;
import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;

public class VCprincipal implements Initializable {
	
	private Main ProgramaPrincipal;

	@FXML
	private Button btnAceptar;
	
	@FXML
	private Button btnEditar;
	
	@FXML
	private Button btnBorrar;

	@FXML
	private TableView<Persona> miTabla;

	@FXML
	private TableColumn<Persona, String> colName;
	
	@FXML
	private TableColumn<Persona, String> colApe;
	
	@FXML
	private TableColumn<Persona, Integer> colTf;

	private final ObservableList<Persona> data = FXCollections.observableArrayList(
			new Persona("Javier", "Sanchez", 234534639), 
			new Persona("Víctor", "Álvarez", 256435734)
		);

	// Relaciona el main con el controlador
	public void setProgramaPrincipal(Main ProgramaPrincipal) {
		this.ProgramaPrincipal = ProgramaPrincipal;
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		miTabla.setItems(this.data);
		colName.setCellValueFactory(new PropertyValueFactory<Persona, String>("Nombre"));
		colApe.setCellValueFactory(new PropertyValueFactory<Persona, String>("Apellido"));
		colTf.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("telefono"));
	}

	@FXML
	private void ventanaIniciar() {
		this.ProgramaPrincipal.mostrarVentanaPrincipal();
	}
	
	
	public void Borrar() {
		if(miTabla.getSelectionModel().getSelectedItem()!=null) {
			miTabla.getItems().remove(miTabla.getSelectionModel().getSelectedItem());
			miTabla.getSelectionModel().clearSelection();
			
		}else {
			System.out.println("no hay selección");
			Alert alert = new Alert (AlertType.INFORMATION);
			alert.setTitle("Error al borrar");
			alert.setHeaderText("");
			alert.setContentText("intentando borrar un objeto no seleccionado, por favor seleccione una fila");
			
			alert.showAndWait();
		}
	}

	public void Nuevo() {
		

	}
}
