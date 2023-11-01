package testes;

import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import classes.Compra;
import classes.Estoque;
import classes.Fornecedor;
import classes.Produto;

public class ProdutoTest {

    @Mock
    private Fornecedor fornecedorMock;
    @Mock
    private Produto produtoMock;
    @Mock
    private Estoque estoqueMock;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testProdutoNoEstoqueECompra() {
        when(produtoMock.getNome()).thenReturn("televisao");
        when(produtoMock.getCodigo()).thenReturn(1);

        Fornecedor fornecedor = fornecedorMock;
        Estoque estoque = estoqueMock;

        // adicionando produto ao estoque
        estoque.adicionarProduto(produtoMock);

        // adicionando o mesmo produto na compra
        Compra compra = new Compra(fornecedor);
        compra.adicionarProduto(produtoMock);

    }


}
