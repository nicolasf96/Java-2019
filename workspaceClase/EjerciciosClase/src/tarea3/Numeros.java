package tarea3;

import java.util.Arrays;
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
			if(test== 0){break;};
			if(test>num1){
				numeros[i] = test;				
			}
		
			}
		Arrays.sort(numeros);
	for(int numero:numeros){
			System.out.println(numeros[numero]);
		}
		
		
		sc.close();
	}

}
