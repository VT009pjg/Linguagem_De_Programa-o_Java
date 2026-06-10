package mercado;

public class App {

	public static void main(String[] args) {
		Item item = new Item();
		
		item.setDescricao("Sistema Operacional/ Windons 11");
		item.setPreco(959.99);
		item.setQtd(11);
		
		System.out.println("===== Item =====");
		System.out.println("Descrição: " + item.getDescricao());
		System.out.println("Preço: " + item.getPreco());
		System.out.println("Quantidade em Estoque: " + item.getQtd());
		
		System.out.println();
		
		Fornecedor fornecedor = new Fornecedor();
		
		fornecedor.setNome("Microsoft");
		fornecedor.setTelefone("+55 (11)4706-0900");
		fornecedor.setCidade("São Paulo");
		
		System.out.println("Nome: " + fornecedor.getNome());
		System.out.println("Telefone: " + fornecedor.getTelefone());
		System.out.println("Cidade: " + fornecedor.getCidade());

		

	}

}
