package org.example.heranca;

public class ContaCorrente extends ContaBancaria {
    private double taxaOperacao;

    public ContaCorrente(String titular,
                         double saldoInicial,
                         double taxaOperacao) {
        super(titular, saldoInicial);
        this.taxaOperacao = taxaOperacao;
    }

    public double getTaxaOperacao() {
        return taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + taxaOperacao;

        if (valorTotal > 0 && valorTotal <= getSaldo()) {
            super.sacar(valor);
            super.sacar(taxaOperacao);
            System.out.println("Taxa de operação de R$" + taxaOperacao + " aplicada!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Taxa de operação: R$" + taxaOperacao);
    }

    @Override
    public double calcularTaxaEspecial() {
        if (getSaldo() > 50000) {
            return 10.0;
        }
        return 5.0;
    }

    //Erro de compilação;
//    @Override
//    public final void inicializarRocursosEspeciais() {
//        super.exibirInformacoes();
//        System.out.println("Taxa de operação: R$" + taxaOperacao);
//    }

}
