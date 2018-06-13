package Modelo;

public class Alumno {

	private String nombre;
	private String apellido;
	private int media;

	public Alumno(String nombre, String apellido, int media) {
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

	//poner la media del alumno
	public void setMedia(int media) {
		this.media = media;
	}

	public int getMedia() {
		return media;
	}
}
