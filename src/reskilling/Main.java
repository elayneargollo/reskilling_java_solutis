package reskilling;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);
		
		System.out.println("1 . imprima todos os itens da lista no console");		
		numbers.forEach(System.out::print);
		
		System.out.println("\n2 . imprima os n�meros distintos em ordem crescente");		
        numbers.stream()
                .distinct()
                .sorted().collect(Collectors.toList())
                .forEach(System.out::print);
        
		System.out.println("\n3 . imprima os n�meros impares  e distintos em ordem decrescente");	
		numbers.stream()
		        .distinct()
		        .filter(i -> i % 2 != 0)
		        .sorted(Comparator.reverseOrder())
				.collect(Collectors.toList())
		        .forEach(System.out::print);
		
		System.out.println("\n4. imprima a soma dos n�meros ignorando os 3 primeiros");	
		System.out.println(
				numbers.stream()
				.skip(3)
				.reduce(0, Integer::sum)
				);
	
		System.out.println("\n5. imprima cada n�mero da lista multiplicado por 2");	
		numbers.stream()
		        .forEach(num -> System.out.print(num*2));
		
		System.out.println("\n8. imprima apenas os 3 primeiros n�meros da lista");	
		numbers.stream()
		        .limit(3)
		        .forEach(System.out::print);

	}

}
