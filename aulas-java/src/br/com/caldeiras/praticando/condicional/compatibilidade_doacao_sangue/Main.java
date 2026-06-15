package br.com.caldeiras.praticando.condicional.compatibilidade_doacao_sangue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a idade do doador: ");

        int idade;
        double peso;
        boolean verificaPeso = false;
        boolean verificaIdade = false;
        idade = scanner.nextInt();

        System.out.print("Digite o peso do doador (em kg): ");
        peso = scanner.nextDouble();

        if(idade >= 18 && idade <= 65 && peso >= 50){
            System.out.println("Doador é compativel");
        }
        if(!(idade >= 18 && idade <= 65)){
            verificaIdade = true;
        }
        if(peso <= 50) {
            verificaPeso = true;
        }

        if (verificaIdade && verificaPeso){
            System.out.println("Ele não tem o peso nem a idade ideal para doar sangue");
        } else if (verificaIdade){
            System.out.println("Ele não tem a idade ideal para doar sangue");
        } else {
            System.out.println("Ele não tem o peso ideal para doar sangue");
        }
    }
}
