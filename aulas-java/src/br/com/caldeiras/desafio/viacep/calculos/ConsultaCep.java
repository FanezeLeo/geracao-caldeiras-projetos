package br.com.caldeiras.desafio.viacep.calculos;

import br.com.caldeiras.desafio.viacep.modelos.Endereco;
import br.com.caldeiras.screenmatch.modelos.TituloOmdb;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaCep {

    public Endereco consultarCEP(String cep){
        try {
            String endereco = "https://viacep.com.br/ws/"+ cep +"/json/";

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            Endereco enderecoEncontrado = new Gson().fromJson(response.body(), Endereco.class);

            if (enderecoEncontrado.cep() == null) {
                System.out.println("CEP não encontrado.");
                return null;
            }

            return enderecoEncontrado;

        } catch (JsonSyntaxException e){
            System.out.println("Erro: O cep deve ter 8 digitos");
        }catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
}
