package ejercicioEmpleados;

public class Administrativo extends Empleado {

	
	private int hsExtras;
	private int hsMes;
	
	public Administrativo() {
		
	}
	
	
	
	public int getHsExtras() {
		return hsExtras;
	}
	public void setHsExtras(int hsExtras) {
		this.hsExtras = hsExtras;
	}
	public int getHsMes() {
		return hsMes;
	}
	public void setHsMes(int hsMes) {
		this.hsMes = hsMes;
	}
	
	
	@Override
	
	public float getSueldo() {
		float sueldo;
		sueldo = (float) (this.getSueldoBase() * ((hsExtras * 1.5)+hsMes));
		return sueldo;
	}
	

@Override
	
	public String toString(){
		String mensaje= "Nombre y apellido: "+this.getNombre()+" "+this.getApellido()+" - DNI: "+this.getDni()+" - Email: "+this.getEmail()+" - Sueldo: "+this.getSueldo();
		return mensaje;
	}
	
}