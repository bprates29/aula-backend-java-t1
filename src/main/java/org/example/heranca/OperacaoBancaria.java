package org.example.heranca;

public class OperacaoBancaria {
    public static final int OP_DEPOSITO = 1;
    public static final int OP_SAQUE = 2;
    public static final int OP_TRANSFERENCIA = 3;

    private final int tipoOperacao;
    private double valor;

    public OperacaoBancaria(int tipoOperacao, double valor) {
        this.tipoOperacao = tipoOperacao;
        this.valor = valor;
    }

    public void processar() {
        switch (tipoOperacao) {
            case OP_DEPOSITO -> System.out.println("Processando depósito de R$" + valor);
            case OP_SAQUE -> System.out.println("Processando saque de R$" + valor);
            case OP_TRANSFERENCIA -> System.out.println("Processando transferência de R$" + valor);
            default -> System.out.println("Operação desconhecida!");
        }
    }

    public void efetuarPagamento (final double valor, String descricao) {
        //valor a gente não consegue alterar aqui dentro
        // valor = 50.0; Erro de compilação

        final String menssagem = "Pagamento em processo. Descricao:" + descricao;
        // menssagem = "outra mensagem"; erro de compilação

        descricao = "alterado";
    }

    public int getTipoOperacao() {
        return tipoOperacao;
    }

    //Não podemos modificar uma variável final
//    public void setTipoOperacao(int tipoOperacao) {
//        this.tipoOperacao = tipoOperacao;
//    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
