package org.example.estacionamento;

public class Veiculo {
    String placa;
    String modelo;
    long horaEntrada; //Armazeas o tempo de entrada em miliseguindo

    public Veiculo(String placa, String modelo, long horaEntrada)
    {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = horaEntrada;
    }

    public long calcularTempoEstacionado() {
        long horaSaida = System.currentTimeMillis();
        return (horaSaida - this.horaEntrada) / (1000 * 60 * 60);
    }
}
