public class Main{
    public static void main(String[] args){
        System.out.println("Esse e o Screen Match");
        String nomeDoFilme = "Filme: Top Gun: Maverick";
        int anoDeLancamento = 2022;

//        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        int classificacao = (int) (media / 2);

//        System.out.println(media);

        String sinopse = """
            %s
            Sinopse: Filme de aventura!
            Nota do fime: %.1f
            Média: %d
            Ano de lançamento: %d
            """.formatted(nomeDoFilme, notaDoFilme, classificacao, anoDeLancamento);
        System.out.println(sinopse);
    }
}