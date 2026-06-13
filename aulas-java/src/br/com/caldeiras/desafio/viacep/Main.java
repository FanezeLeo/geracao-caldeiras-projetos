package br.com.caldeiras.desafio.viacep;

import br.com.caldeiras.desafio.viacep.calculos.ConsultaCep;
import br.com.caldeiras.desafio.viacep.calculos.GeradorArquivo;
import br.com.caldeiras.desafio.viacep.modelos.Endereco;
import br.com.caldeiras.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner scanner = new Scanner(System.in);

        String buscarCep;
        ConsultaCep consultaCep = new ConsultaCep();
        GeradorArquivo geradorArquivo = new GeradorArquivo();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        System.out.print("Digite seu CEP: ");
        buscarCep = scanner.nextLine();

        Endereco enderecoEncontrado = consultaCep.consultarCEP(buscarCep);

        if (enderecoEncontrado != null){
            geradorArquivo.gerarArquivoJson(enderecoEncontrado);
            System.out.println("Endereco encontrado!!");
        }
    }
}

