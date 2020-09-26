public class Main {

	public static void main(String[] args) throws Exception {
		Agencia agencia = new Agencia(1, 500.00, 10.00);

		agencia.novaContaCorrente("Huguinho"); //Conta 1
		agencia.novaContaCorrente("Zezinho"); // Conta 2
		agencia.novaContaPoupanca("Luizinho"); // Conta 3
		agencia.novaContaPoupanca("Clebinho"); // Conta 4

		// Existem formas mais elegantes de manipular os dados nas arrays de contas.
		// Poderia criar um método de Fetch por ID ou por Titular, mas fiquei com medo
		// de ficar complexo demais
		
		
		agencia.operarConta(1,1,500.00);
		agencia.operarConta(2,1,400.00);
		agencia.operarConta(3,1,500.00);
		agencia.operarConta(4,1,500.00);
		
		agencia.operarConta(1, 3);
		agencia.operarConta(3, 3);
		
		agencia.balanco(agencia.getContasCorrente());
		agencia.balanco(agencia.getContasPoupanca());
		
		//Misc
		
		agencia.getContasCorrente().get(0).imprimeExtrato();
		agencia.getContasCorrente().get(1).imprimeExtrato();
		agencia.getContasPoupanca().get(0).imprimeExtrato();
		agencia.getContasPoupanca().get(1).imprimeExtrato();
		
	}

}