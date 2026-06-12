package br.com.caldeiras.screenmatch.principal;

import br.com.caldeiras.screenmatch.excecao.ErroDadoInvalido;
import br.com.caldeiras.screenmatch.modelos.Titulo;
import br.com.caldeiras.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        String buscaFilme = "";
        Scanner scanner = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create();

        while (!buscaFilme.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme para busca: ");
            buscaFilme = scanner.nextLine();

            if(buscaFilme.equalsIgnoreCase("sair")){
                break;
            }

            try {
                String endereco = "https://www.omdbapi.com/?t=" + buscaFilme + "&apikey=beab0163";
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(endereco))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                Titulo meuTitulo = new Titulo(meuTituloOmdb);

                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Caracter inserido na busca é invalido!");
            } catch (ErroDadoInvalido e) {
                System.out.println(e.getMessage());
            }
        }

        FileWriter escrita = new FileWriter("filmes.json");

        escrita.write(gson.toJson(titulos));
        escrita.close();
        System.out.println(titulos);
    }
}
