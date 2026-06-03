package Programa;

import java.util.Scanner;

public class OperacoesDoisInteiros {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero1, numero2, resultado;
		
		System.out.print("Digite o Primeiro Inteiro: ");
		numero1 = entrada.nextInt();
		
		System.out.print("Digite o Segundo Inteiro: ");
		numero2 = entrada.nextInt();
		
		System.out.printf("A Soma é %d%n", numero1 + numero2);
		System.out.printf("A Multiplicação é %d%n", numero1 * numero2);
		System.out.printf("A Subtração é %d%n", numero1 - numero2);
		System.out.printf("A Divisão é %d%n", numero1 / numero2);

	}

}
