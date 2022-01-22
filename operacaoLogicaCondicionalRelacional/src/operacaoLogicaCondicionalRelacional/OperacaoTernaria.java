package operacaoLogicaCondicionalRelacional;

public class OperacaoTernaria {
	public static void main(String[] args) {
		//operadores ternários são para micro validações de uma linha
		int nota1 = 60;
		int nota2 = 49;
		int nota3 = 80;
		int nota4 = 70;
		int media = 0;
		
		//calculo da média das notas do aluno
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//desta forma a operação ternaria simplifica o modo de usar o if e o else, tudo em uma linha
		String resultado = media >= 70 ? "Aluno aprovado, com média: " : "Aluno reprovado, com média: ";
		
		System.out.println(resultado + media);
		
		//desta forma mais encrementada fica mais dificil de entender a lógica mas estão representando o if, o else if e o else em apenas uma linha
		//tudo o que esta depois da ? é verdadeiro, tudo que estiver depois de : é falso
		String saida = media >= 70 ? "Aluno aprovado, com média: " : (media >= 50 && media <= 69) ? "Aluno em recuperação, com média: " : "Aluno reprovado, com média: ";
		
		//concatenando os resultados de string e media
		System.out.println(saida + media);
		
		
		
	}

}
