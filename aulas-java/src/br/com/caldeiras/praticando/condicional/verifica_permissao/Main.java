package br.com.caldeiras.praticando.condicional.verifica_permissao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        int nivelPermissao;
        boolean verificaCodigo;
        boolean verificaNivelPermissao;

        System.out.println("Digite o codigo de acesso: ");
        codigo = scanner.nextInt();
        System.out.println("Digite seu nivel de permissão");
        nivelPermissao = scanner.nextInt();

        verificaCodigo = (codigo == 2023);
        verificaNivelPermissao = (nivelPermissao == 1 || nivelPermissao == 2 || nivelPermissao == 3);

        if (verificaCodigo && verificaNivelPermissao){
            System.out.println("Acesso permitivo!!");
        } else {
            if ((!verificaCodigo) && (!verificaNivelPermissao)){
                System.out.println("Codigo de acesso e nivel de permissão invalidos");
            } else if(!verificaCodigo){
                System.out.println("Codigo de acesso invalido");
            } else {
                System.out.println("Nivel de permissão invalido");
            }
        }
        scanner.close();
    }
}
