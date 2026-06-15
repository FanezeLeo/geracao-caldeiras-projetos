package br.com.caldeiras.praticando.lacos.nome_valido;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome = "";
        boolean continua = true;

       while (continua) {
           System.out.print("Digite seu nome: ");
           nome = scanner.nextLine();
           if (nome.length() < 3) {
               System.out.println("Nome inválido. Digite novamente.");
           } else {
               System.out.println("Nome \"" + nome + "\" cadastrado com sucesso!");
                continua = false;
               scanner.close();
           }
       }

    }
}
