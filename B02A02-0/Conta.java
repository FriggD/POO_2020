import java.util.ArrayList;

public abstract class Conta {

    protected String nomeTitular;
    protected int agencia;
    protected int numero;
    protected double saldo;
    // atributo abaixo não previsto no escopo do projeto, mas apoiará a função de
    // Extrato
    protected ArrayList<LogOperacao> logOperacoes = new ArrayList<LogOperacao>();
    // outro atributo extra
    protected String tipo;

    public Conta(String nomeTitular, int agencia, int numero, String tipo) throws Exception {
        if (agencia <= 0) {
            throw new Exception("Erro: Agência não pode ser igual ou menor do que zero");
        } else if (numero <= 0) {
            throw new Exception("Número de Conta não pode ser igual ou menor do que zero");
        } else {
            this.nomeTitular = nomeTitular;
            this.agencia = agencia;
            this.numero = numero;
            this.saldo = 0.00;
            this.tipo = tipo;
        }
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void addLog(LogOperacao log) {
        logOperacoes.add(log);
    }

    /*
     * public void setSaldo(double saldo) { this.saldo = saldo; }
     */

    @Override
    public String toString() {
        return "Conta [Nome do Titular: " + nomeTitular + ", Agência: " + agencia + ", Número: " + numero
                + ", Saldo: R$" + saldo + "]";
    }

    abstract int depositar(double valor) throws Exception;

    abstract int sacar(double valor) throws Exception;

    public void imprimeExtrato() {
        // Compreendo que o intento desse método seja apenas mostrar o saldo, mas, como
        // um extrato real contempla outras informações, assim é mais divertido.
        for (LogOperacao log : logOperacoes) {
            System.out.println(log.toString());
        }
        System.out.println("Saldo: R$" + saldo);
    }

    public void imprimeSaldo() {
        // Aqui seria o método solicitado, dentro da minha interpretação do documento
        System.out.println("Saldo: R$" + saldo);
    }

    public void transferir(Conta destino, double valor) throws Exception {
        // Não sou particularmente favorável a tratar transferências dentro da classe
        // conta. Preferiria realizar a operação em uma classe distinta utilizando duas
        // contas como parâmetro
        if (valor <= 0 || valor >= saldo) {
            throw new Exception("Valor inválido. Por favor, tente a operação novamente");
        } else {
            this.sacar(valor);
            destino.depositar(valor);
            addLog(new LogOperacao("TRNSF", valor * -1));
            destino.addLog(new LogOperacao("TRNSF", valor));
            System.out.println("Operação de transferência concluída com sucesso!");
        }
    }

    // Este método não está previsto no escopo original, mas permitirá retiradas
    // fora dos constraints de saldo e limite. A implementação disto se dá em função
    // do fato que contas corrente podem ser negativadas além destes limites por
    // manutenção ou outras operações atípicas.

    abstract int sacarEspecial(double valor) throws Exception;

}