package colections;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		HashSet conjunto = new HashSet();
		
		// As cole��es n�o comportam tipo primitivos, nisso ser� convertido em classes:
		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // boolean -> Boolean
		conjunto.add("Teste"); //String (j� est�)
		conjunto.add(1); // int -> Intenger
		conjunto.add('x'); // char -> Character
		
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.contains('x'));
		System.out.println(conjunto.contains(1));
		
		System.out.println(conjunto.remove("Teste"));
		
		System.out.println(conjunto);
		
		conjunto.add("teste");
		
		System.out.println(conjunto.size());
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		// fazendo a uni�o dos conjuntos:
		conjunto.addAll(nums);
		System.out.println(conjunto);
		
		//fazendo a instersec��o dos conjuntos:
		conjunto.retainAll(nums);
		System.out.println(conjunto);
	}

}
