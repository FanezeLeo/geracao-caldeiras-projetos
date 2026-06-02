public class Main{
    public static void main(String[] args) {
        Filme filme = new Filme();

        filme.exibirFichaTecnica();
        filme.adicionarAvaliacao(4);
        filme.adicionarAvaliacao(6);
        filme.adicionarAvaliacao(8);

        System.out.println(filme.MediaAvaliacao());
    }
}