package biblioteca;

class Autor {

	private String titulo;
	private int anoLançamento;
	private Autor autor; //associação
	
	public void mostrarAutor() {
		if (autor == null) {
			System.out.println("Erro: o autor não pode ser nulo.");
		}else {
			System.out.println("Livro " + titulo + " foi escrito por " + autor.getNome());
		}
	}
}
