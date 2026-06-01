public class Main{
    public static void main(String[] args){
        System.out.println("Esse e o Screen Match");
        String nomeDoFilme = "Filme: Top Gun: Maverick";
        int anoDeLancamento = 2022;

//        System.out.println("Ano de lançamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;

//        System.out.println(media);

        String sinopse = """
            %s
            Sinopse: Filme de aventura!
            Nota do fime: %.1f
            Ano de lançamento: %d
            """.formatted(nomeDoFilme, notaDoFilme, anoDeLancamento);
        System.out.println(sinopse);
    }
}