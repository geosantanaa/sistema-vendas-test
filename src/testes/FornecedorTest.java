package testes;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import classes.Estoque;
import classes.Fornecedor;
import classes.Produto;

public class FornecedorTest {

    @Mock
    private Fornecedor fornecedorMock;
    @Mock
    private Estoque estoqueMock;
    
    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testFornecedorAdicionarProdutoAoEstoque() {
        // configurando o comportamento do mocks.
        when(fornecedorMock.getNome()).thenReturn("Fornecedor Luiz eletr�nicos");

        Produto produtoMock1 = new Produto(0, "Produto A", 10.0);
        Produto produtoMock2 = new Produto(0, "Produto B", 15.0);

        // configurando o comportamento do mock de estoque para verificar a disponibilidade dos produtos.
        when(estoqueMock.verificarDisponibilidade(produtoMock1)).thenReturn(true);
        when(estoqueMock.verificarDisponibilidade(produtoMock2)).thenReturn(true);

        // configurando o comportamento do mock de estoque para listar os produtos.
        when(estoqueMock.listarProdutos()).thenReturn(Arrays.asList(produtoMock1, produtoMock2));

        // criando uma inst�ncia do fornecedor.
        Fornecedor fornecedor = fornecedorMock;

        // criando uma inst�ncia do estoque.
        Estoque estoque = estoqueMock;

        // adicionando os produtos mock ao estoque 
        estoque.adicionarProduto(produtoMock1);
        estoque.adicionarProduto(produtoMock2);

        // listando os produtos dispon�veis no estoque 
        List<Produto> produtosDispon�veis = estoque.listarProdutos();

        // Verifica o nome do fornecedor.
        assertEquals("Fornecedor Luiz eletr�nicos", fornecedor.getNome()); 
        // Verifica se h� 2 produtos dispon�veis.
        assertEquals(2, produtosDispon�veis.size()); 
        // Verifica se o produtoMock1 est� no estoque.
        assertTrue(produtosDispon�veis.contains(produtoMock1));
       // Verifica se o produtoMock2 est� no estoque.
        assertTrue(produtosDispon�veis.contains(produtoMock2)); 

        // Verifica se o m�todo estoque.adicionarProduto foi chamado duas vezes.
        verify(estoqueMock, times(2)).adicionarProduto(any(Produto.class));
    }
}
