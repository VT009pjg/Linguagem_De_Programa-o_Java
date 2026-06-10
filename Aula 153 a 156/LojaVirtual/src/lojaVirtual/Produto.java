package lojaVirtual;

class Produto {

	private String nome;
	private double preco;
	private int qtdEstoque;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String novoProduto) {
		this.nome = "Celular";
		
	}

	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco >= 0) {
			this.preco = preco;
	
		} else {
			System.out.println("Preço Inválido!!");
		}
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		if(qtdEstoque >= 0) {
			this.qtdEstoque = qtdEstoque;
	
		} else {
			System.out.println("Estoque Inválido!!");
		}
	}
}
