package reskilling;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.stream.Collectors;

public final class Questoes {
	static List<Integer> numbers = Arrays.asList(1, 5, 8, 7, 4, 1, 6, 3, 2, 1, 8, 5, 7, 4);

	public static void Questao1() {
		numbers.forEach(System.out::print);
	}

	public static void Questao2() {
		numbers.stream().distinct().sorted().collect(Collectors.toList()).forEach(System.out::print);
	}

	public static void Questao3() {
		numbers.stream().distinct().filter(i -> i % 2 != 0).sorted(Comparator.reverseOrder())
				.collect(Collectors.toList()).forEach(System.out::print);
	}

	public static void Questao4() {
		System.out.println(numbers.stream().skip(3).reduce(0, Integer::sum));
	}

	public static void Questao5() {
		numbers.stream().forEach(num -> System.out.print(num * 2));
	}

	public static void Questao6() {
		Map<Boolean, Set<Integer>> groupedNumbers = numbers.stream()
				.collect(Collectors.groupingBy(num -> num % 2 == 0, Collectors.toSet()));

		Map<String, Set<Integer>> groupedByType = new HashMap<>();

		groupedByType.put("Par", groupedNumbers.get(true));
		groupedByType.put("ímpar", groupedNumbers.get(false));

		System.out.print(groupedByType);
	}

	public static void Questao7() {
		System.out.print(numbers.stream().max(Integer::compareTo).orElseThrow(NoSuchElementException::new));
	}

	public static void Questao8() {
		numbers.stream().limit(3).forEach(System.out::print);
	}

	public static void Questao9() {
		System.out.printf(new DecimalFormat("#,##0.00")
						  .format(numbers.stream().mapToDouble(Integer::doubleValue).average().orElse(Double.NaN)));
	}

	public static void Questao10() {
		System.out.println("Quantidade de elemento: " + numbers.size());
		System.out.println("Soma de seus elementos: " + numbers.stream().reduce(0, Integer::sum));
		System.out.println("Média dos elementos: " + new DecimalFormat("#,##0.00")
							    .format(numbers.stream().mapToDouble(Integer::doubleValue).average().getAsDouble()));
		System.out.println("Quantidade de elemento: " + numbers.stream().max(Integer::compareTo).get());
	}
}
