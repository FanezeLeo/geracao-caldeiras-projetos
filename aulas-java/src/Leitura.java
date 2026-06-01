import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite seu filme: ");
        String filme = in.nextLine();
        System.out.println(filme);

        System.out.print("Qual o ano de lançamento: ");
        int anoDeLancamento = in.nextInt();
        System.out.println(anoDeLancamento);

        System.out.print("Qual a nota de avaliação desse filme: ");
        double avaliacao = in.nextDouble();
        System.out.println(avaliacao);
    }
}
