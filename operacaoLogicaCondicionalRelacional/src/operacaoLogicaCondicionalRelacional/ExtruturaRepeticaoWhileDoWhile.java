package operacaoLogicaCondicionalRelacional;

public class ExtruturaRepeticaoWhileDoWhile {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 0;
		
		//extrutura de repeti��o while, esta condi��o executa pelo menos uma vez
		//o while verifica e depois executa
		while (num <= 10) {
			System.out.println("O n�mero atual �: " + num + " no while");
			num++;
		}
		
		/*-----------------------------------------------------*/
		
		//extrutura de repeti��o do while
		//o do while primeiro executa depois verifica
		do {
			System.out.println("O n�mero atual �: " + num1 + " no do while");
			num1++;
		} while (num1 <= 10);
	}
}
