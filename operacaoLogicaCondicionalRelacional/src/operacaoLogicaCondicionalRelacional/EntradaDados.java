package operacaoLogicaCondicionalRelacional;

import javax.swing.JOptionPane;

public class EntradaDados {
	public static void main(String[] args) {
		//cria uma caixa de entrada de dados 
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros ");
		
		//faz a valida��o caso n�o seja digitado nada na caixa de dialogo
		if (carros == null || carros.length() == 0) {
			System.out.println("N�o foi informado nenhum valor");
		}

		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas ");
		
		//faz a valida��o caso n�o seja digitado nada na caixa de dialogo
		if (pessoas == null || pessoas.length() == 0) {
			System.out.println("N�o foi informado nenhum valor");
		}
		
		//transforma os numeros digitados em string para numeros reais
		double carroNum = Double.parseDouble(carros);
		double pessoaNum = Double.parseDouble(pessoas);
		
		//faz a divis�o e a convers�o de numeros reais para numeros inteiros
		int divisao = (int) (carroNum / pessoaNum);
		
		//faz o calculo do mod da divis�o
		double resto = carroNum % pessoaNum;
		
		//informa os valores na tela da IDE
		System.out.println("A divis�o para as pessoas deu " + divisao + " carros e sobrou " + resto + " carro(s)");
		
		//informa os valores em uma caixa de dialogo
		JOptionPane.showMessageDialog(null, "A divis�o para as pessoas deu " + divisao + " carros e sobrou " + resto + " carro(s)");
	}

}
