package programa;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import testes.CarrinhoDeComprasTest;
import testes.CompraTest;
import testes.EstoqueTest;
import testes.FornecedorTest;
import testes.ProdutoTest;

public class Programa {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(
				ProdutoTest.class,
				FornecedorTest.class,
				EstoqueTest.class,
				CompraTest.class,
				CarrinhoDeComprasTest.class
		);

		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}

		if (result.wasSuccessful()) {
			System.out.println("Todos os testes passaram!");
		} else {
			System.out.println("Alguns testes falharam.");
		}

	}

}
