public class Agencia {
    private int numeroAgencia;
    private int proximoNumeroConta;
    private double limitePadrao;
    private double rendimentoPadrao;
    private  ContaCorrente listaContaCorrente[];
    private ContaPoupanca listaContaPoupanca[];

    public Agencia(int numeroAgencia, double limitePadrao, double rendimentoPadrao){
        this.numeroAgencia=numeroAgencia;
        this.limitePadrao = limitePadrao;
        this.rendimentoPadrao = rendimentoPadrao;
        this.proximoNumeroConta = 1;
        this.listaContaCorrente = new ContaCorrente[20];
        this.listaContaPoupanca = new ContaPoupanca[20];
    }
    public int getNumeroAgencia(){
        return this.numeroAgencia;
    }
    public int getProximoNumeroConta(){
        return this.proximoNumeroConta;
    }
    public ContaCorrente[] getListaContaCorrente(){
        return this.listaContaCorrente;
    }
    public ContaPoupanca[] getListaContaPoupanca(){
        return this.listaContaPoupanca;
    }

    public double getLimitePadrao(){
        return this.limitePadrao;
    }

    public void setLimitePadrao(double limitePadrao){
        this.limitePadrao = limitePadrao;
    }

    public double getRendimentoPadrao(){
        return this.rendimentoPadrao;
    }
    public void setRendimentoPadrao(double rendimentoPadrao){
        this.rendimentoPadrao = rendimentoPadrao;
    }

    public ContaCorrente novaContaCorrente(String nomeTitular){
        ContaCorrente novaContaCorrente = new ContaCorrente(nomeTitular, this.numeroAgencia, this.proximoNumeroConta, this.limitePadrao);
        this.proximoNumeroConta++;
        for(int i=0; i<this.listaContaCorrente.length; i++){
            if(listaContaCorrente[i]==null){
                listaContaCorrente[i]=novaContaCorrente;
            }
        }
        return novaContaCorrente;
    }
    public ContaPoupanca novaContaPoupanca(String nomeTitular){
        //A fazer ....
        return null;
    }

    public void cobrarTaxa(Conta conta){
        conta.sacar(5.0);
    }
    public double balanco(Conta listaContas[]){
        //A fazer ...
        return 0;
    }
}
