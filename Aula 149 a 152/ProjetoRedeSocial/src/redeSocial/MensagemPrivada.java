package redeSocial;

public class MensagemPrivada {

	String remetente;
	String Destinatario;
	String Conteudo;
	
	void MostrarMensagem() { 
		
		System.out.println("Destinatario:" +Destinatario);
		System.out.println("Conteúdo:" + Conteudo);
	}
}
