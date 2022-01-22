package operacaoLogicaCondicionalRelacional;

public class OperacaoAninhada {
	public static void main(String[] args) {
		//operações lógicas aninhadas são operações dentro de operações
		int nota1 = 60;
		int nota2 = 49;
		int nota3 = 80;
		int nota4 = 70;
		int media = 0;
		
		//calculo da média das notas do aluno
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//esta forma de operação não possui media de operações, voce pode aninhar varias operações
		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno está aprovado, com média: " + media + ". Parabéns pelo seu esforço");
				}
				else {
					System.out.println("Aluno está aprovado, com média: " + media);
				}
			}
			else {
				System.out.println("Aluno está em recuperação, com média: " + media);
			}
		}
		else {
			System.err.println("Aluno está reprovado, com média: " + media);
		}
	}
}
