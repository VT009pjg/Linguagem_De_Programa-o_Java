package Programa;

import java.util.Scanner;

public class Diametro {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double raio;
		
		System.out.print("Digite o Raio do Circulo: ");
		raio = entrada.nextInt();
		
		System.out.printf("O Diametro do Circulo é: %.0f%n", 2 * raio);
		System.out.printf("A Circuferência do Círculo é: %f%n", 2 * Math.PI * raio);
		System.out.printf("A Área do Círculo é: %f%n: ", Math.PI * Math.pow(raio, 2));

	}

}
