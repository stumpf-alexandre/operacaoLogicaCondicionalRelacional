package operacaoLogicaCondicionalRelacional;

import java.util.Scanner;

public class EstruturaRepeticaoFor {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);//instanciando e criando o objeto scaner
		//estrutura de repetição FOR, usada para percorrer uma quantidade de vezes a condição
		int num;
		
		System.out.println("Digite 1 para imprimir numeros crescentes ou 2 para imprimir numeros decrescentes");
		num = ler.nextInt();//entrada de dados do tleclado no visor da IDE Eclipse
		ler.nextLine();//esvasiando o buffer do teclado
		
		switch (num) {
		case 1:
			metodoCrescente();
			break;
			
		case 2:
			metodoDecrescente();
			break;

		default:
			System.out.println("Numero errado");
			break;
		}
		
		
	}
	public static void metodoDecrescente() {
		//neste for o numero que sera imprimido ira de 10 à zero
		for (int j = 10; j >= 0 ; j--) {
			System.out.println("O número atual é: " + j);
		}
	}
	private static void metodoCrescente() {
		//neste for o numero que sera imprimido ira de zero à 10
		for (int i = 0; i <= 10 ; i++) {
			System.out.println("O número atual é: " + i);
		}
	}

}
