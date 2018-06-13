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
		
		setTfMedia();
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
		int media = (getTfFOLA() + getTfSSII() + getTfPROG() + getTfENDS() + getTfLMSGI() + getTfBBDD())/6;
		 TfMedia.setText(Integer.toString(media));
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

	// posicion en el observableList
	public void setIndex(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}

	// TfFOLA;
	public int getTfFOLA() {
		try {
			return Integer.parseInt(TfFOLA.getText());
		} catch (Exception e) {
			System.out.print("error getFola");
			e.getStackTrace();
		}
		return -1;
	}

	public void setTfFOLA(String FOLA) {
		TfFOLA.setText(FOLA);
	}

	// TfSSII;
	public int getTfSSII() {
		try {
			return Integer.parseInt(TfSSII.getText());
		} catch (Exception e) {
			System.out.print("error getSsii");
			e.getStackTrace();
		}
		return -1;
	}

	public void setTfSSII(String SSII) {
		TfSSII.setText(SSII);
	}

	// TfPROG
	public int getTfPROG() {
		try {
			return Integer.parseInt(TfPROG.getText());
		} catch (Exception e) {
			System.out.print("error geProg");
			e.getStackTrace();
		}
		return -1;
	}

	public void setTfPROG(String PROG) {
		TfPROG.setText(PROG);
	}

	// private TextField TfENDS;
	public int getTfENDS() {
		try {
			return Integer.parseInt(TfENDS.getText());
		} catch (Exception e) {
			System.out.print("error getEnds");
			e.getStackTrace();
		}
		return -1;
	}

	public void setTfENDS(String ENDS) {
		TfENDS.setText(ENDS);
	}
	
	// private TextField TfLMSGI;
	public int getTfLMSGI() {
		try {
			return Integer.parseInt(TfLMSGI.getText());
		} catch (Exception e) {
			System.out.print("error getLMSGI");
			e.getStackTrace();
		}
		return -1;
	}

	public void setTfLMSGI(String LMSGI) {
		TfLMSGI.setText(LMSGI);
	}
	
	// private TextField TfBBDD;
	public int getTfBBDD() {
		try {
			return Integer.parseInt(TfBBDD.getText());
		} catch (Exception e) {
			System.out.print("error getBBDD");
			e.getStackTrace();
		}
		return -1;
	}

	public void setTfBBDD(String BBDD) {
		TfBBDD.setText(BBDD);
	}
	
}
