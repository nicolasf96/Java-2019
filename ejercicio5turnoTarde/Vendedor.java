package ejercicio5turnoTarde;

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

	
	
}
