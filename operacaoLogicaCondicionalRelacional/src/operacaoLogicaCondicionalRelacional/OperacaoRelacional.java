package operacaoLogicaCondicionalRelacional;

public class OperacaoRelacional {
	public static void main(String[] args) {
		//operadores relacionais
		int nota1 = 90;
		int nota2 = 90;
		int nota3 = 91;
		int nota4 = 90;
		
		//operador de comparação quando as variaveis são iguais
		if (nota1 == nota2) {
			System.out.println("As notas são iguais");
		}
		else {
			System.out.println("As notas são diferentes");
		}
		
		//operador de comparação quando as variaveis são diferentes
		if (nota3 != nota4) {
			System.out.println("As notas são diferentes");
		}
		else {
			System.out.println("As notas são iguais");
		}
		
		//operador de comparação quando uma variavel é menor que a outra
		if (nota1 < nota3) {
			System.out.println("Nota 1 é menor que a nota 3");
		}
		else {
			System.out.println("Nota 1 não é menor que a nota 3");
		}
		
		//operador de comparação quando uma variavel é maior que a outra
		if (nota3 > nota1) {
			System.out.println("Nota 3 é maior que a nota 1");
		}
		else {
			System.out.println("Nota 3 não é maior que a nota 1");
		}
		
		//operador de comparação quando uma variavel é menor ou igual que a outra
		if (nota1 <= nota2) {
			System.out.println("Nota 1 é menor ou igual que a nota 2");
		}
		else {
			System.out.println("Nota 1 não é menor ou igual a nota 2");
		}
		
		//operador de comparação quando uma variavel é maior ou igual que a outra
		if (nota3 >= nota4) {
			System.out.println("Nota 3 é maior ou igual que a nota 4");
		}
		else {
			System.out.println("Nota 3 não é maior ou igual a nota 4");
		}
	}
}
