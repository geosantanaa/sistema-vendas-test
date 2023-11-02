package testes;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

import classes.CarrinhoDeCompras;
import classes.Produto;

public class CarrinhoDeComprasTest {

	private CarrinhoDeCompras carrinho;
	private Produto produtoMock1;
	private Produto produtoMock2;

	@Before
	public void setUp() {
		carrinho = new CarrinhoDeCompras();

		// criando mocks 
		produtoMock1 = mock(Produto.class);
		produtoMock2 = mock(Produto.class);

		// configurando o comportamento dos mocks
		when(produtoMock1.getPreco()).thenReturn(20.0);
		when(produtoMock2.getPreco()).thenReturn(30.0);
	}

	@Test
	public void testAdicionarEremoverProdutosNoCarrinho() {
		carrinho.adicionarProduto(produtoMock1);
		carrinho.adicionarProduto(produtoMock2);

	}
}