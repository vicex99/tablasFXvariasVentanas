package Modelo;

public class Persona {

	private String nombre;
	private String apellido;
	private int media;


	public Persona(String nombre, String apellido, int media) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.media = 0;

	}
	
	public int getMedia() {
		return media;
	}
	
	public  void setMedia(int media) {
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
}
