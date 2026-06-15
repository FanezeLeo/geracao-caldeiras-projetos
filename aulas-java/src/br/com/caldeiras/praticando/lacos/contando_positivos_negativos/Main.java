package br.com.caldeiras.praticando.lacos.contando_positivos_negativos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List <Integer> numeros = new ArrayList<>();
        int contPos = 0;
        int contNeg = 0;
        String numero;

        while (true){
            System.out.println("Digite um número (ou 'fim' para encerrar): ");
            numero = scanner.nextLine();
            if(numero.equals("fim")){
                break;
            }
            try {
                numeros.add(Integer.parseInt(numero));
            }catch (Exception e){
                System.out.println("Numero invalido");
            }
        }

        for (Integer x: numeros){
            if(x < 0){
                contNeg++;
            } else {
                contPos++;
            }
        }

        System.out.println("Números positivos: " + contPos);
        System.out.println("Números negativos: " + contNeg);

    }
}
