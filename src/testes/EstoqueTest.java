package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import classes.Estoque;
import classes.Produto;

public class EstoqueTest {

    @Mock
    private Produto produtoMock1;
    @Mock
    private Produto produtoMock2;
    private Estoque estoque;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        estoque = new Estoque();
    }

    @Test
    public void testAdicionarVerificarERemoverProdutoDoEstoque() {
        // configurando o comportamento dos mocks
        when(produtoMock1.getCodigo()).thenReturn(1);
        when(produtoMock2.getCodigo()).thenReturn(2);

        // adicionando produtos ao estoque
        estoque.adicionarProduto(produtoMock1);
        estoque.adicionarProduto(produtoMock2);

        // listando produtos no estoque
        List<Produto> produtos = estoque.listarProdutos();

        // verificando disponibilidade dos produtos
        assertTrue(estoque.verificarDisponibilidade(produtoMock1));
        assertTrue(estoque.verificarDisponibilidade(produtoMock2));

        // verificando quantidade de produtos no estoque
        assertEquals(2, produtos.size());

        // removendo um produto do estoque
        estoque.removerProduto(produtoMock1);

        // checando se o produto removido não está mais disponível
        assertFalse(estoque.verificarDisponibilidade(produtoMock1));

        // checando se a quantidade de produtos no estoque foi atualizada
        assertEquals(1, produtos.size());


    }
}
