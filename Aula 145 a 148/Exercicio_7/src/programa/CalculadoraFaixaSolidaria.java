package programa;

import java.util.Scanner;

public class CalculadoraFaixaSolidaria {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		double kmDia;
		double precoPorLitro;
		double kmPorLitro;
		double estacionamentoPorDia;
		double pedagioPorDia;
		
		System.out.print("Qulômetros Totais Dirigidos por Dia: ");
		kmDia = entrada.nextInt();
		
		System.out.print("Preço por Litro de Gasolina: ");
		precoPorLitro = entrada.nextInt();
		
		System.out.print("Quilômetros Totais Dirigidos por Dia: ");
		kmPorLitro = entrada.nextInt();
		
		System.out.print("Taxas de Estacionamento por Dia: ");
		estacionamentoPorDia = entrada.nextInt();
		
		System.out.print("Pedágio por Dia: ");
		pedagioPorDia = entrada.nextInt();
		
		double litrosGastos = kmDia / kmPorLitro;
		double combustivelGasto = litrosGastos * precoPorLitro;
		double custoTotal = combustivelGasto + estacionamentoPorDia + pedagioPorDia;
		
		System.out.printf("Litros gatos é: %f%n", litrosGastos);
		System.out.printf("Total Gsato com Combustível:%f%n", combustivelGasto);
		System.out.printf("Custo Total: %f R$%n", custoTotal);
	}

}
