package operacaoLogicaCondicionalRelacional;

public class ExtruturaRepeticaoWhileDoWhile {
	public static void main(String[] args) {
		int num = 0;
		int num1 = 0;
		
		//extrutura de repetição while, esta condição executa pelo menos uma vez
		//o while verifica e depois executa
		while (num <= 10) {
			System.out.println("O número atual é: " + num + " no while");
			num++;
		}
		
		/*-----------------------------------------------------*/
		
		//extrutura de repetição do while
		//o do while primeiro executa depois verifica
		do {
			System.out.println("O número atual é: " + num1 + " no do while");
			num1++;
		} while (num1 <= 10);
	}
}
