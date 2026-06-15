package br.com.caldeiras.praticando.variaveis.consumo_autonimia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double consumoMedio;
        double capacidadeTanque;
        double combustivelAtual;
        double distanciaViagem;

        double autonomiaMaxima;
        double autonomiaAtual;

        System.out.print("Qual é o consumo médio do veículo (km/l)? ");
        consumoMedio = scanner.nextDouble();

        System.out.print("Qual é a capacidade total do tanque (litros)? ");
        capacidadeTanque = scanner.nextDouble();

        System.out.print("Quantos litros de combustível há atualmente no tanque? ");
        combustivelAtual = scanner.nextDouble();

        System.out.print("Qual é a distância da viagem (km)? ");
        distanciaViagem = scanner.nextDouble();

        autonomiaMaxima = consumoMedio * capacidadeTanque;
        autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n \n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Atenção! Você precisará abastecer antes de concluir a viagem.");
        }

        scanner.close();
    }
}
