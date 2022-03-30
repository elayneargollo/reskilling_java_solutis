package reskilling;
import java.util.Scanner;

public final class Menu {
	
	public static int ExibirOpcao()
	{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*****************     Menu de Questões        ***********");
		System.out.println("");
		
		System.out.println("1. Imprima todos os itens da lista no console");
		System.out.println("2. Imprima os números distintos em ordem crescente");
		System.out.println("3. Imprima os números impares  e distintos em ordem decrescente");
		System.out.println("4. Imprima a soma dos números ignorando os 3 primeiros");
		System.out.println("5. Imprima cada número da lista multiplicado por 2");
		System.out.println("6. Imprima de forma agrupada os números pares e impares (ambos os grupos apenas números distintos");
		System.out.println("7. Imprima o maior número da lista, se não houver lance uma java.util.NoSuchElementException");
		System.out.println("8. Imprima apenas os 3 primeiros números da lista");
		System.out.println("9. Imprima a média dos números da lista, se não for possível calcular a média imprima Double.NaN");
		System.out.println("10. Imprima a quantidade de elementos da lista, a soma de seus elementos, a média e o valor máximo");
		System.out.println("11. Imprima a data de hoje, somando a quantidade de dias indicadas por cada elemento distinto da lista em ordem crescente");
		System.out.println("0. Sair");
		
		System.out.print("\nInforme a questão que deseja: ");
		return entrada.nextInt();
	}
}
