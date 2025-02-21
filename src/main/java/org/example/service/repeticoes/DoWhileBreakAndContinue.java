package org.example.service.repeticoes;

public class DoWhileBreakAndContinue {
    public static void main(String[] args) {
        int comidaDisponivel = 5;
        int pedaco = 0;
        boolean comFome = true;

        do {
            pedaco++;

            if (pedaco == 3) {
                System.out.println("Pedaço estragado: " + pedaco + ". Pulando!");
                continue; //Pula o código abaixo e vai para a proxima iteração
            }

            System.out.println("Comendo pedaço: " + pedaco);
            comidaDisponivel--;

            if (comidaDisponivel == 0) {
                System.out.println("Acabou a comida!");
                break;
            }

            comFome = Math.random() > 0.1;
        } while (comFome);
    }
}
