public class ContaCorrente extends Conta {

	public ContaCorrente(String nomeTitular, int agencia, int numero, double limite) throws Exception {
		super(nomeTitular, agencia, numero,"cc");
		this.limite = limite;
	}

	private double limite;

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
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
			addLog(new LogOperacao("DPST",valor));
			return 1;

		}
	}

	@Override
	int sacar(double valor) throws Exception {
		if (valor <= 0 || valor > (saldo + limite)) {
			// throw new Exception ("Valor inválido. Por favor, tente novamente");
			// Registro que creio ser preferível tratar este tipo de situação via exceptions
			// do que retorno de códigos de erro.
			return 0;
		} else {
			saldo -= valor;
			addLog(new LogOperacao("SAQUE",valor));
			return 1;
		}

	}

	@Override
	public String toString() {
		return "Conta Corrente [Nome do Titular: " + nomeTitular + ", Agência: " + agencia + ", Número CC: " + numero + ", Saldo: R$"
				+ saldo + ", Limite: " + limite + "]";
	}
	
	public int sacarEspecial(double valor) throws Exception {
		if (tipo == "cc") {
			if (valor <= 0) {
				return 0;
			} else {
				saldo -= valor;
				addLog(new LogOperacao("TAXA", valor));
				return 1;
			}
		}
		else {
			return 0;
		}

	}

}