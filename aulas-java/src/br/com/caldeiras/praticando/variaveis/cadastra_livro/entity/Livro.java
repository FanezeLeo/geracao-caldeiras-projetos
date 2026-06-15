package br.com.caldeiras.praticando.variaveis.cadastra_livro.entity;

import br.com.caldeiras.praticando.variaveis.cadastra_livro.enuns.Categoria;

public class Livro {
    private String titulo;
    private String autor;
    private int paginas;
    private double preco;
    private Categoria categoria;

    public Livro(String titulo, String autor, int paginas, double preco, char categoria) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
        this.categoria = Categoria.fromCodigo(categoria);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getCategoria() {
        return categoria.getDescricao();
    }

    public void setCategoria(char categoria) {
        this.categoria = Categoria.fromCodigo(categoria);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", paginas=" + paginas +
                ", preco=" + preco +
                ", categoria=" + categoria +
                '}';
    }
}
