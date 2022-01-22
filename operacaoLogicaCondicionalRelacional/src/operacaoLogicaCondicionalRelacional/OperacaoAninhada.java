package operacaoLogicaCondicionalRelacional;

public class OperacaoAninhada {
	public static void main(String[] args) {
		//opera��es l�gicas aninhadas s�o opera��es dentro de opera��es
		int nota1 = 60;
		int nota2 = 49;
		int nota3 = 80;
		int nota4 = 70;
		int media = 0;
		
		//calculo da m�dia das notas do aluno
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//esta forma de opera��o n�o possui media de opera��es, voce pode aninhar varias opera��es
		if (media >= 50) {
			if (media >= 70) {
				if (media > 90) {
					System.out.println("Aluno est� aprovado, com m�dia: " + media + ". Parab�ns pelo seu esfor�o");
				}
				else {
					System.out.println("Aluno est� aprovado, com m�dia: " + media);
				}
			}
			else {
				System.out.println("Aluno est� em recupera��o, com m�dia: " + media);
			}
		}
		else {
			System.err.println("Aluno est� reprovado, com m�dia: " + media);
		}
	}
}
