import java.util.ArrayList;

public class Agencia {

	private int numero;
	private int proxNumero;
	private double limitePadrao;
	private double rendimentoPadrao;

	// ArrayLists não possuem limitadores nativos, portanto, realizaremos a
	// tratativa dentro dos
	// métodos add. Do contrário, o uso de uma array []
	// satisfaria os requisitos de maneira mais simplificada.
	// O funcionamento, além deste ponto, é invariável.

	private ArrayList<ContaCorrente> contasCorrente = new ArrayList<ContaCorrente>();
	private ArrayList<ContaPoupanca> contasPoupanca = new ArrayList<ContaPoupanca>();

	public Agencia(int numero, double limitePadrao, double rendimentoPadrao) {
		this.numero = numero;
		this.limitePadrao = limitePadrao;
		this.rendimentoPadrao = rendimentoPadrao;
		proxNumero = 1;
	}

	public int getNumero() {
		return numero;
	}

	public int getProxNumero() {
		return proxNumero;
	}

	public double getLimitePadrao() {
		return limitePadrao;
	}

	public void setLimitePadrao(double limitePadrao) {
		this.limitePadrao = limitePadrao;
	}

	public double getRendimentoPadrao() {
		return rendimentoPadrao;
	}

	public void setRendimentoPadrao(double rendimentoPadrao) {
		this.rendimentoPadrao = rendimentoPadrao;
	}

	public ArrayList<ContaCorrente> getContasCorrente() {
		return contasCorrente;
	}

	public ArrayList<ContaPoupanca> getContasPoupanca() {
		return contasPoupanca;
	}

	public void novaContaCorrente(String nomeTitular) throws Exception {
		if (contasCorrente.size() < 20) {
			addContaCorrente(new ContaCorrente(nomeTitular, numero, proxNumero, limitePadrao));
			proxNumero++;
		} else {
			System.out.println("Limite de Contas Corrente Atingido. Por favor, busque outra Agência");
		}
	}

	public void novaContaPoupanca(String nomeTitular) throws Exception {
		if (contasPoupanca.size() < 20) {
			addContaPoupanca(new ContaPoupanca(nomeTitular, numero, proxNumero, rendimentoPadrao));
			proxNumero++;
		} else {
			System.out.println("Limite de Contas Poupança Atingido. Por favor, busque outra Agência");
		}
	}

	public void addContaCorrente(ContaCorrente cc) {
		if (contasCorrente.size() < 20) {
			contasCorrente.add(cc);
		} else {
			System.out.println("Limite de Contas Corrente Atingido. Por favor, busque outra Agência");
		}
	}

	public void addContaPoupanca(ContaPoupanca cp) {
		if (contasPoupanca.size() < 20) {
			contasPoupanca.add(cp);
		} else {
			System.out.println("Limite de Contas Poupança Atingido. Por favor, busque outra Agência");
		}
	}

	public void cobrarTaxa(Conta conta) {
		if (conta.getTipo() == "cc") {
			// Esta verificação servirá para permitir que negativemos as Contas Corrente com
			// taxas, fato impossível em Poupanças
			try {
				conta.sacarEspecial(5.00);
			} catch (Exception e) {
				System.out.println("Erro na manipulação da Conta");
			}
		} else {
			try {
				conta.sacar(5.00);
			} catch (Exception e) {
				System.out.println("Erro na manipulação da Conta");
			}
		}
	}

	public double balanco(ArrayList<? extends Conta> listaContas) {
		double soma = 0;
		for (int i = 0; i < listaContas.size(); i++) {
			soma += listaContas.get(i).getSaldo();
		}
		System.out.println("Balanço: " + soma);
		return soma;
	}

	public void operarConta(int conta, int operacao, double valor) throws Exception {
		// Esse método opera uma conta utilizando o NÚMERO DA CONTA como critério para
		// localização
		// 1 - Depósito
		// 2 - Saque
		// 3 - Taxa
		// 4 - Transferência (Utilizada apenas com duas contas, não entra neste método)

		for (int i = 0; i < contasCorrente.size(); i++) {
			if (contasCorrente.get(i).getNumero() == conta) {
				switch (operacao) {
					case 1:
						contasCorrente.get(i).depositar(valor);
						break;

					case 2:
						contasCorrente.get(i).sacar(valor);
						break;

					case 3:
						cobrarTaxa(contasCorrente.get(i));
						break;

					case 4:
						System.out.println("Por favor, insira um destinatário para realizar a transferência");
						break;

					case 5:
						contasCorrente.get(i).imprimeExtrato();
						break;

					default:
						System.out.println("Operação inválida!");
						break;

				}
				break;
			}
		}

		for (int i = 0; i < contasPoupanca.size(); i++) {
			if (contasPoupanca.get(i).getNumero() == conta) {
				switch (operacao) {
					case 1:
						contasPoupanca.get(i).depositar(valor);
						break;

					case 2:
						contasPoupanca.get(i).sacar(valor);
						break;

					case 3:
						cobrarTaxa(contasPoupanca.get(i));
						break;

					case 4:
						System.out.println("Por favor, insira um destinatário para realizar a transferência");
						break;

					case 5:
						contasPoupanca.get(i).imprimeExtrato();
						break;

					default:
						System.out.println("Operação inválida!");
						break;

				}

			}
		}

	}

