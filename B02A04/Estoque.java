import java.util.ArrayList;

public class Estoque {

	private static final int tam = 5;
	private Produto[] listaProdutos;
	
	public Estoque() {
		listaProdutos = new Produto[tam];
	}
	
	public void addProduto(String nome, double valor, int quantidade) {
		
		int counter = 0;
		for (int i = 0; i < listaProdutos.length; i ++) {
		    if (listaProdutos[i] != null)
		        counter ++;
		    }

		if(counter>=tam)
			throw new ExceptionEstoque("Estoque cheio!");
		
		 try {
			 for (int i = 0;i<listaProdutos.length;i++) {
				 if(listaProdutos[i]==null) {
					 listaProdutos[i] = new Produto(nome,valor,quantidade);
					 break;
				 }
			 }
		 
		 } catch (ValorIncorretoException e) {
			e.printStackTrace();
		}

	}
	
	public void imprimeProduto(int id) {
		System.out.println(listaProdutos[id].toString());
	}
	
	public void imprimeProdutov2(int id) {
		System.out.println(listaProdutos[id]);
	}
	
	
}