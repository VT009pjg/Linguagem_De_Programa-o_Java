package programa;

public class ProgramaInicial2 {

	public static void main(String[] args) {
		Garrafa g1 = new Garrafa();
		
		g1.marca = "Termica X";
		g1.capacidade = 500;
		g1.material = "Plástico";
		
		g1.abrir();
		g1.mostrarEstado();
		
		Garrafa g2 = new Garrafa();
		
		g2.marca = "AlluBottle";
		g2.capacidade = 750;
		g2.material = "Metal";
		
		g2.abrir();
		g2.fechar();
		g2.mostrarEstado();
		
		Garrafa g3 = new Garrafa();
		
		g3.marca = "GoTermic";
		g3.capacidade = 1000;
		g3.material = "Plático";
		
		g3.abrir();
		g3.mostrarEstado();
	}

}