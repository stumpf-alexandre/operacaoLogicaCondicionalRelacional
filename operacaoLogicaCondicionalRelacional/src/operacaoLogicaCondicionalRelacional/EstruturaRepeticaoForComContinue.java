package operacaoLogicaCondicionalRelacional;

public class EstruturaRepeticaoForComContinue {
	//estrutura de repetição for com continue
		public static void main(String[] args) {
			
			for (int i = 0; i <= 10; i++) {
				if (i == 3 || i == 6 || i == 9) {
					System.out.println("Obaaa, encontrei o número " + i);
					System.out.println("mas vou prosseguir o laço de repetição...");
					continue;//faz o laço de repetição continuar
					//o continue faz com que volte para o inicio do bloco de codigo do for
				}
				System.out.println("Número atual é: " + i);
			}
		}
}
