package org.example.tryarquivos;

public class TryExamples {
    public static void main(String[] args) {
        System.out.println("Inicio do programa");
        int resutado = 10 / 1;
        System.out.println("Meio do programa: " + resutado);
        //arrayOutOfBounds();

        try {
            int x = Integer.parseInt("abss");
        } catch (NumberFormatException ex) {
            System.out.println("Erro: Numero inválido");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: indice invalido");
        } catch (Exception ex) {
            System.out.println("Erro: não sabemos!");
        } finally {
            System.out.println("Sou sempre executado!");
        }

        System.out.println("Fim do programa");
    }

    private static void arrayOutOfBounds() {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
            // ...
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Erro: indice invalido");
        } finally {
            System.out.println("Sou sempre executado!");
        }
    }
}
