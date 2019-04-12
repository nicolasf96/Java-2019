package ejercicio5turnoTarde;
import java.util.Scanner;


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Ingrese 20 empleados");
		Scanner sc = new Scanner(System.in);
		int bandera = 0;
		Empleado[] empleados = new Empleado[20];
		for(int i=0;i <20;i++){

		System.out.println("El empleado que va a cargar es Administrativo(A) o Vendedor(V)?");
		
		String opcion = sc.nextLine();
		opcion.toLowerCase();
		switch(opcion) {
		  case "a":
			  			  
			  Administrativo admi = new Administrativo();
			  System.out.println("Ingrese dni: ");
			  admi.setDni(sc.nextInt());
			  System.out.println("Ingrese nombre: ");
			  admi.setNombre(sc.nextLine());
			  System.out.println("Ingrese apellido: ");
			  admi.setApellido(sc.nextLine());
			  System.out.println("Ingrese email: ");
			  admi.setEmail(sc.nextLine());
			  System.out.println("Ingrese hsExtras: ");
			  admi.setHsExtras(sc.nextInt());
			  System.out.println("Ingrese hsMes: ");
			  admi.setHsMes(sc.nextInt());
			  empleados[i] = admi;
			  bandera++;
		    break;
		  case "v":
			  
			  Vendedor vende = new Vendedor();
			  System.out.println("Ingrese dni: ");
			  vende.setDni(sc.nextInt());
			  System.out.println("Ingrese nombre: ");
			  vende.setNombre(sc.nextLine());
			  System.out.println("Ingrese apellido: ");
			  vende.setApellido(sc.nextLine());
			  System.out.println("Ingrese email: ");
			  vende.setEmail(sc.nextLine());
			  System.out.println("Ingrese porcenCom: ");
			  vende.setPorcenCom(sc.nextInt());
			  System.out.println("Ingrese totalVentas: ");
			  vende.setTotalVentas(sc.nextInt());
			  empleados[i] = vende;
			  bandera++;
		    break;
		  default:
		    System.out.println("Opcion incorrecta. Introduzca nuevamente");
		    
		  
			}
		
		 System.out.println("Quiere seguir cargando Empleados? (S) o (N)");
		    opcion = sc.nextLine();
		    opcion.toLowerCase();
		    if(opcion != "s") {
		    	i=21;
		    	}
		}
		
		
		System.out.println("Lista de empleados: ");
		for(int i=0;i<empleados.length;i++) {
			System.out.print(empleados[i].getDni()+" - ");
			System.out.print(empleados[i].getNombre()+" - ");
			System.out.print(empleados[i].getApellido()+" - ");
			System.out.print(empleados[i].getSueldo()+" - ");
		}
		
		
			
		sc.close();
			
	}

}
