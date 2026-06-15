package br.com.caldeiras.praticando.condicional.aplicando_desconto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valorCompra;

        System.out.print("Digite o valor da compra: ");
        valorCompra = scanner.nextDouble();

        if (valorCompra >= 100){
            System.out.println("Desconto de 10% aplicado.");
            System.out.printf("Novo valor: %.2f", (valorCompra * 0.90));
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.printf("Valor total: %.2f", valorCompra);
        }
    }
}
