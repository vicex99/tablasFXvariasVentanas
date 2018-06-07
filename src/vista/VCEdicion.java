package vista;

import java.net.URL;
import java.util.ResourceBundle;

import Modelo.Persona;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VCEdicion implements Initializable{
	@FXML
	private Button buttonCancel;

	@FXML
	private Button buttonOK;
	
	@FXML
	private TextField TfNombre;
	
	@FXML
	private TextField TfApellido;
	
	@FXML
	private TextField TfTelefono;
	
	@FXML
	private Stage ventana;
	
	private boolean okClicked = false;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
	}
	
	public void clickOK() {
		// TODO Auto-generated method stub
	}
	
	public void clickCancel() {
		// TODO Auto-generated method stub
	}
	
	public boolean isInputValid() {
		return okClicked;
	}
	
	private void setPerson(Persona pers) {
		// TODO Auto-generated method stub
	}

	public void setStagePrincipal(Stage ventana) {
		// TODO Auto-generated method stub
		this.ventana = ventana;
	}
}
