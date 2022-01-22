package operacaoLogicaCondicionalRelacional;

public class OperacaoTernaria {
	public static void main(String[] args) {
		//operadores tern�rios s�o para micro valida��es de uma linha
		int nota1 = 60;
		int nota2 = 49;
		int nota3 = 80;
		int nota4 = 70;
		int media = 0;
		
		//calculo da m�dia das notas do aluno
		media = (nota1 + nota2 + nota3 + nota4) / 4;
		
		//desta forma a opera��o ternaria simplifica o modo de usar o if e o else, tudo em uma linha
		String resultado = media >= 70 ? "Aluno aprovado, com m�dia: " : "Aluno reprovado, com m�dia: ";
		
		System.out.println(resultado + media);
		
		//desta forma mais encrementada fica mais dificil de entender a l�gica mas est�o representando o if, o else if e o else em apenas uma linha
		//tudo o que esta depois da ? � verdadeiro, tudo que estiver depois de : � falso
		String saida = media >= 70 ? "Aluno aprovado, com m�dia: " : (media >= 50 && media <= 69) ? "Aluno em recupera��o, com m�dia: " : "Aluno reprovado, com m�dia: ";
		
		//concatenando os resultados de string e media
		System.out.println(saida + media);
		
		
		
	}

}
