public class Poupanca extends Conta {
    private String aniversario;
    private double rendimento;

    public Poupanca(String aniversario, double rendimento, String nomeTitular, int agencia, int numero) {
        super(nomeTitular, agencia, numero);
        this.setAniversario(aniversario);
        this.setRendimento(rendimento);
    }

    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }

    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    public String getAniversario() {
        return aniversario;
    }

    public double getRendimento() {
        return rendimento;
    }

    public void adicionaRendimento(double rendimento) {
        this.saldo += (saldo * rendimento);
    }

    @Override
    public String toString() {
        String dados_ppa;
        dados_ppa = super.toString() + "\nSaldo em conta: " + getSaldo()+ "\nAniversário em: "+getAniversario();
        return dados_ppa;
    }

    public void depositar(double valor, String aniversario) {
        if (aniversario != null) {
            this.aniversario = aniversario;
        }else{
            this.aniversario = "28/08/2020";
        }
        if (valor > 0) {
            this.saldo += valor;
        } else {
            System.out.println("Deposito cancelado.");
        }
    }
}
