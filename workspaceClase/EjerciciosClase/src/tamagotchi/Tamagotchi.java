package tamagotchi;

public class Tamagotchi {
	
	private String nombre;
	private int hambre;
	private int sed;
	private String tipoAnimal;
	
	
	
	public Tamagotchi(String nombre) {
		super();
		this.nombre = nombre;
	}


	public Tamagotchi(String nombre, String tipoAnimal) {
		super();
		this.nombre = nombre;
		this.tipoAnimal = tipoAnimal;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getHambre() {
		return hambre;
	}
	public void setHambre(int hambre) {
		this.hambre = hambre;
	}
	public int getSed() {
		return sed;
	}
	public void setSed(int sed) {
		this.sed = sed;
	}
	public String getTipoAnimal() {
		return tipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		this.tipoAnimal = tipoAnimal;
	}
	
	

}
