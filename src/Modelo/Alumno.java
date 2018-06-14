package Modelo;

public class Alumno {

	private String nombre;
	private String apellido;
	private double media;

	private double notaFOLA;
	private double notaSSII;
	private double notaPROG;
	private double notaENDS;
	private double notaLMSGI;
	private double notaBBDD;

	public Alumno(String nombre, String apellido, double media) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.media = media;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	// poner la media del alumno
	public void setMedia(double media) {
		this.media = media;
	}

	public double getMedia() {
		return media;
	}

	// notaFOLA;
	public double getNotaFOLA() {
		return notaFOLA;
	}

	public void setNotaFOLA(double notaFOLA) {
		this.notaFOLA = notaFOLA;
	}
	// notaSSII;

	public void setNotaSSII(double notaSSII) {
		this.notaSSII = notaSSII;
	}

	public double getNotaSSII() {
		return notaSSII;
	}
	// notaPROG;

	public void setNotaPROG(double notaPROG) {
		this.notaPROG = notaPROG;
	}

	public double getNotaPROG() {
		return notaPROG;
	}
	// notaENDS;

	public void setNotaENDS(double notaENDS) {
		this.notaENDS = notaENDS;
	}

	public double getNotaENDS() {
		return notaENDS;
	}
	// notaLMSGI;

	public void setNotaLMSGI(double notaLMSGI) {
		this.notaLMSGI = notaLMSGI;
	}

	public double getNotaLMSGI() {
		return notaLMSGI;
	}

	// notaBBDD;
	public double getNotaBBDD() {
		return notaBBDD;
	}

	public void setNotaBBDD(double notaBBDD) {
		this.notaBBDD = notaBBDD;
	}
}
