package vista;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class VCEdicion {
	@FXML
	private Button buttonCancel;

	@FXML
	private Button buttonOK;
	
	@FXML
	private Stage ventana;

	public void setStagePrincipal(Stage ventana) {
		// TODO Auto-generated method stub
		this.ventana = ventana;
	}

	public void closeWindow(){
		this.ventana.close();
	}
}