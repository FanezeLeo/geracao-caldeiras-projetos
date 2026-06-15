package br.com.caldeiras.praticando.variaveis.cadastra_livro.enuns;

public enum Categoria {
    F('F', "ficção"),
    N('N', "Não-ficção"),
    T('T', "Tecnologia"),
    H('H', "História");

    private final char codigo;
    private final String descricao;

    Categoria(char codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public char getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Categoria fromCodigo(char codigo) {
        for (Categoria categoria : Categoria.values()) {
            if (categoria.getCodigo() == Character.toUpperCase(codigo)) {
                return categoria;
            }
        }

        throw new IllegalArgumentException("Categoria inválida: " + codigo);
    }
}
