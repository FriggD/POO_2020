public class PlacaVideo extends Produto{
    private int memoria;
    private String saidaVideo;

    public PlacaVideo(int memoria, String saidaVideo,  String marca, String modelo, double preco){
        super(marca, modelo, preco);
        this.setMemoria(memoria);
        this.setsaidaVideo(saidaVideo);
    }

    public void setMemoria(int memoria) {
        this.memoria = memoria;
    }
    public void setsaidaVideo(String saidaVideo) {
        this.saidaVideo = saidaVideo;
    }
    
    public int getMemoria() {
        return memoria;
    }
    public String getsaidaVideo() {
        return saidaVideo;
    }

    @Override
    public String toString() {
        dadosVideo = super.toString()+"\nMemoria: "+ getMemoria() + "\nsaidaVideo: "+ getsaidaVideo();
        return dadosVideo;
    }
}
