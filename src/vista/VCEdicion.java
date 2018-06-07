package vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VCEdicion {

	@FXML
	private TextField TfNombre;

	@FXML
	private TextField TfApellido;

	@FXML
	private TextField TfTelefono;

	@FXML
	private Button buttonCancel;

	@FXML
	private Button buttonOK;

	@FXML
	private Stage ventana;

	public void setStagePrincipal(Stage ventana) {
		this.ventana = ventana;
	}

	public void closeWindow() {
		this.ventana.close();
	}
}
