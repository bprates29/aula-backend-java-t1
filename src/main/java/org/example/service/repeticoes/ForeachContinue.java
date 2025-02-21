package org.example.service.repeticoes;

public class ForeachContinue {
    public static void main(String[] args) {
        String[] comidas = {"Pizza", "Sushi", "Carne Queimada", "Hamburguer"};

        for (String comida : comidas) {
            if (comida.equals("Carne Queimada")) {
                System.out.println("Éca comida queimada! Pulando...");
                continue;
            }

            System.out.println("Comendo " + comida + "!");
        }
    }
}
