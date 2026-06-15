package br.com.caldeiras.praticando.variaveis.cadastra_livro;

import br.com.caldeiras.praticando.variaveis.cadastra_livro.entity.Livro;

public class Main {
    public static void main(String[] args) {
        try {
            Livro livro = new Livro(
                    "Clean Code",
                    "Robert C. Martin",
                    464,
                    89.90,
                    'T'
            );

            System.out.println(livro);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

    }
}
