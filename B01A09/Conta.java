

public class Conta {
    protected String nomeTitular;
    protected int agencia;
    protected int numero;
    protected double saldo;

    public Conta(
        String nomeTitular, int agencia, int numero
        ) {
        this.nomeTitular = nomeTitular;
        this.setAgencia(agencia);
        this.setNumero(numero);
        this.saldo = 0;
    }

    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        } else {
            System.out.println("Agencia inválida!");
        }
    }

    public void setNumero(int numero) {
        if (numero > 0) {
            this.numero = numero;
        } else {
            System.out.println("Número inválido!");
        }
    }

    // public void setSaldo(double saldo) {
    //     this.saldo = saldo;
    // }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Nome: "+this.getNomeTitular()+"\nvalor: "+valor);
        }else{
            System.out.println("Deposito não efetivado. Verifique valor.");
        }
    }

    public void sacar(double valor){
        if(valor >= 0 && valor <=this.saldo){
            this.saldo -= valor;
            System.out.println("Nome: "+this.getNomeTitular()+"\nvalor: "+valor);
        }
        if(valor >= 0 && valor > this.saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            System.out.println("Saque cancelado. Verifique valor");
        }
    }

    public void imprimirExtrato(){
        System.out.println("~==+++++++++++++++++++++++++++++++++++==~");
        System.out.println("~==+ Extrato de conta +==~");
        System.out.println(this.toString());
        System.out.println("~==+++++++++++++++++++++++++++++++++++==~");
    }
    public String toString(){
        String dados_Conta;
        dados_Conta = "Titular: "+getNomeTitular()+"\nAgencia: "+getAgencia()+"\nNúmero: "+getNumero();
        return dados_Conta;
    }
}
