package org.example.estacionamento;

public class Veiculo {
    private String placa;
    private String modelo;
    private long horaEntrada; //Armazeas o tempo de entrada em miliseguindo

    public Veiculo(String placa, String modelo)
    {
        this.placa = placa;
        this.modelo = modelo;
        this.horaEntrada = System.currentTimeMillis();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    long calcularTempoEstacionado() {
        long horaSaida = System.currentTimeMillis();
        return (horaSaida - this.horaEntrada) / (1000 * 60 * 60);
    }

    public boolean mesmaPlaca(String placa) {
        return this.placa.equalsIgnoreCase(placa);
    }
}
