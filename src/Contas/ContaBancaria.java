package Contas;

import Cliente.Cliente;
import Exceptions.SaldoInsuficienteException;

public abstract class ContaBancaria {

	private String numeroConta;
	private Cliente titular;
	private double saldo;

	public ContaBancaria(String numeroConta, Cliente titular) {

		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = 0.0;

	}

	public void Depositar(double valor) {
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor de deposito deve ser maior que 0.");
		}
		this.saldo += valor;

	}

	public void Sacar(double valor) throws SaldoInsuficienteException {
		if (!PodeSacar(valor)) {
			throw new SaldoInsuficienteException("Não há saldo suficiente para concluir esta operação.");
		}
		if (valor <= 0) {
			throw new IllegalArgumentException("O valor de saque deve ser maior que 0.");
		}
		this.saldo -= valor;
	}

	public void Transferir(ContaBancaria destino, double valor) throws SaldoInsuficienteException {
		this.Sacar(valor);
		destino.Depositar(valor);
	}

	protected boolean PodeSacar(double valor) {
		return this.getSaldo() >= valor;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public String getNumeroConta() {
		return this.numeroConta;
	}

	public Cliente getTitular() {
		return this.titular;
	}

}
