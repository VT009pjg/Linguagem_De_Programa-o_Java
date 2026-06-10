package mercado;

class Item {

	private String descricao;
	private double preco;
	private int qtd;
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		if(preco > 0) {
			this.preco = preco;
	
		} else {
			System.out.println("Preço Inválido!!");
		}
	}
	
	public double getQtd() {
		return qtd;
	}
	
	
	public void setQtd(int qtd) {
		if(qtd >= 0) {
			this.qtd = qtd;
	
		} else {
			System.out.println("Quantidade Inválida!!");
		}
	}
	
}
