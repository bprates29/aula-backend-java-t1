package org.example.service.repeticoes;

public class UsandoContinue {
    public static void main(String[] args) {
        for (int pedaco = 1; pedaco <= 5; pedaco++) {
            if (pedaco == 3) {
                System.out.println("Eita pedaço queimado, pulando...: " + pedaco);
                continue; //pular essa iteração e vai para o proximo pedaço
            }
            //.... com continue ele não executa essa parte
            System.out.println("Comendo pedaço: " + pedaco);
        }


    }



}
