package classes;

import java.util.ArrayList;
import java.util.List;

public class Estoque {
	
    private List<Produto> produtosEmEstoque = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtosEmEstoque.add(produto);
    }

    public List<Produto> listarProdutos() {
        for (Produto produto : produtosEmEstoque) {
            System.out.println(produto);
        }
		return produtosEmEstoque;
    }

    public boolean verificarDisponibilidade(Produto produto) {
        return produtosEmEstoque.contains(produto);
    }

    public void removerProduto(Produto produto) {
        produtosEmEstoque.remove(produto);
    }

	@Override
	public String toString() {
		return "Estoque [produtosEmEstoque=" + produtosEmEstoque + "]";
	}
    
    

}
