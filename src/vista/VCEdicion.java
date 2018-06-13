package vista;

import Controler.ControlerMain;
import Modelo.Alumno;
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
	private TextField TfMedia;

	@FXML
	private Stage ventana;
	
	@FXML
	private TextField TfFOLA;
	@FXML
	private TextField TfSSII;
	@FXML
	private TextField TfPROG;
	@FXML
	private TextField TfENDS;
	@FXML
	private TextField TfLMSGI;
	@FXML
	private TextField TfBBDD;


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
		// ¿están todos los campos llenos?
		if (TfNombre.getText().equals("") || TfApellido.getText().equals("") || TfMedia.getText().equals("")) {
			ControlerMain.errorAlert("faltan datos");

		} else {
			if (index == -1) {
				ControlerMain.setdata(new Alumno(this.getTfNombre(), this.getTfApellido(), this.getTfMedia()));
			} else {
				ControlerMain.setdata(new Alumno(this.getTfNombre(), this.getTfApellido(), this.getTfMedia()), index);
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

	// media
	public void setTfMedia() {
//		TfMedia=notaFola + nota
	}

	public int getTfMedia() {
		try {
			return Integer.parseInt(TfMedia.getText());
		} catch (Exception e) {
			System.out.print("ERROR GETMEDIA - ");
			e.getStackTrace();
			return -1;
		}
	}

	//posicion en el observableList
	public void setIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
}
