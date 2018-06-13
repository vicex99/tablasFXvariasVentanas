package Modelo;

public class Persona {

	private String nombre;
	private String apellido;
	private static int media;

	private int tf;
	private int fola;
	private int ends;
	private int ssii;
	private int lmsgi;
	private int prog;
	private int bbdd;

	public Persona(String nombre, String apellido, double bbdd, double ends, double fola, double lmsgi, int prog, int ssii) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.media = 0;

		this.fola = fola;
		this.ends = ends;
		this.ssii = ssii;
		this.lmsgi = lmsgi;
		this.prog = prog;
		this.bbdd = bbdd;
	}
	
	public int getMedia() {
		return media;
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

	public int getFola() {
		return fola;
	}

	public void setFola(int fola) {
		this.fola = fola;
	}

	public int getBbdd() {
		return bbdd;
	}

	public void setBbdd(int bbdd) {
		this.bbdd = bbdd;
	}

	public int getEnds() {
		return ends;
	}

	public void setEnds(int ends) {
		this.ends = ends;
	}

	public int getLmsgi() {
		return lmsgi;
	}

	public void setLmsgi(int lmsgi) {
		this.lmsgi = lmsgi;
	}

	public int getProg() {
		return prog;
	}

	public void setProg(int prog) {
		this.prog = prog;
	}

	public int getSsii() {
		return ssii;
	}

	public void setSsii(int ssii) {
		this.ssii = ssii;
	}
}
