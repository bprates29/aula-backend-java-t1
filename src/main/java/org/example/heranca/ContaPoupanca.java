package org.example.heranca;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String titular,
                         double saldoInicial,
                         double taxaRendimento) {
        super(titular, saldoInicial);
        this.taxaRendimento = taxaRendimento;
    }

    public void aplicarRendimento () {
        var rendimento = getSaldo() * (taxaRendimento / 100);
        depositar(rendimento);
        System.out.println("Rendimento de R$" + rendimento + " aplicado a conta poupança");
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de rendimento anual: " + taxaRendimento + "%");
    }

    @Override
    public double calcularTaxaEspecial() {
        return 2.0;
    }
}
