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
		/*
		 * if - comprobar si se han rellenado todos los campos
		 * 
		 * else if - comprobar si no da fallos o es un valor incorrecto
		 * 
		 * else - si todo esta bien pasa los datos a la otra pantalla
		 */
		if (TfNombre.getText().equals("") || TfApellido.getText().equals("") || TfBBDD.getText().equals("")
				|| TfENDS.getText().equals("") || TfFOLA.getText().equals("") || TfLMSGI.getText().equals("")
				|| TfPROG.getText().equals("") || TfSSII.getText().equals("")) {
			ControlerMain.errorAlert("faltan datos");

		} else if (getTfBBDD() == -1 || getTfENDS() == -1 || getTfFOLA() == -1 || getTfLMSGI() == -1
				|| getTfPROG() == -1 || getTfSSII() == -1 || getTfBBDD() > 10 || getTfENDS() > 10 || getTfFOLA() > 10
				|| getTfLMSGI() > 10 || getTfPROG() > 10 || getTfSSII() > 10 || getTfBBDD() < 0 || getTfENDS() < 0
				|| getTfFOLA() < 0 || getTfLMSGI() < 0 || getTfPROG() < 0 || getTfSSII() < 0) {

			ControlerMain.errorAlert("error al introducir los datos");

		} else {
			
			if (index == -1) {
				ControlerMain.setdata(new Alumno(this.getTfNombre(), this.getTfApellido(), this.getTfMedia(),
						this.getTfBBDD(), this.getTfENDS(), this.getTfFOLA(), this.getTfLMSGI(), this.getTfPROG(),
						this.getTfSSII()));
			} else {
				ControlerMain.setdata(new Alumno(this.getTfNombre(), this.getTfApellido(), this.getTfMedia(),
						this.getTfBBDD(), this.getTfENDS(), this.getTfFOLA(), this.getTfLMSGI(), this.getTfPROG(),
						this.getTfSSII()), index);
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
		double media = (getTfFOLA() + getTfSSII() + getTfPROG() + getTfENDS() + getTfLMSGI() + getTfBBDD()) / 6;
		TfMedia.setText(Double.toString(media));
	}

	public double getTfMedia() {
		try {
			double num = Double.parseDouble(TfMedia.getText());
			return Math.round(num * 100.0) / 100.0;
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

	// persona
	public void setAlumno(Alumno pers, int index) {
		setTfApellido(pers.getApellido());
		setTfNombre(pers.getNombre());
		setTfBBDD(pers.getNotaBBDD());
		setTfENDS(pers.getNotaENDS());
		setTfFOLA(pers.getNotaFOLA());
		setTfLMSGI(pers.getNotaLMSGI());
		setTfPROG(pers.getNotaPROG());
		setTfSSII(pers.getNotaSSII());
		setIndex(index);
	}

	// TfFOLA
	public double getTfFOLA() {
		try {
			double num = Double.parseDouble(TfFOLA.getText());
			return Math.round(num * 100.0) / 100.0;
		} catch (Exception e) {
			return -1;
		}

	}

	public void setTfFOLA(double FOLA) {
		TfFOLA.setText(Double.toString(FOLA));
	}

	// TfSSII
	public double getTfSSII() {
		try {
			double num = Double.parseDouble(TfSSII.getText());
			return Math.round(num * 100.0) / 100.0;
		} catch (Exception e) {
			return -1;
		}

	}

	public void setTfSSII(double SSII) {
		TfSSII.setText(Double.toString(SSII));
	}

	// TfPROG
	public double getTfPROG() {
		try {
			double num = Double.parseDouble(TfPROG.getText());
			return Math.round(num * 100.0) / 100.0;
		} catch (Exception e) {
			return -1;
		}

	}

	public void setTfPROG(double PROG) {
		TfPROG.setText(Double.toString(PROG));
	}

	// TfENDS
	public double getTfENDS() {
		try {
			double num = Double.parseDouble(TfENDS.getText());
			return Math.round(num * 100.0) / 100.0;
		} catch (Exception e) {
			return -1;
		}

	}

	public void setTfENDS(double ENDS) {
		TfENDS.setText(Double.toString(ENDS));
	}

	// TfLMSGI
	public double getTfLMSGI() {
		try {
			double num = Double.parseDouble(TfLMSGI.getText());
			return Math.round(num * 100.0) / 100.0;
		} catch (Exception e) {
			return -1;
		}

	}

	public void setTfLMSGI(double LMSGI) {
		TfLMSGI.setText(Double.toString(LMSGI));
	}

	// TfBBDD
	public double getTfBBDD() {
		try {
			double num = Double.parseDouble(TfBBDD.getText());
			return Math.round(num * 100.0) / 100.0;
		} catch (Exception e) {
			return -1;
		}

	}

	public void setTfBBDD(double BBDD) {
		TfBBDD.setText(Double.toString(BBDD));
	}

}
