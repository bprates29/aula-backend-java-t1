package org.example.tryarquivos;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.FileTime;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class MenuIOExemplo {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int opcao;
        do {
            System.out.println("\n==== Menu interativo de path, files, filesystem... ====");
            System.out.println("1. Criar arquivo;");
            System.out.println("2. Deletar arquivo;");
            System.out.println("3. Copiar arquivo;");
            System.out.println("4. Mover/renomear o arquivo;");
            System.out.println("5. Informações do arquivo;");
            System.out.println("6. Ler o arquivo;");
            System.out.println("7. Escrever um arquivo;");
            System.out.println("0. Sair;");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1 -> criarArquivo();
                case 2 -> deletarArquivo();
                case 3 -> copiarArquivo();
                case 4 -> moverOuRenomear();
                case 5 -> informacoesArquivo();
                case 6 -> lerUmArquivo();
                case 7 -> escreverEmUmArquivo();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opçao invalida");
            }
        } while (opcao != 0);
    }

    private static void escreverEmUmArquivo() throws IOException {
        System.out.print("Qual arquivo você quer escrever: ");
        Path arquivo = Path.of(scanner.nextLine());

        System.out.println("Digite o conteudo e digite 'FIM' para terminar");

        var builder = new StringBuilder();
        while (true) {
            String linha = scanner.nextLine();
            if (linha.equalsIgnoreCase("FIM")) break;
            builder.append(linha).append("\n");
        }

        Files.writeString(arquivo, builder.toString(), StandardCharsets.UTF_8);
        System.out.println("Arquivo salve em: " + arquivo.toAbsolutePath());
    }

    private static void lerUmArquivo() throws IOException {
        System.out.print("Qual arquivo ler: ");
        Path arquivo = Path.of(scanner.nextLine());
        if (Files.exists(arquivo)) {
            List<String> linhas = Files.readAllLines(arquivo, StandardCharsets.UTF_8);
            linhas.forEach(System.out::println);
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }

    private static void informacoesArquivo() throws IOException {
        System.out.print("Qual arquivo consultar: ");
        Path arquivo = Path.of(scanner.nextLine());
        if (Files.exists(arquivo)) {
            System.out.println("Tamanho: " + Files.size(arquivo) + " bytes");
            FileTime fTime = Files.getLastModifiedTime(arquivo);
            System.out.println("Ultima modificação: " + fTime.to(TimeUnit.SECONDS) + " secounds");

            System.out.println("É um diretório: " + Files.isDirectory(arquivo));
            Map<String, ?> attrs = Files.readAttributes(arquivo, "*");
            System.out.println("Atributos: " + attrs);
        }
    }

    private static void moverOuRenomear() throws IOException {
        System.out.print("Arquivo de origem: ");
        Path origem = Path.of(scanner.nextLine());
        System.out.print("Novo nome ou destino: ");
        Path destino = Path.of(scanner.nextLine());

        Files.move(origem, destino, StandardCopyOption.REPLACE_EXISTING);
        System.out.println("Arquivo movido ou renomeado");
    }

    private static void copiarArquivo() throws IOException {
        System.out.print("Arquivo de origem: ");
        Path origem = Path.of(scanner.nextLine());
        System.out.print("Arquivo de destino: ");
        Path destino = Path.of(scanner.nextLine());

        Files.copy(origem, destino, StandardCopyOption.COPY_ATTRIBUTES);
        System.out.println("Arquivo copiado!");
    }

    private static void deletarArquivo() throws IOException {
        System.out.print("Nome do arquivo a deletar:");
        Path arquivo = Path.of(scanner.nextLine());
        if (Files.exists(arquivo)){
            Files.delete(arquivo);
            System.out.println("Arquivo deletado!");
        } else {
            System.out.println("Arquivo não encontrado!");
        }
    }

    private static void criarArquivo() throws IOException {
        System.out.print("Nome do arquivo a criar: ");
        Path arquivo = Path.of(scanner.nextLine());
        Files.createFile(arquivo);
        System.out.println("Arquivo criado: " + arquivo.toAbsolutePath());
    }
}
