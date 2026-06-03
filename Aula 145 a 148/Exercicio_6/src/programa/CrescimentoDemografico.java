package programa;

public class CrescimentoDemografico {
	public static void main(String[] args) {
		
		long populacao = 8300000000L;
		
		double taxaDemografica = 0.033;
		
		short anos = 1;
		
		System.out.printf("População Mundial Aproximada no Primeiro Ano é de: %f%n ", populacao * (Math.pow (1 + taxaDemografica, anos)));
		anos++;
		
		System.out.printf("População Mundial Aproximada no Segundo Ano é de: %f%n ", populacao * (Math.pow (1 + taxaDemografica, anos)));
		anos++;
		
		System.out.printf("População Mundial Aproximada no Terceiro Ano é de: %f%n ", populacao * (Math.pow (1 + taxaDemografica, anos)));
		anos++;
		
		System.out.printf("População Mundial Aproximada no Quarto Ano é de: %f%n ", populacao * (Math.pow (1 + taxaDemografica, anos)));
		anos++;
		
		System.out.printf("População Mundial Aproximada no Primeiro Ano é de: %f%n ", populacao * (Math.pow (1 + taxaDemografica, anos)));
		anos++;
		
	}	
	

}
