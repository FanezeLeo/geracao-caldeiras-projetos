import java.util.Scanner;

public class LoopCondicao {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        double mediaAvaliacao = 0;
        double nota = 0;
        int totalDeNotas = 0;

       while (nota != -1){
            System.out.print("Qual a nota de avaliação desse filme: ");
            nota = in.nextDouble();
            if(nota != -1){
                mediaAvaliacao += nota;
                totalDeNotas++;
            }
       }

        mediaAvaliacao = mediaAvaliacao/totalDeNotas;
        System.out.println("Média da avaliação: " + mediaAvaliacao);
    }
}
