package operacaoLogicaCondicionalRelacional;

public class EstruturaRepeticaoForComContinue {
	//estrutura de repeti��o for com continue
		public static void main(String[] args) {
			
			for (int i = 0; i <= 10; i++) {
				if (i == 3 || i == 6 || i == 9) {
					System.out.println("Obaaa, encontrei o n�mero " + i);
					System.out.println("mas vou prosseguir o la�o de repeti��o...");
					continue;//faz o la�o de repeti��o continuar
					//o continue faz com que volte para o inicio do bloco de codigo do for
				}
				System.out.println("N�mero atual �: " + i);
			}
		}
}
