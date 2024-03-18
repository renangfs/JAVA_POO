import java.util.Scanner;
public class Operacoes {
    Scanner leituraOP = new Scanner(System.in);
    private float saldo = 2500;
    private float receberValor = 0;
    private float transferirValor = 0;

    public void ConsultarSaldo(){
        System.out.println("********************************************************");
        System.out.println("Seu saldo atual é R$:"+saldo);
        System.out.println("********************************************************");

    }
    public void ReceberValor(){
        System.out.println("********************************************************");
        System.out.println("Digite o valor a receber:...");
        receberValor = leituraOP.nextFloat();
        saldo = saldo + receberValor;
        System.out.println("********************************************************");
        System.out.println("Saldo atualizado para R$:"+saldo);
        System.out.println("********************************************************");
    }
    public void TransferirValor(){
        System.out.println("********************************************************");
        System.out.println("Digite o valor a Tranferir:...");
        transferirValor = leituraOP.nextFloat();
        if(saldo < transferirValor){
            System.out.println("********************************************************");
            System.out.println("Não há saldo suficiente para realizar a transferência");
            System.out.println("********************************************************");
        }else {
            saldo = saldo - transferirValor;
            System.out.println("********************************************************");
            System.out.println("Saldo atualizado para R$:" + saldo);
            System.out.println("********************************************************");
        }
    }
}


