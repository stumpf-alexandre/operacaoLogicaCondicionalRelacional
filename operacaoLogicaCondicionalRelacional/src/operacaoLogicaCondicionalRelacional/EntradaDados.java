package operacaoLogicaCondicionalRelacional;

import javax.swing.JOptionPane;

public class EntradaDados {
	public static void main(String[] args) {
		//cria uma caixa de entrada de dados 
		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros ");
		
		//faz a validação caso não seja digitado nada na caixa de dialogo
		if (carros == null || carros.length() == 0) {
			System.out.println("Não foi informado nenhum valor");
		}

		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas ");
		
		//faz a validação caso não seja digitado nada na caixa de dialogo
		if (pessoas == null || pessoas.length() == 0) {
			System.out.println("Não foi informado nenhum valor");
		}
		
		//transforma os numeros digitados em string para numeros reais
		double carroNum = Double.parseDouble(carros);
		double pessoaNum = Double.parseDouble(pessoas);
		
		//faz a divisão e a conversão de numeros reais para numeros inteiros
		int divisao = (int) (carroNum / pessoaNum);
		
		//faz o calculo do mod da divisão
		double resto = carroNum % pessoaNum;
		
		//caixa de confirmação para visualisar o resultado
		int resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resultado da divisão ?");
		
		//validação para mostrar a resposta
		if (resposta == 0) {

			//informa os valores em uma caixa de dialogo
			JOptionPane.showMessageDialog(null, "A divisão para as pessoas deu " + divisao + " carros e sobrou " + resto + " carro(s)");
		
			//informa os valores na tela da IDE
			System.out.println("A divisão para as pessoas deu " + divisao + " carros e sobrou " + resto + " carro(s)");
		}
		else {
			JOptionPane.showMessageDialog(null, "Não quiz ver os resultados");
		}
		
		resposta = JOptionPane.showConfirmDialog(null, "Deseja ver o resto da divisão ?");
		
		//validação para mostrar a resposta
		if (resposta == 0) {

			//informa os valores em uma caixa de dialogo
			JOptionPane.showMessageDialog(null, "O resto da divisão é: " + resto);
				
			//informa os valores na tela da IDE
			System.out.println("O resto da divisão é: " + resto + " carro(s)");
		}
		else {
			JOptionPane.showMessageDialog(null, "Não quiz ver os resultados");
		}
	}

}
