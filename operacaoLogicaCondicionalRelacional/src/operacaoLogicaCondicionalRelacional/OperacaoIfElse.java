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
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 80;
		int nota4 = 70;
		int media = 0;
		
		//calculo da m�dia das notas do aluno
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//s� ira entrar nesta condi��o se a media for igual ou maior que 70
		if (media >= 70) {
			System.out.println("Parab�ns, aluno esta aprovado com m�dia: " + media);	
		}
		//s� ira entrar nesta condi��o se a media ficar entre 69 e 50 
		else if (media >= 50 && media <= 69) {
			System.out.println("Aluno em recupera��o, com m�dia: " + media);
		}
		//s� ira entrar nesta condi��o caso n�o tenha entrado em nem uma das outras condi��es
		else {
			System.out.println("Aluno reprovado com m�dia: " + media);
		}
	}
}
