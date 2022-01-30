package operacaoLogicaCondicionalRelacional;

public class EstruturaRepeticaoForComBreak {
	//estrutura de repetição for com break (parada)
	public static void main(String[] args) {
		
		for (int i = 0; i <= 10; i++) {
			if (i == 7) {
				System.out.println("Obaaa, encontrei o número " + i);
				System.out.println("estou parando de executar...");
				break;//faz parar o laço de repetiçao e sair do bloco de codigo
			}
			System.out.println("Número atual é: " + i);
		}
	}
}
