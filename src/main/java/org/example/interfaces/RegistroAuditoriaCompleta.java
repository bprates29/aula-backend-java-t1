package org.example.interfaces;

public class RegistroAuditoriaCompleta implements RegistroAuditoria {
    @Override
    public void registrarDeposito(double valor) {
        System.out.println("COMPLETA: Registrando deposito de R$ " + valor + " COD: " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarSaque(double valor) {
        System.out.println("COMPLETA: Registrando saque de R$ " + valor + " COD: " + COD_OPERACAO_AUDITORIA);
    }

    @Override
    public void registrarTransferencia(double valor, String contaDestino) {
        System.out.println("COMPLETA: Registrando tranferência de R$ " + valor +
                " para conta: " + contaDestino +
                "COD: " + COD_OPERACAO_AUDITORIA);
    }
}
