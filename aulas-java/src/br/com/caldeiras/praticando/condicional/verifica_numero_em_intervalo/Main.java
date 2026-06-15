package br.com.caldeiras.praticando.condicional.verifica_numero_em_intervalo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int valor = scanner.nextInt();

        if (valor >= 1000 && valor <= 5000) {
            System.out.println("O valor " + valor + " está dentro do intervalo permitido para empréstimo.");
        } else {
            System.out.println("O valor " + valor + " não está dentro do intervalo permitido para empréstimo.");
        }
        scanner.close();
    }
}

