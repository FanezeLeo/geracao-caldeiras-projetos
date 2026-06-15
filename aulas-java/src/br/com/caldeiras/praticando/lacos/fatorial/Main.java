package br.com.caldeiras.praticando.lacos.fatorial;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int valorFatorial = 1;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        for (int i = numero; i > 0; i--){
            valorFatorial *= i;
        }

        System.out.println("Valor fatorial de " + numero + " é " + valorFatorial);

    }
}
