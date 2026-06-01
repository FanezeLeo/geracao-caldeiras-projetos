import java.util.Scanner;

public class Loop {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double mediaAvaliacao;
        double nota = 0;

        for (int i = 0; i < 3; i++){
            System.out.print("Qual a nota de avaliação desse filme: ");
            nota += in.nextDouble();
        }

        mediaAvaliacao = nota/3;
        System.out.println("Média da avaliação: " + mediaAvaliacao);
    }
}
