package operacaoLogicaCondicionalRelacional;

public class OperacaoSwitchCase {
	public static void main(String[] args) {
		int dia = 1;
		
		//Switch case serve para operações exatas
		switch (dia) {
		//O numero da variavel tem que ser exata, assim no caso da media das notas teriamos que usar 100 cases para fazer um programa funcional
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		//o defal serve quando o numero da variavel não for nem uma das cases, ai cai direto no defal
		default:
			System.out.println("Outro dia qualquer");
			break;
		}
	}

}
