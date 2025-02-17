package org.example.service.repeticoes;

public class LacosExemplos {
    public static void main(String[] args) {
        for (int comFome = 1; comFome <= 3; comFome++) {
            System.out.println(comFome);
            //codigo a ser repetido
        }
        boolean comFome = false;
        boolean satisfeito = false;
        while (comFome) {
            System.out.println("Como muitooooo!");
            comFome = satisfeito; // condição de saida!
        }

        do {
            System.out.println("Como mesmo sem fome!");
            // condição de saida!
        } while (comFome);

        String[] comidas = {"Pizza", "Sushi", "Churrasco", "Hambúrguer"};

        for (String comida : comidas) {
            System.out.println("Hoje eu quero comer: " + comida);
        }

    }
}
