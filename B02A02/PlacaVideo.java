public class PlacaVideo extends Produto{
	
    private int memoria;
    private String[] saidasVideo;
    
	public PlacaVideo(String nome, String marca, String modelo, double preco, int memoria, String[] saidasVideo) {
		super(nome, marca, modelo, preco);
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
		return "PlacaVideo [nome=" + nome + ", marca=" + marca + ", modelo=" + modelo + ", preco=" + preco
				+ ", memoria=" + memoria + ", saidasVideo=" + Arrays.toString(saidasVideo) + "]";
	}


}