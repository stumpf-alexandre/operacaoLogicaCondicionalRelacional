package operacaoLogicaCondicionalRelacional;

public class OperacaoIfElse {
	public static void main(String[] args) {
		int mediaAluno = 70;
		String nome = "Alexandre";
		
		//aqui o se, sen�o se e o sen�o fazem a verifica��o para assim imprimir o tipo de mensagem na tela
		//o se precisa de uma condi��o mediaAluno maior ou igual a 70 e o nome do aluno deve ser igual a condi��o nome
		if(mediaAluno >= 70 && nome.equals("Alexandre")) {
			System.out.println("Parab�ns " + nome + " voc� est� aprovado");
		}
		//o sen�o se precisa de uma condi��o mediaAluno menor que 70 e o nome do aluno deve ser igual a condi��o nome
		else if(mediaAluno < 70 && nome.equals("Alexandre")) {
			System.out.println(nome + " voc� est� reprovado");
		}
		//a fun��o s� vai entrar no sen�o caso alguma das condi��es n�o tenha dado serto
		else {
			System.out.println("Aluno n�o encontrado");
		}
	}
}
