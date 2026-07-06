package Testes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Cliente.Cliente;
import Contas.ContaPoupanca;
import Exceptions.SaldoInsuficienteException;

class ContaPoupancaTest {

	private Cliente titular;
	private ContaPoupanca conta;

	@BeforeEach
	void iniciar() {
		titular = new Cliente("Zezinho", "123.123.123-12");
		conta = new ContaPoupanca("123", titular);
		conta.Depositar(50.0);
	}

	@Test
	void deveDepositar() {

		conta.Depositar(50.0);

		assertEquals(100.0, conta.getSaldo());
	}

	@Test
	void deveLancarExcecaoAoDepositarZero() {

		assertThrows(IllegalArgumentException.class, () -> conta.Depositar(0.0));

	}

	@Test
	void deveLancarExcecaoAoDepositarValorNegativo() {

		assertThrows(IllegalArgumentException.class, () -> conta.Depositar(-1.0));

	}

	@Test
	void deveSacar() throws SaldoInsuficienteException {

		conta.Sacar(50.0);

		assertEquals(0, conta.getSaldo());

	}

	@Test
	void deveLancarExcecaoAoSacarAcimaDoSaldo() {

		assertThrows(SaldoInsuficienteException.class, () -> conta.Sacar(51.0));

	}

	@Test
	void deveLancarExcecaoAoSacarValorNegativo() {

		assertThrows(IllegalArgumentException.class, () -> conta.Sacar(-1.0));

	}

	@Test
	void deveLancarExcecaoAoSacarZero() {

		assertThrows(IllegalArgumentException.class, () -> conta.Sacar(0));

	}

	@Test
	void deveRenderJuros() {

		conta.RenderJuros(100.0);

		assertEquals(100.0, conta.getSaldo());

	}

	@AfterEach
	void finalizar() {

		conta = null;
		titular = null;

	}

}
