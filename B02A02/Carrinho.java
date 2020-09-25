import java.util.ArrayList;
import java.util.stream.Collectors;

public class Carrinho {
	
	private ArrayList<Produto> listProduto = new ArrayList<>();

	public Carrinho() {
		
	}

	public Carrinho(ArrayList<Produto> produtos) {
		this.listProduto = produtos;
	}

	public ArrayList<Produto> getListProduto() {
		return listProduto;
	}

	public void setListProduto(ArrayList<Produto> listProduto) {
		this.listProduto = listProduto;
	}
	
	public void imprimeListaSimples() {
		for (Produto produto : listProduto) {
			System.out.println(produto.getNome());
		}
	}
	
	public void imprimeListasIntermediario() {
		String stringLista = "";
		
		for (int i = 0; i < listProduto.size(); i++) {
			stringLista=stringLista.concat((listProduto.get(i).getNome()));
			if(i!=listProduto.size()-1)
				stringLista=stringLista.concat(", ");
		}
		System.out.println(stringLista);
	}	
	
	public void imprimeListaComplexo() {
		System.out.println(String.join(", ", listProduto.stream().map(produto -> produto.nome).collect(Collectors.toList())));
	}
	
	public double calculaPreco() {
		double precoFinal = 0.00;
		
		for (Produto produto : listProduto) {
			precoFinal += produto.getPreco();
		}
		
		return precoFinal;
	}
	
	public void adicionarProduto(Produto p) {
		listProduto.add(p);
	}
	
}