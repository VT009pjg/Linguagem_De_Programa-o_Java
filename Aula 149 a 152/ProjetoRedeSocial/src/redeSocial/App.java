package redeSocial;

public class App {

	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario();
		
		usuario1.nome = "Vitor";
		usuario1.idade = 17;
		usuario1.cidade = "Valença";
		
		usuario1.mostrarPerfil();
		
		Postagem post1 = new Postagem();
		
		post1.texto = "Estudando Java Hoje!";
		post1.Curtidas = 15;
		post1.autor = "ana";
		
		post1.MostrarPostagem();
		
		Cometario coment1 = new Cometario ();
		
		coment1.autor = "Bruno";
		coment1.mensagens = "Muito Bom esse Post!";
		coment1.likes = 4;
		
		coment1.MostrarComentario();
		
		MensagemPrivada mensagem1 = new MensagemPrivada();
		
		mensagem1.remetente = "Ana";
		mensagem1.Destinatario = "Carlos";
		mensagem1.Conteudo = "Oi, Tudo bem?";
		
		mensagem1.MostrarMensagem();
		
		Grupo grupo1 = new Grupo();
		
		grupo1.NomeGrupo = "Amigos do Java";
		grupo1.tema = "Programação";
		grupo1.QtdDeMenbros = 28;
		
		grupo1.MostrarGrupo();
		

	}

}
