package operacaoLogicaCondicionalRelacional;

public class EstruturaRepeticaoWhileDoWhile {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 0;
		
		//estrutura de repeti��o while, esta condi��o executa pelo menos uma vez
		//o while verifica e depois executa
		while (num <= 10) {
			System.out.println("O n�mero atual �: " + num + " no while");
			num++;
		}
		
		/*-----------------------------------------------------*/
		
		//estrutura de repeti��o do while
		//o do while primeiro executa depois verifica
		do {
			System.out.println("O n�mero atual �: " + num1 + " no do while");
			num1++;
		} while (num1 <= 10);
	}
}
