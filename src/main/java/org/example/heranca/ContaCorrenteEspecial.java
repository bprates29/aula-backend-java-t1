package org.example.heranca;

public class ContaCorrenteEspecial extends ContaCorrente {
    private double limiteExtra;

    public ContaCorrenteEspecial( String titular,
                                  double saldoInicial,
                                  double taxaOperacao,
                                  double limiteExtra) {
        super(titular, saldoInicial, taxaOperacao);
        this.limiteExtra = limiteExtra;
    }

    @Override
    public void sacar(double valor) {
        double valorDisponivel = getSaldo() + limiteExtra;
        double valorTotal = valor + getTaxaOperacao();
        var novoSaldo = valorDisponivel - valorTotal;

        if (valorTotal <= valorDisponivel && valorTotal > 0) {
            setSaldo(novoSaldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Limite extra para essa conta: R$" + limiteExtra);
    }
}
