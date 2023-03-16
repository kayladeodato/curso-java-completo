package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

	public static void main(String[] args) {
		
		List<Integer> nums = Arrays.asList(1, 2 , 3, 4, 5, 6, 7, 8, 9);
		
		//invertendo a String:
		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();
		
		//converter de volta pra inteiro
		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s,2);
		
		nums.stream()
			.map(Integer::toBinaryString) //transformando os números para String binária:
			.map(inverter)
			.map(binarioParaInt)
			.forEach(System.out::println);
		
		

	}

}
