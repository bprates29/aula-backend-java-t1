package org.example.heranca;

public abstract class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Dopósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado;");
        } else {
            System.out.println("Salfo insuficiente, ou valor inválido");
        }
    }

    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$" + saldo);
    }

    public abstract double calcularTaxaEspecial();

    public final void inicializarRocursosEspeciais() {
        // Lógica critica que não deve ser alterada
        System.out.println("Inicialização segura de recursos para a conta.");
    }
}
