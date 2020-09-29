public class Main {

	public static void main(String[] args) throws Exception {
		Agencia agencia = new Agencia(1, 500.00, 10.00);

		agencia.novaContaCorrente("Huguinho"); // Conta 1
		agencia.novaContaCorrente("Zezinho"); // Conta 2
		agencia.novaContaPoupanca("Luizinho"); // Conta 3
		agencia.novaContaPoupanca("Clebinho"); // Conta 4

		// Existem formas mais elegantes de manipular os dados nas arrays de contas.
		// Poderia criar um método de Fetch por ID ou por Titular, mas fiquei com medo
		// de ficar complexo demais

		agencia.operarConta(1, 1, 500.00);
		agencia.operarConta(2, 1, 400.00);
		agencia.operarConta(3, 1, 500.00);
		agencia.operarConta(4, 1, 500.00);

		agencia.operarConta(1, 3);
		agencia.operarConta(3, 3);

		agencia.balanco(agencia.getContasCorrente());
		agencia.balanco(agencia.getContasPoupanca());

		// Misc

		agencia.operarConta(1, 5);
		agencia.operarConta(2, 5);
		agencia.operarConta(3, 5);
		agencia.operarConta(4, 5);

		// Este último simplesmente não funciona - não há uma conta 666 para puxar
		// extrato, mas isso não vai interromper o programa.
		agencia.operarConta(666, 5);

	}

}