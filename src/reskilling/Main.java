package reskilling;

public class Main {
	
	public static void main(String[] args) {
		MenuQuestao();
	}
	
	public static void MenuQuestao()
	{
		int opcao = 0;

		System.out.println("*****************     Exercício de Java 8      **********");
		System.out.println("** Execute as seguintes operações usando as features do Java 8 sem utilizar: for/while/if **");
		
		do
		{		
			opcao = Menu.ExibirOpcao();
			
			switch(opcao)
			{
				case 1:Questoes.Questao1();
						break;
				case 2: Questoes.Questao2();
						break;
				case 3: Questoes.Questao3();
						break;
				case 4: Questoes.Questao4();
						break;
				case 5: Questoes.Questao5();
						break;
				case 6: Questoes.Questao6();
						break;
				case 7: Questoes.Questao7();
						break;
				case 8: Questoes.Questao8();
						break;
				case 9: Questoes.Questao9();
						break;
				case 10: Questoes.Questao10();
						break;
				case 11: Questoes.Questao11();
						break;
				case 0: System.exit(0);
				default:
						System.out.println("Selecione uma opção válida !");
						break;
			}		
			
			System.out.println("\n");
			
		}while(opcao > 0);
	}
}
