package org.example.heranca;

public class BancoDemo {
    public static void main(String[] args) {
        var op = new OperacaoBancaria(2, 200.0);

        op.processar();
    }

    private static void exemplo2() {
        ContaCorrente cc = new ContaCorrente("Maria", 1000.0, 5.0);
        ContaPoupanca cp = new ContaPoupanca("José", 500.0, 2.5);

        ContaBancaria ref;

        System.out.println();
        ref = cc;
        ref.exibirInformacoes();

        System.out.println();
        ref = cp;
        ref.exibirInformacoes();
    }

    public static void exemplo1() {
        ContaCorrente cc = new ContaCorrente("Maria", 1000.0, 5.0);
        cc.exibirInformacoes();
        cc.sacar(100.0);
        cc.exibirInformacoes();

        System.out.println("===============================");
        ContaPoupanca cp = new ContaPoupanca("José", 500.0, 2.5);
        cp.exibirInformacoes();
        cp.depositar(100.0);
        cp.aplicarRendimento();
        cp.exibirInformacoes();

//        ContaBancaria cb = new ContaBancaria("Fulano", 1000.0);
//        cb.exibirInformacoes();
    }
}
