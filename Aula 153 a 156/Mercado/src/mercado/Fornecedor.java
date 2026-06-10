package mercado;

class Fornecedor {

	private String nome;
	private String telefone;
	private String cidade;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		if (nome != null && !nome.isBlank()) {
			this.nome = nome;
		}else {
			System.out.println("Nome Inválido.");
		}
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		if (telefone != null && !telefone.isBlank()) {
			this.telefone = telefone;
		}else {
			System.out.println("Telefone Inválido.");
		}
	}
	
	public String getCidade() {
		return cidade;
	}
	
	public void setCidade(String cidade) {
		if (cidade != null && !cidade.isBlank()) {
			this.cidade = cidade;
		}else {
			System.out.println("cidade Inválida.");
		}
	}
}



