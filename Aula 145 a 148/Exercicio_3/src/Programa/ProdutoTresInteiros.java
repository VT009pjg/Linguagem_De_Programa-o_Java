package Programa;

import java.util.Scanner; 

public class ProdutoTresInteiros {
	public static void main(String[] args) {
	  Scanner entrada = new Scanner(System.in);
	  
	  int x, y, z, resultado;
	  
	  System.out.print("Digite o Primeiro Inteiro: ");
	  x = entrada.nextInt();
	  
	  System.out.print("Digite o Segundo Inteiro: ");
	  y = entrada.nextInt();
	  
	  System.out.print("Digite o Terceiro Inteiro: ");
	  z = entrada.nextInt();
	  
	  resultado = x * y * z;
	  
	  System.out.printf("Resultado é %d%n", resultado);
	}

}
