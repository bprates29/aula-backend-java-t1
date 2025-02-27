package org.example.controle_de_acesso;

public class FSDemo {
    public static void main(String[] args) {
        var fs = new FailSoftArray(5, -1);

        System.out.println("Tamanho do array: " + fs.length);

        for(int i = 0; i < fs.length * 2; i++) {
            var valor = i * 10;
            if (!fs.put(i, valor)) {
                System.out.println("Falha ao inserir valor: " + valor + " Indice: " + i);
            } else {
                System.out.println("Inseriu valor: " + valor + " Indice: " + i);
            }
        }

        for(int i = 0; i < fs.length * 2; i++) {
            int val = fs.get(i);
            if (val != -1) {
                System.out.println("fs[" + i + "] = " + val);
            } else {
                System.out.println("Falha ou ser o indice " + i);
            }
        }
    }
}
