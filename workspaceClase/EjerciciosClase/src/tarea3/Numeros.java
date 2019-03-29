
/* leer 1 num, luego leer 10 mas, almacenar solo los mayores al inicial
y mostrarlos al final y sin nulls
almacenarlos en orden y sin espacios intermedios
*/

package tarea3;

import java.util.Arrays;
import java.util.Scanner;

public class Numeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		System.out.println("Ingrese un numero de referencia");
		int num1;
		int espacioEnArray = 0;
		num1 = sc.nextInt();
	
		System.out.println("Ingrese 10 numeros");
		
		for(int i=0;i<10;i++){
			int test = sc.nextInt();
			if(num1<test){
				numeros[espacioEnArray] = test;	
				espacioEnArray++;
			}
		
			}
		Arrays.sort(numeros);
		for(int i=0;i<=espacioEnArray;i++){
			
			if(numeros[i] != 0){
			System.out.println(numeros[i]);
			}
		}
		
		
		sc.close();
	}

}
