package Contas;

import Cliente.Cliente;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numeroConta, Cliente titular) {
        super(numeroConta, titular);
    }

    public void RenderJuros(double TaxaDeJurosPercentual) {
        if (TaxaDeJurosPercentual > 0) {
            double rendimento = getSaldo() * (TaxaDeJurosPercentual / 100);
            Depositar(rendimento);
        }
    }

}
