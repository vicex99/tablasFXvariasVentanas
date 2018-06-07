package vista;

import Modelo.Persona;
import application.Main;
import controlador.ControladorMain;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class VCEdicion {
	
	private Main myMain;

	@FXML
	private TextField TfNombre;

	@FXML
	private TextField TfApellido;

	@FXML
	private TextField TfTelefono;

	@FXML
	private Stage ventana;
	
	// Relaciona el main con el controlador
	public void setProgramaPrincipal(Main ProgramaPrincipal) {
		this.myMain = ProgramaPrincipal;
	}

	//abrir ventana
	public void setStagePrincipal(Stage ventana) {
		this.ventana = ventana;
	}

	//cerrar ventana --  clickar en cancel
	public void closeWindow() {
		this.ventana.close();
	}
	
	//clickar en OK
	public void OkPressed() {
		ControladorMain.setdata(new Persona(getTfNombre(), getTfApellido(), getTfTelefono()));
		closeWindow();
		myMain.mostrarAgenda();
	}
	
	//apellido
	public void setTfApellido(String apellido) {
		System.out.println(apellido + " 2");
		TfApellido.setText(apellido);
	}
	public String getTfApellido() {
		return TfApellido.getText();
	}
	
	//nombre
	public void setTfNombre(String sNombre) {
		TfNombre.setText(sNombre);
	}
	public String getTfNombre() {
		return TfNombre.getText();
	}
	
	//telefono
	public void setTfTelefono(int i) {
		TfTelefono.setText(Integer.toString(i));
	}
	public int getTfTelefono() {
		return Integer.parseInt(TfTelefono.getText());
	}
}
