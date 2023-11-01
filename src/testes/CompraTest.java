package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import classes.Fornecedor;
import classes.Compra;
import classes.Produto;

public class CompraTest {
	
    @Mock
    private Fornecedor clienteMock;
    @Mock
    private Produto produtoMock1;
    @Mock
    private Produto produtoMock2;

    private Compra compra;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        compra = new Compra(clienteMock);
    }

    @Test
    public void testAdicionarProdutosEListarProdutosComprados() {
        // configurando o comportamentos dos mocks.
        when(produtoMock1.getNome()).thenReturn("Produto A");
        when(produtoMock2.getNome()).thenReturn("Produto B");

        // adicionando os produtos mock na compra.
        compra.adicionarProduto(produtoMock1);
        compra.adicionarProduto(produtoMock2);

        // listando os produtos comprados.
        List<Produto> produtosComprados = compra.listarProdutosComprados();

        // Verifica se a quantidade de produtos é igual a 2.
        assertEquals(2, produtosComprados.size()); 
        // Verifica se o produtoMock1 está na lista.
        assertTrue(produtosComprados.contains(produtoMock1)); 
        // Verifica se o produtoMock2 está na lista.
        assertTrue(produtosComprados.contains(produtoMock2)); 
    }
}