	public void operarConta(int conta, int operacao, double valor, int destino) throws Exception {
		// Esse método opera uma conta utilizando o NÚMERO DA CONTA como critério para
		// localização
		// 1 - Depósito
		// 2 - Saque
		// 3 - Taxa
		// 4 - Transferência (Sobrecarga foi feita apenas para este uso)

		Conta contaDestino = null;

		for (int i = 0; i < contasCorrente.size(); i++) {
			if (contasCorrente.get(i).getNumero() == destino) {
				contaDestino = contasCorrente.get(i);
				break;
			}
		}

		for (int i = 0; i < contasPoupanca.size(); i++) {
			if (contasPoupanca.get(i).getNumero() == destino) {
				contaDestino = contasPoupanca.get(i);
				break;
			}
		}

		for (int i = 0; i < contasCorrente.size(); i++) {
			if (contasCorrente.get(i).getNumero() == conta) {
				switch (operacao) {
					case 1:
						contasCorrente.get(i).depositar(valor);
						break;

					case 2:
						contasCorrente.get(i).sacar(valor);
						break;

					case 3:
						cobrarTaxa(contasCorrente.get(i));
						break;

					case 4:
						contasCorrente.get(i).transferir(contaDestino, valor);
						break;

					case 5:
						contasCorrente.get(i).imprimeExtrato();
						break;

					default:
						System.out.println("Operação inválida!");
						break;

				}
				break;
			}
		}

		for (int i = 0; i < contasPoupanca.size(); i++) {
			if (contasPoupanca.get(i).getNumero() == conta) {
				switch (operacao) {
					case 1:
						contasPoupanca.get(i).depositar(valor);
						break;

					case 2:
						contasPoupanca.get(i).sacar(valor);
						break;

					case 3:
						cobrarTaxa(contasPoupanca.get(i));
						break;

					case 4:
						contasPoupanca.get(i).transferir(contaDestino, valor);
						break;

					case 5:
						contasPoupanca.get(i).imprimeExtrato();
						break;

					default:
						System.out.println("Operação inválida!");
						break;

				}

			}
		}

	}

	public void operarConta(int conta, int operacao) throws Exception {
		// Esse método opera uma conta utilizando o NÚMERO DA CONTA como critério para
		// localização
		// Não admite valores, pois é usado apenas para cobrar taxas ou tirar extrato
		// 1 - Depósito
		// 2 - Saque
		// 3 - Taxa
		// 4 - Transferência (Utilizada apenas com duas contas, não entra neste método)
		// 5 - Extrato

		for (int i = 0; i < contasCorrente.size(); i++) {
			if (contasCorrente.get(i).getNumero() == conta) {
				switch (operacao) {
					case 1:
						System.out.println("Por favor, insira um valor para operação");
						break;

					case 2:
						System.out.println("Por favor, insira um valor para operação");
						break;

					case 3:
						cobrarTaxa(contasCorrente.get(i));
						break;

					case 4:
						System.out.println("Por favor, insira um destinatário para realizar a transferência");
						break;

					case 5:
						contasCorrente.get(i).imprimeExtrato();
						break;

					default:
						System.out.println("Operação inválida!");
						break;

				}
				break;
			}
		}

		for (int i = 0; i < contasPoupanca.size(); i++) {
			if (contasPoupanca.get(i).getNumero() == conta) {
				switch (operacao) {
					case 1:
						System.out.println("Por favor, insira um valor para operação");
						break;

					case 2:
						System.out.println("Por favor, insira um valor para operação");
						break;

					case 3:
						cobrarTaxa(contasPoupanca.get(i));
						break;

					case 4:
						System.out.println("Por favor, insira um destinatário para realizar a transferência");
						break;

					case 5:
						contasPoupanca.get(i).imprimeExtrato();
						break;

					default:
						System.out.println("Operação inválida!");
						break;
				}

			}
		}

	}

}