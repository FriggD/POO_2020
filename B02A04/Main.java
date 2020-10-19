public class Main {

	public static void main(String[] args) {

		Estoque e = new Estoque();
		// Produtos Errôneos
		e.addProduto("a", 1, 1);
		e.addProduto("abcd", -1, 1);
		e.addProduto("abcd", 1, -1);
		// Produtos Corretos
		e.addProduto("abcd", 1, 1);
		e.addProduto("efgh", 100, 3);
		e.addProduto("ijkl", 150, 2);
		// Impressões Corretas
		e.imprimeProduto(0);
		e.imprimeProduto(1);
		e.imprimeProduto(2);

		/*
		 * e.imprimeProduto(3); Quando utilizado com a versão do método que ativamente
		 * explicita o toString(), gera um NullpointerException ao tentar usar uma
		 * referência de objeto de valor nulo, tal como: Exception in thread "main"
		 * java.lang.NullPointerException at
		 * exceções/Estoque.imprimeProduto(Estoque.java:40) at
		 * exceções/Main.main(Main.java:22)
		 */

		// É importante notar que, no método v2, que utiliza apenas a call System.out e,
		// portanto, utiliza String.valueOf,
		// impressão realizada é apenas de "null", sem exceptions

		/*
		 * e.imprimeProduto(6); Esta, ao tentar localizar um índice inexiste, lança a
		 * exception ArrayIndexOutofBoundsException, tal como: Exception in thread
		 * "main" java.lang.ArrayIndexOutOfBoundsException: Index 6 out of bounds for
		 * length 5 at exceções/Estoque.imprimeProduto(Estoque.java:40) at
		 * exceções/Packajão.Main.main(Main.java:34)
		 */
		
		//Embora o método imprimir produto não possua um throw próprio, é importante notar que objetos Array em java lançam exceções.
		
		try {
			e.imprimeProduto(3);
		}
		catch (Exception ex) {
			System.out.println("Produto não encontrado!");
		}
		
		try {
			e.imprimeProduto(6);
		}
		catch (Exception ex) {
			System.out.println("ID informada maior que o estoque permitido.");
		}

	}

}