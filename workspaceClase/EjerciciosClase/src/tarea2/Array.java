package tarea2;

import java.util.Scanner;


public class Array {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] palabras = new String[5];
		
		for(int i=0;i<5;i++){
			
			System.out.println("Ingrese la palabra n " +(i+1));
			palabras[i] = sc.nextLine();
		}
		
		for(int i= palabras.length-1; i>=0;i--){
			
			System.out.println(palabras[i]);
		}
		
		sc.close();
	}

}
