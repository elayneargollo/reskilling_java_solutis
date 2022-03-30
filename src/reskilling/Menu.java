package reskilling;
import java.util.Scanner;

public final class Menu {
	
	public static int ExibirOpcao()
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*****************     Menu de Quest�es        ***********");
		System.out.println("");
		
		System.out.println("1. Imprima todos os itens da lista no console");
		System.out.println("2. Imprima os n�meros distintos em ordem crescente");
		System.out.println("3. Imprima os n�meros impares  e distintos em ordem decrescente");
		System.out.println("4. Imprima a soma dos n�meros ignorando os 3 primeiros");
		System.out.println("5. Imprima cada n�mero da lista multiplicado por 2");
		System.out.println("6. Imprima de forma agrupada os n�meros pares e impares (ambos os grupos apenas n�meros distintos");
		System.out.println("7. Imprima o maior n�mero da lista, se n�o houver lance uma java.util.NoSuchElementException");
		System.out.println("8. Imprima apenas os 3 primeiros n�meros da lista");
		System.out.println("9. Imprima a m�dia dos n�meros da lista, se n�o for poss�vel calcular a m�dia imprima Double.NaN");
		System.out.println("10. Imprima a quantidade de elementos da lista, a soma de seus elementos, a m�dia e o valor m�ximo");
		System.out.println("11. Imprima a data de hoje, somando a quantidade de dias indicadas por cada elemento distinto da lista em ordem crescente");
		System.out.println("0. Sair");
		
		System.out.print("\nInforme a quest�o que deseja: ");
		return entrada.nextInt();
	}
}
