import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Operacoes objOperacoes = new Operacoes();
        Scanner leituraM = new Scanner(System.in);

        int escolha = 0;
        System.out.println("********************************************************");
        System.out.println("Nome:......................................Renan Germano");
        System.out.println("Tipo de conta:..................................Corrente");
        System.out.println("Saldo inicial:................................R$:2500,00");
        System.out.println("********************************************************");

        while (escolha < 4){

            System.out.println("Menu de Operações");
            System.out.println("1 - Consultar saldos");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ...");
            escolha = leituraM.nextInt();

            if (escolha == 1) {
                objOperacoes.ConsultarSaldo();
            } else if (escolha == 2) {
                objOperacoes.ReceberValor();
            } else if (escolha == 3) {
                objOperacoes.TransferirValor();
            }
        }
        System.out.println("********************************************************");
        System.out.println("Programa Encerrado");
        System.out.println("********************************************************");

    }
}




