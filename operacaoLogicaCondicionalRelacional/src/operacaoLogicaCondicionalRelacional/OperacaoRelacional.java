package operacaoLogicaCondicionalRelacional;

public class OperacaoRelacional {
	public static void main(String[] args) {
		//operadores relacionais
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 91;
		int nota4 = 90;
		
		//operador de compara��o quando as variaveis s�o iguais
		if (nota1 == nota2) {
			System.out.println("As notas s�o iguais");
		}
		else {
			System.out.println("As notas s�o diferentes");
		}
		
		//operador de compara��o quando as variaveis s�o diferentes
		if (nota3 != nota4) {
			System.out.println("As notas s�o diferentes");
		}
		else {
			System.out.println("As notas s�o iguais");
		}
		
		//operador de compara��o quando uma variavel � menor que a outra
		if (nota1 < nota3) {
			System.out.println("Nota 1 � menor que a nota 3");
		}
		else {
			System.out.println("Nota 1 n�o � menor que a nota 3");
		}
		
		//operador de compara��o quando uma variavel � maior que a outra
		if (nota3 > nota1) {
			System.out.println("Nota 3 � maior que a nota 1");
		}
		else {
			System.out.println("Nota 3 n�o � maior que a nota 1");
		}
		
		//operador de compara��o quando uma variavel � menor ou igual que a outra
		if (nota1 <= nota2) {
			System.out.println("Nota 1 � menor ou igual que a nota 2");
		}
		else {
			System.out.println("Nota 1 n�o � menor ou igual a nota 2");
		}
		
		//operador de compara��o quando uma variavel � maior ou igual que a outra
		if (nota3 >= nota4) {
			System.out.println("Nota 3 � maior ou igual que a nota 4");
		}
		else {
			System.out.println("Nota 3 n�o � maior ou igual a nota 4");
		}
	}
}
