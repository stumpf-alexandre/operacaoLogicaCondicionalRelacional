package operacaoLogicaCondicionalRelacional;

public class OperacaoIfElse {
	public static void main(String[] args) {
		int mediaAluno = 70;
		String nome = "Alexandre";
		
		//aqui o se, senão se e o senão fazem a verificação para assim imprimir o tipo de mensagem na tela
		//o se precisa de uma condição mediaAluno maior ou igual a 70 e o nome do aluno deve ser igual a condição nome
		if(mediaAluno >= 70 && nome.equals("Alexandre")) {
			System.out.println("Parabéns " + nome + " você está aprovado");
		}
		//o senão se precisa de uma condição mediaAluno menor que 70 e o nome do aluno deve ser igual a condição nome
		else if(mediaAluno < 70 && nome.equals("Alexandre")) {
			System.out.println(nome + " você está reprovado");
		}
		//a função só vai entrar no senão caso alguma das condições não tenha dado serto
		else {
			System.out.println("Aluno não encontrado");
		}
	}
}
