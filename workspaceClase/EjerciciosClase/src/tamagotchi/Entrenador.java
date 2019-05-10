package tamagotchi;

public class Entrenador extends Persona {

	private String especialidad;

	public Entrenador(String nombre, int dni, String especialidad) {
		super(nombre, dni);
		this.especialidad = especialidad;
	}

	public String getEspecialidad() {
		return especialidad;
	}

	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	
	
}
