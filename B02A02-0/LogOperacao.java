import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogOperacao {

    private String nome;
    private double valor;
    private LocalDateTime data;
    private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LogOperacao(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
        this.data = LocalDateTime.now();
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return nome + ", " + valor + ", " + dtf.format(data);
    }

}