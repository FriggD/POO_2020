public class Main {

	public static void main(String[] args) {
		
		Monitor monitor = new Monitor("testeMonitor",1.00,"Samsung","MonitorzinSamsung000",300.00);
		PlacaVideo placaVideo = new PlacaVideo("GTX das Quantas","NVIDIA","das Quantas",500.00,4,new String[]{"HDMI","VGA"});
		Computador computador = new Computador("Clebinho","Positivo","Pífio",1000.00,2,"i666","seagate");
		
		Carrinho carrinho = new Carrinho();
		
		carrinho.adicionarProduto(monitor);
		carrinho.adicionarProduto(placaVideo);
		carrinho.adicionarProduto(computador);
		
		carrinho.imprimeListaSimples();
		carrinho.imprimeListasIntermediario();
		carrinho.imprimeListaComplexo();
		
		System.out.println("Valor total do carrinho: R$"+carrinho.calculaPreco());
	}

}