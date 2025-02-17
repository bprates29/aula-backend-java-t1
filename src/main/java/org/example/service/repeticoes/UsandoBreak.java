package org.example.service.repeticoes;

public class UsandoBreak {
    public static void main(String[] args) {
        boolean comFome = true;
        int comidaDisponivel = 5;

        while (comFome) {
            System.out.println("Comendo mais um pedaço...");
            comidaDisponivel--;

            if (comidaDisponivel == 0) {
                System.out.println("Acabou a comida!");
                break;
            }

            comFome = Math.random() > 0.0; //simular uma satifação aleatoria
        }

    }
}
