package tarea3;

import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Ingrese un numero de referencia");
		int num1;
		num1 = sc.nextInt();
		System.out.println("Ingrese 10 numeros");
		for(int i=0;i<10;i++){
			int test = sc.nextInt();
			if(test>num1){
				numeros[i] = test;				
			}
		
			}
		
	for(int u=0;u < numeros.length;u++){
			
			System.out.println(numeros[u]);
		}
		
		
		sc.close();
	}

}
