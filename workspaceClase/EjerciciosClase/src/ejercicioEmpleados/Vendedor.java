package ejercicioEmpleados;

public class Vendedor extends Empleado {
	
	private int porcenCom;
	private int totalVentas;
	
	
	public Vendedor() {
		
	}
	
	public int getPorcenCom() {
		return porcenCom;
	}
	public void setPorcenCom(int porcenCom) {
		this.porcenCom = porcenCom;
	}
	public int getTotalVentas() {
		return totalVentas;
	}
	public void setTotalVentas(int totalVentas) {
		this.totalVentas = totalVentas;
	}
	
	@Override
	public float getSueldo() {
		float sueldo;
		sueldo = this.getSueldoBase() + ((porcenCom*totalVentas)/100);
		return sueldo;
	}

@Override
	
	public String toString(){
		String mensaje= "Nombre y apellido: "+this.getNombre()+" "+this.getApellido()+" - DNI: "+this.getDni()+" - Email: "+this.getEmail()+" - Sueldo: "+this.getSueldo();
		return mensaje;
	}
	
}
