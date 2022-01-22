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
		
		int nota1 = 90;
		int nota2 = 60;
		int nota3 = 80;
		int nota4 = 70;
		int media = 0;
		
		//calculo da média das notas do aluno
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//só ira entrar nesta condição se a media for igual ou maior que 70
		if (media >= 70) {
			System.out.println("Parabéns, aluno esta aprovado com média: " + media);	
		}
		//só ira entrar nesta condição se a media ficar entre 69 e 50 
		else if (media >= 50 && media <= 69) {
			System.out.println("Aluno em recuperação, com média: " + media);
		}
		//só ira entrar nesta condição caso não tenha entrado em nem uma das outras condições
		else {
			System.out.println("Aluno reprovado com média: " + media);
		}
	}
}
