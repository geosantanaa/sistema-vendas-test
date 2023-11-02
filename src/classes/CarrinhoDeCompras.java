package classes;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

	private List<Produto> itens = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        itens.add(produto);
    }

    public void removerProduto(Produto produto) {
        itens.remove(produto);
    }

    public double calcularTotal() {
        double total = 0.0;
        for (Produto produto : itens) {
            total += produto.getPreco();
        }
        return total;
    }

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }
    
    @Override
  	public String toString() {
  		return "CarrinhoDeCompras [itens=" + itens + "]";
  	}
}