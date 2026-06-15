package br.com.caldeiras.praticando.lacos.monitorando_login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String senhaCorreta = "1234";
        int tentativas = 3;
        Scanner scanner = new Scanner(System.in);
        String senha;

        for(int i = 0; i < tentativas; tentativas--){
            System.out.print("Digite sua senha: ");
            senha = scanner.nextLine();
            if (senhaCorreta.equals(senha)){
                System.out.println("Senha Correta! Acesso concedido!");
                break;
            } else {
                if (tentativas == 1){
                    System.out.println("Conta bloqueada temporariamente.");
                }else {
                    System.out.println("Senha incorreta. Você tem " + (tentativas - 1) + " tentativas restantes.");
                }
            }
        }
    }

}
