package tarea1;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Esto muestra los numeros del 1 al 10");
		
		for(int n = 1;n < 11; n++){
			
			System.out.print(n);
			
		}  

		
System.out.println("\nEsto muestra los numeros impares del 1 al 10");
		
		for(int n = 1;n < 11; n+=2){
			
			System.out.print(n);
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("\nCuantos años tenes?");
		int edad;
		edad = sc.nextInt();
		
		System.out.println("\nEdad: "+edad);

		sc.close();
	}

}
