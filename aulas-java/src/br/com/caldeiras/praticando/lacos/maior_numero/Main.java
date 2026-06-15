package br.com.caldeiras.praticando.lacos.maior_numero;

public class Main {
    public static void main(String[] args) {

        int [] numeros = {3, 7, 2, 9, 5};
        int maiorNumero = numeros[0];

        for(int i = 1; i < numeros.length; i++){
            if(numeros[i] > maiorNumero){
                maiorNumero = numeros[i];
            }
        }

        System.out.println("O maior número é: " + maiorNumero);

    }
}
