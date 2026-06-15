package br.com.caldeiras.praticando.condicional.comparar.numeros;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;

        System.out.println("Digite o primeiro numero: ");
        num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = scanner.nextDouble();

        if (num1 > num2){
            System.out.println("O primeiro numero é maior");
        } else if (num2 > num1){
            System.out.println("O segundo numero é maior");
        } else{
            System.out.println("Os numeros são iguais");
        }

        scanner.close();
    }
}
