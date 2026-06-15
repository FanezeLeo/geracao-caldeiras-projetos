package br.com.caldeiras.praticando.lacos.soma_dos_valores_pares;

public class Main {
    public static void main(String[] args) {
        int somaTotal = 0;

        for (int i = 1; i <= 100; i++){
            if((i % 2) == 0){
                somaTotal += i;
            }
        }

        System.out.println("Valor total: " + somaTotal);
    }
}
