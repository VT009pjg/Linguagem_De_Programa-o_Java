package lojaVirtual;

public class App {

	public static void main(String[] args) {
		Produto produto = new Produto();
		
		produto.setNome("Celular");
		produto.setPreco(2750.00);
		produto.setQtdEstoque(15);
		
		System.out.println("=== Dados do Produto ===");
		System.out.println("Nome: " + produto.getNome());
		System.out.println("Preço: " + produto.getPreco());
		System.out.println("Quantidade em Estoque: " + produto.getQtdEstoque());
		
		System.out.println();
		
		Cliente cliente = new Cliente();
		
		cliente.setNome("Vitor");
		cliente.setIdade(17);
		cliente.setEmail("vhsantos051@gmail.com");
		
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("Idade: " + cliente.getIdade());
		System.out.println("Email: " + cliente.getEmail());

	}

}
