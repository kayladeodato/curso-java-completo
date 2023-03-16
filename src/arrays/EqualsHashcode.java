package arrays;

public class EqualsHashcode {

	public static void main(String[] args) {
		
		Usuario user1 = new Usuario();
		user1.nome = "Rafael Silva";
		user1.email = "rafael.silva@email.com";
		
		Usuario user2 = new Usuario();
		user2.nome = "Patricia Santos";
		user2.email = "patricia.santos@email.com";
		
		Usuario user3 = new Usuario();
		user3.nome = "Patricia Santos";
		user3.email = "patricia.santos@email.com";
		
		System.out.println(user2 == user3);
		System.out.println(user2.equals(user3));
		System.out.println(user1.equals(user2));
		System.out.println(user3.equals(user2));
		//Os três acima estão dando falso porque por padrão está fazendo a mesma coisa que ==;
		
	}

}
