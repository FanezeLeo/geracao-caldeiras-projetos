package br.com.caldeiras.praticando.condicional.validar_senha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "123456";

        System.out.print("Digite a senha: ");
        String tentativaSenha = scanner.nextLine();

        if (tentativaSenha.equals(senhaCorreta)) {
            System.out.println("Acesso permitido!");
        } else {
            System.out.println("Acesso negado!");
        }

        scanner.close();
    }
}
