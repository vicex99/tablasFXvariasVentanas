package vista;

import java.net.URL;
import java.util.ResourceBundle;

import Controler.ControlerMain;
import Modelo.Alumno;
import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class VCprincipal implements Initializable {

	private Main miMain;

	@FXML
	private Button btnAceptar;

	@FXML
	private Button btnEditar;

	@FXML
	private Button btnBorrar;

	@FXML
	private TableView<Alumno> miTabla;

	@FXML
	private TableColumn<Alumno, String> colName;

	@FXML
	private TableColumn<Alumno, String> colApe;

	@FXML
	private TableColumn<Alumno, Integer> colMedia;

	// Relaciona el main con el controlador
	public void setProgramaPrincipal(Main ProgramaPrincipal) {
		this.miMain = ProgramaPrincipal;
	}

	// public void setDatosTabla(DataAgenda datosTabla) {
	// this.datosTabla = datosTabla;
	// }

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		miTabla.setItems(ControlerMain.getData());
		colName.setCellValueFactory(new PropertyValueFactory<Alumno, String>("Nombre"));
		colApe.setCellValueFactory(new PropertyValueFactory<Alumno, String>("Apellido"));
		colMedia.setCellValueFactory(new PropertyValueFactory<Alumno, Integer>("nota media"));
	}

	@FXML
	private void ventanaIniciar() {
		this.miMain.mostrarAgenda();
	}

	public void borrar() {
		if (miTabla.getSelectionModel().getSelectedItem() != null) {
			miTabla.getItems().remove(miTabla.getSelectionModel().getSelectedItem());
			miTabla.getSelectionModel().clearSelection();
		} else {
			System.out.println("no hay selección");
			ControlerMain.errorAlert("intentando borrar un objeto no seleccionado, por favor seleccione una fila");
		}
	}

	public void modificar() {
		if (miTabla.getSelectionModel().getSelectedItem() != null) {
			miMain.mostrarEditorModifica(miTabla.getSelectionModel().getSelectedItem(),
					miTabla.getSelectionModel().getSelectedIndex());
		} else {
			System.out.println("no hay selección");
			ControlerMain.errorAlert("intentando editar un objeto no seleccionado, por favor seleccione una fila");
		}
	}

	public void insertar() {
		miMain.mostrarEditorInsertar();
	}
}
