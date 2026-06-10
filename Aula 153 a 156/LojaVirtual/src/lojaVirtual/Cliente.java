package lojaVirtual;

class Cliente {
	
	private String nome;
	private int idade;
	private String email;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoNome) {
		this.nome = "Vitor";
		
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int idade) {
		if(idade >= 0) {
			this.idade = idade;
	
		} else {
			System.out.println("Idade Inválida!!");
		}
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		if (email != null && !email.isBlank()) {
			this.email = email;
		}else {
			System.out.println("Email Inválido.");
		}
	}
}