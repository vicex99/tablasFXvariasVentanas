package vista;

import Controlador.ControladorMain;
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
	private TextField TfNotaMedia;

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
		// ¿están todos los campos llenos?
		if (TfNombre.getText().equals("") || TfApellido.getText().equals("") || TfBBDD.getText().equals("")
				|| TfENDS.getText().equals("") || TfBBDD.getText().equals("") || TfFOLA.getText().equals("")
				|| TfLMSGI.getText().equals("") || TfPROG.getText().equals("") || TfSSII.getText().equals("")) {
			ControladorMain.errorAlert("faltan datos");

		} else {
			if (index == -1) {
				ControladorMain.setdata(new Persona(this.getTfNombre(), this.getTfApellido(), this.getMedia()));
			} else {
				ControladorMain.setdata(new Persona(this.getTfNombre(), this.getTfApellido(), this.getMedia()), index);
			}

			closeWindow();
		}
	}

	// index
	public void setIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
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
	
	//nota media
	public String getTfNotaMedia() {
		return TfNotaMedia.getText();
	}
	
	public void setTfNotaMedia() {
		TfNotaMedia = tfNotaMedia;
	}

	// FOLA
	public int getFola() {
		try {
			return Integer.parseInt(TfFOLA.getText());
		} catch (Exception e) {
			ControladorMain.errorAlert("ERROR al introducir los datos");
			return 0;
		}
	}

	public void setFola(int fola) {
		this.TfFOLA.setText(Integer.toString(fola));
	}

	// BBDD
	public int getBbdd() {
		try {
			return Integer.parseInt(TfBBDD.getText());
		} catch (Exception e) {
			ControladorMain.errorAlert("ERROR al introducir los datos");
			return 0;
		}
	}

	public void setBbdd(int fola) {
		this.TfBBDD.setText(Integer.toString(fola));
	}

	// ENDS
	public int getEnds() {
		try {
			return Integer.parseInt(TfENDS.getText());
		} catch (Exception e) {
			ControladorMain.errorAlert("ERROR al introducir los datos");
			return 0;
		}
	}

	public void setEnds(int ends) {
		this.TfENDS.setText(Integer.toString(ends));
	}

	// LMSGI
	public int getLmsgi() {
		try {
			return Integer.parseInt(TfLMSGI.getText());
		} catch (Exception e) {
			ControladorMain.errorAlert("ERROR al introducir los datos");
			return 0;
		}
	}

	public void setLmsgi(int lmsgi) {
		this.TfLMSGI.setText(Integer.toString(lmsgi));
	}

	// PROG
	public int getProg() {
		try {
			return Integer.parseInt(TfPROG.getText());
		} catch (Exception e) {
			ControladorMain.errorAlert("ERROR al introducir los datos");
			return 0;
		}
	}

	public void setProg(int prog) {
		this.TfPROG.setText(Integer.toString(prog));
	}

	// SSII
	public int getSsii() {
		try {
			return Integer.parseInt(TfSSII.getText());
		} catch (Exception e) {
			ControladorMain.errorAlert("ERROR al introducir los datos");
			return 0;
		}
	}

	public void setSsii(int ssii) {
		this.TfSSII.setText(Integer.toString(ssii));
	}
}
