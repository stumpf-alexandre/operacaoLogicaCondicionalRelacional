package operacaoLogicaCondicionalRelacional;

public class EstruturaRepeticaoForComBreak {
	//estrutura de repeti��o for com break (parada)
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				System.out.println("Obaaa, encontrei o n�mero " + i);
				System.out.println("estou parando de executar...");
				break;//faz parar o la�o de repeti�ao e sair do bloco de codigo
			}
			System.out.println("N�mero atual �: " + i);
		}
	}
}
