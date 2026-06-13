package br.com.caldeiras.desafio.viacep.calculos;

import br.com.caldeiras.desafio.viacep.modelos.Endereco;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorArquivo {
    public void gerarArquivoJson(Endereco endereco) {
        try {
            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();

            FileWriter escrita = new FileWriter(endereco.cep() + ".json");
            escrita.write(gson.toJson(endereco));
            escrita.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
