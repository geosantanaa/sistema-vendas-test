package classes;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	private List<Produto> produtosComprados = new ArrayList<>();
	
	public Compra() {
	}

	public List<Produto> getProdutosComprados() {
		return produtosComprados;
	}

	public void setProdutosComprados(List<Produto> produtosComprados) {
		this.produtosComprados = produtosComprados;
	}

	public Compra(Fornecedor fornecedor) {
		this.setFornecedor(fornecedor);
	}

	public void adicionarProduto(Produto produto) {
		produtosComprados.add(produto);
	}

	public List<Produto> listarProdutosComprados() {
		return produtosComprados;
	}

	public void setFornecedor(Fornecedor fornecedor) {
	}

	@Override
	public String toString() {
		return "Compra [produtosComprados=" + produtosComprados + "]";
	}
	
	

}
