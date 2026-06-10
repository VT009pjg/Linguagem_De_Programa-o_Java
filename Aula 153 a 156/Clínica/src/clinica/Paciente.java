package clinica;

class Paciente {

	String nome;
	int idade;
	double peso;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		this.nome = "Pedro"
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if (idade >= 0) {
			this.idade = idade;
		}else {
			System.out.println("Idade Inválida!!")
		}
	}
}
