package Contas;

import Cliente.Cliente;

public class ContaCorrente extends ContaBancaria {

	private double LimiteEspecial;

	public ContaCorrente(String numeroConta, Cliente titular, double LimiteEspecial) {
		super(numeroConta, titular);
		this.LimiteEspecial = LimiteEspecial;
	}

	@Override
	protected boolean PodeSacar(double valor) {
		return getSaldo() + this.LimiteEspecial >= valor;
	}

	public double getLimiteEspecial() {
		return this.LimiteEspecial;
	}
}
