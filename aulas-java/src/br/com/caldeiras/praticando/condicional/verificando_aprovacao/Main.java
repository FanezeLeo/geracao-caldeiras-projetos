package br.com.caldeiras.praticando.condicional.verificando_aprovacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.printf("O aluno teve média %.1f e foi aprovado.", media);
        } else if (media >= 5.0) {
            System.out.printf("O aluno teve média %.1f e está de recuperação.", media);
        } else {
            System.out.printf("O aluno teve média %.1f e foi reprovado.", media);
        }
    }
}
