package br.com.caldeiras.praticando.lacos.contagem_degraus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int degraus;
        System.out.print("Digite a quantidade de degraus: ");
        degraus = scanner.nextInt();

        for (int i = 0; i <= degraus; i++){
            System.out.println("Subindo o degrau " + i);
        }
        System.out.println("Você chegou ao topo!");
        scanner.close();
    }
}
