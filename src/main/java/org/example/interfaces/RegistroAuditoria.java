package org.example.interfaces;

public interface RegistroAuditoria {
    // Constante (implicitamente public, static e final)
    int COD_OPERACAO_AUDITORIA = 999;

    // Metodos abstratos (sem corpo)
    void registrarDeposito(double valor);
    void registrarSaque(double valor);
    void registrarTransferencia(double valor, String contaDestino);
}
