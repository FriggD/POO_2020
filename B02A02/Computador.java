public class Computador extends Produto{
    private int memoria;
    private String processador;
    private String hd;

    public Computador(int memoris, String processador, String hd, String marca, String modelo, double preco){
        super(marca, modelo, preco);
        this.setMemoria(memoria);
        this.setProcessador(processador);
        this.setHd(hd);
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public void setProcessador(String processador) {
        this.processador = processador;
    }
    public void setHd(String hd) {
        this.hd = hd;
    }

    public int getMemoria() {
        return memoria;
    }
    public String getProcessador() {
        return processador;
    }
    public String getHd() {
        return hd;
    }

    @Override
    public String toString() {
        dadosPc = super.toString()+"\nMemoria: "+ getMemoria() + "\nProcessador: "+ getProcessador()+"\nHD: "+getHd();
        return dadosPc;
    }
}
