public class ContaCorrente extends Conta{
    private double limite;

    public ContaCorrente(double limite, String nomeTitular, int agencia, int numero, double saldo) {
        super(nomeTitular, agencia, numero);
        this.setLimite(limite);
    }
    public void setLimite(double limite) {
        this.limite = limite;
    }
    public double getLimite() {
        return limite;
    }

    public String toString(){
        String dados_cc;
        dados_cc = super.toString()+"\nPossui um limite de: "+getLimite()+"\nSaldo: "+getSaldo();
        return dados_cc;
    }
    public void sacar(double valor, double limite){
        if(valor >= 0 && valor <=(this.saldo + this.limite)){
            this.saldo -= valor;
            System.out.println("Nome: "+this.getNomeTitular()+"\nvalor: "+valor);
        }
        if(valor >= 0 && valor > (this.saldo + this.limite)){
            System.out.println("Saldo insuficiente.");
        }else{
            System.out.println("Saque cancelado. Verifique valor");
        }
    }
    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
        }else{
            System.out.println("Deposito cancelado.");
        }
    }
}
