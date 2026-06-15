package br.com.caldeiras.praticando.variaveis.categoria_por_preco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double preco = scanner.nextDouble();

        if (preco <= 50.00) {
            System.out.println("Categoria do produto: Econômico");
        } else if (preco > 50.00 && preco <= 200.00) {
            System.out.println("Categoria do produto: Intermediário");
        } else {
            System.out.println("Categoria do produto: Premium");
        }
    }
}
