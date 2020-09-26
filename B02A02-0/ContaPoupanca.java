import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContaPoupanca extends Conta {

	private String dataAniversario; // Visto que já utilizamos uma classe de data verdadeira em outras porções do
	// código, nos permitiremos usar String como requisitado
	private double percentualRendimento;

	public ContaPoupanca(String nomeTitular, int agencia, int numero, LocalDate data, double percentualRendimento)
			throws Exception {
		super(nomeTitular, agencia, numero,"cp");
		this.percentualRendimento = percentualRendimento;
		// Mas aqui utilizaremos a implementação mais divertida
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataAniversario = dtf.format(data);
	}

	public ContaPoupanca(String nomeTitular, int agencia, int numero, double percentualRendimento) throws Exception {
		super(nomeTitular, agencia, numero,"cp");
		this.percentualRendimento = percentualRendimento;
		// E aqui também. No documento, a requisição de set para o Data Aniversário está
		// no escopo do método depositar(), adaptei para cá.
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.dataAniversario = dtf.format(LocalDate.now());
	}

	public String getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(String dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public double getPercentualRendimento() {
		return percentualRendimento;
	}

	public void setPercentualRendimento(double percentualRendimento) {
		this.percentualRendimento = percentualRendimento;
	}

	@Override
	int depositar(double valor) throws Exception {
		if (valor <= 0) {
			// throw new Exception ("Valor inválido. Por favor, tente novamente");
			// Registro que creio ser preferível tratar este tipo de situação via exceptions
			// do que retorno de códigos de erro.
			return 0;
		} else {
			saldo += valor;
			addLog(new LogOperacao("DPST", valor));
			// Como a requisição Se a data de aniversário for vazia, setar com a data atual
			// (para simplificar pode deixar uma data fixa como exemplo hoje "24/09/2020")
			// está nessa porção do código no exercício, adaptei este excerto aqui, também,
			// mas este If teoricamente nunca será acessado.
			if (dataAniversario.length() == 0) {
				DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				this.dataAniversario = dtf.format(LocalDate.now());
			}
			return 1;

		}
	}

	@Override
	int sacar(double valor) throws Exception {
		if (valor <= 0 || valor > saldo) {
			// throw new Exception ("Valor inválido. Por favor, tente novamente");
			// Registro que creio ser preferível tratar este tipo de situação via exceptions
			// do que retorno de códigos de erro.
			return 0;
		} else {
			saldo -= valor;
			addLog(new LogOperacao("SAQUE", valor));
			return 1;
		}

	}

	@Override
	int sacarEspecial(double valor) throws Exception {
		return 0;
	}


}