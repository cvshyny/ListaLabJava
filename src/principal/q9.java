package principal;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        String arquivo1 = "questao09.txt";
        String arquivo2 = "eu_nao_existo.txt";

        GerenciadorDeArquivos.lerArquivo(arquivo1);
        GerenciadorDeArquivos.lerArquivo(arquivo2);
    }
}


class GerenciadorDeArquivos {
    public static void lerArquivo(String nomeArquivo) {
        try {
            File arquivo = new File(nomeArquivo);
            Scanner scanner = new Scanner(arquivo);

            System.out.println("Conteúdo do arquivo '" + nomeArquivo + "':");

            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("O arquivo '" + nomeArquivo + "' não foi encontrado.");
        }
    }
}