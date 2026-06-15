package br.com.caldeiras.praticando.variaveis.par_ou_impar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;

        System.out.println("Digite um numero: ");
        num1 = scanner.nextInt();
        System.out.println("Digite um numero novamente: ");
        num2 = scanner.nextInt();

        if((num1 + num2) % 2 != 0){
            System.out.println("Impar ganhou!!");
        } else {
            System.out.println("Par ganhou!!");
        }

    }
}
