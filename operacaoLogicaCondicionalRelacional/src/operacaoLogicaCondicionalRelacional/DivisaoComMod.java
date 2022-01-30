package operacaoLogicaCondicionalRelacional;

public class DivisaoComMod {
	public static void main(String[] args) {
		//módulo ou mod é o resto da divisão, é representado por %
		double carro = 9;
		double pessoa = 2;
		
		double resto = carro % pessoa;
		double resto2 = carro / pessoa;
		
		//aqui transformamos o resultado double em int para tirar o numero com virgula e deixar apenas o numero inteiro
		int div = (int) resto2;
		int carr = (int) carro;
		int pess = (int) pessoa;
		
		System.out.println("Foi dividido " + carr + " carros para " + pess + " pessoas");
		System.out.println("Cada pessoa ficou com " + div + " carro(s)");
		System.out.println("Sobrou exatamente " + resto + " carro(s).");
	}
}
