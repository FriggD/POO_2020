import java.util.Arrays;

public class Computador extends Produto {

	private int memoria;
	private String[] saidasVideo;
	
		public Computador(String marca, String modelo, double preco, int memoria, String[] saidasVideo) {
		super(marca, modelo, preco);
		this.memoria = memoria;
		this.saidasVideo = saidasVideo;
	}
		
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String[] getSaidasVideo() {
		return saidasVideo;
	}
	public void setSaidasVideo(String[] saidasVideo) {
		this.saidasVideo = saidasVideo;
	}

	@Override
	public String toString() {
		return "Computador [memoria= " + memoria + ", saidasVideo=" + Arrays.toString(saidasVideo) + ", Marca="
				+ getMarca() + ", Modelo=" + getModelo() + ", Preco=" + getPreco();
	}
}