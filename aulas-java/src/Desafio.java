import java.util.Scanner;

public class Desafio {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String nomeDoCliente = "Leonardo Faneze";
        String tipoConta = "Corrente";
        double saldo = 2500.00;
        int opcao = 0;
        boolean sair = true;
        double verificaTransferencia = 0;

        System.out.printf("""
                *****************************************
                
                Nome do cliente: %s
                Tipo de conta: %s
                Saldo inicial: %.2f
                
                *****************************************
                """, nomeDoCliente, tipoConta, saldo);

        while (sair) {

            System.out.print("""
                    \n
                    Operações
                    
                    1 - Consultar saldo
                    2 - Receber valor
                    3 - Transferir valor
                    4 - Sair
                    
                    Digite a opção desejada:
                    """);

            opcao = in.nextInt();

            switch (opcao){
                case 1:
                    System.out.println("O saldo atual é R$ " + saldo);
                    break;

                case 2:
                    System.out.print("Informe o valor a receber: ");
                    saldo += in.nextDouble();
                    System.out.println("Saldo atualizado R$ " + saldo);
                    break;

                case 3:
                    System.out.print("Informe o valor que deseja transferir: ");
                    verificaTransferencia = in.nextDouble();
                    if (verificaTransferencia < saldo){
                        saldo -= verificaTransferencia;
                        System.out.println("Saldo atualizado R$ " + saldo);
                    } else {
                        System.out.println("Não há saldo suficiente para fazer essa transferencia.");
                    }
                    break;

                case 4:
                    System.out.println("Saindo...");
                    sair = false;
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
