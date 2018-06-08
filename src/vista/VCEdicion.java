package vista;

import Modelo.ModeloMain;
import Modelo.Persona;
import application.Main;
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
	
	private int index = -1;

	// Relaciona el main con el controlador
	public void setProgramaPrincipal(Main ProgramaPrincipal) {
		this.myMain = ProgramaPrincipal;
	}

	// abrir ventana
	public void setStagePrincipal(Stage ventana) {
		this.ventana = ventana;
	}

	// cerrar ventana -- clickar en cancel
	public void closeWindow() {
		this.ventana.close();
	}

	// clickar en OK
	public void OkPressed() {
		//¿están todos los campos llenos?
		if (TfNombre.getText().equals("") || TfApellido.getText().equals("") || TfTelefono.getText().equals("")) {
			ModeloMain.errorAlert("faltan datos");
			
			//hay algun error con el int telefono
			/**
			 * -1 error, no es un int
			 * 
			 * -2 error, no tiene la la longitud adecuada
			 */
		} else if (this.getTfTelefono() == -1 || this.getTfTelefono() == -2) {
			ModeloMain.errorAlert("datos mal introducidos");
			
		} else {
			if(index == -1) {
				ModeloMain.setdata(new Persona(this.getTfNombre(), this.getTfApellido(), this.getTfTelefono()));
			}else {
				ModeloMain.setdata(new Persona(this.getTfNombre(), this.getTfApellido(), this.getTfTelefono()), index);
			}
			
			
			closeWindow();
		}
	}

	// apellido
	public void setTfApellido(String apellido) {
		System.out.println(apellido + " 2");
		TfApellido.setText(apellido);
	}

	public String getTfApellido() {
		return TfApellido.getText();
	}

	// nombre
	public void setTfNombre(String sNombre) {
		TfNombre.setText(sNombre);
	}

	public String getTfNombre() {
		return TfNombre.getText();
	}

	// telefono
	public void setTfTelefono(int i) {
		TfTelefono.setText(Integer.toString(i));
	}

	public int getTfTelefono() {
		
		try {
			if (TfTelefono.getText().length() == 9 ){
				int i = Integer.parseInt(TfTelefono.getText());

				if (i < 0) {
					return -1;
				} else {
					return i;
				}
			}else {
				return -2;
			}
			
		} catch (Exception e) {
			return -1;
		}
	}
	
	public void setIndex(int index) {
		this.index = index;
	}
	
	public int getIndex() {
		return index;
	}
}
