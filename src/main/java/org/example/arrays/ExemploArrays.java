package org.example.arrays;

public class ExemploArrays {
    public static void main(String[] args) {
        //exemploTemperatura();
        double[] saldos = { 1000.0, 2500.02, 230.43, 10000.23, 500.0 };

        for (double saldo : saldos) {
            if (saldo > 1000) {
                System.out.println("Saldo maior que mil: R$ " + saldo);
            }
        }
    }

    private static void exemploTemperatura() {
        double[] temperatura = new double[30];

        temperatura[0] = 23.4;
        temperatura[1] = 24.4;
        temperatura[2] = 33.5;
        temperatura[3] = 13.0;
        //...

        double soma = 0;
        for (int i = 0; i < temperatura.length; i++) {
            soma += temperatura[i];
        }
        double media = soma / temperatura.length;
        System.out.println("Media temperatura: " + media);
    }


}
