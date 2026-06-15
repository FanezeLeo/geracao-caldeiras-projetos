package br.com.caldeiras.praticando.lacos.soma_numeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = {10, 20, 30, 40, 50};
        int somaTotal = 0;

        for (int valor: valores){
            somaTotal += valor;
        }

        System.out.println("Valor total: " + somaTotal);
    }
}