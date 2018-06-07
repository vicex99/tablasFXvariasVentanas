package vista;

import java.net.URL;
import java.util.ResourceBundle;

import Modelo.Persona;
import application.Main;
import controlador.ControladorMain;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VCprincipal implements Initializable {
	
	private Main ProgramaPrincipal;
	
	private ControladorMain mainControl;

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
	
	//vincula la vista con el controlerMain
	public void setMainControl(ControladorMain mainControl) {
		this.mainControl = mainControl;
	}

	// Relaciona el main con el controlador
	public void setProgramaPrincipal(Main ProgramaPrincipal) {
		this.ProgramaPrincipal = ProgramaPrincipal;
	}
	
	public void setItems(ObservableList<Persona> data) {
		miTabla.setItems(data);
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		
		colName.setCellValueFactory(new PropertyValueFactory<Persona, String>("nombre"));
		colApe.setCellValueFactory(new PropertyValueFactory<Persona, String>("apellido"));
		colTf.setCellValueFactory(new PropertyValueFactory<Persona, Integer>("telefono"));
	}

	@FXML
	private void ventanaIniciar() {
//		this.ProgramaPrincipal.mostrarVentanaPrincipal();
	}
	
	private void AlertNoSeleccion(Alert alerta) {
		// TODO Auto-generated method stub

	}
}
