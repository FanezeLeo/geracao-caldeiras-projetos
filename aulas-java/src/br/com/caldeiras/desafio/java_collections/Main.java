package br.com.caldeiras.desafio.java_collections;

import br.com.caldeiras.desafio.java_collections.modelo.Produto;
import br.com.caldeiras.desafio.java_collections.modelo.Usuario;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int continuar = 1;
        String descricao;
        double valor;
        List<Produto> produtos = new ArrayList<>();

        System.out.print("Digite o limite do cartão: ");
        Usuario usuario = new Usuario(scanner.nextInt());



        while (continuar == 1){
            System.out.print("Digite a descrição da compra: ");
            scanner.nextLine();
            descricao = scanner.nextLine();
            System.out.print("Digite o valor da compra: ");
            valor = scanner.nextInt();

            if (usuario.getSaldo() >= valor){
                System.out.println("\nCompra realizada!\n");
                usuario.compraComSaldo(valor);
                produtos.add(new Produto(descricao, valor));
                System.out.println("Digite 1 para continuar: ");
                continuar = scanner.nextInt();
                if(continuar != 1){
                    usuario.setProdutos(produtos);
                    usuario.comprasOrdenadas();
                }
            } else {
                System.out.println("\nSaldo insuficiente!\n");
                if(!produtos.isEmpty()){
                    usuario.setProdutos(produtos);
                    usuario.comprasOrdenadas();
                    continuar = 0;
                } else {
                    System.out.println("Nenhuma compra realizada!");
                    continuar = 0;
                }
            }
        }

    }
}
