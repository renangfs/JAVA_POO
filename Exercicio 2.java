import java.util.Scanner;//importando biblioteca para entrada de dados via teclado

public class NotaMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);//Objeto de suporte para entrada de dados
        float nota1;
        float nota2;

        System.out.println("Digite a primeira nota:...");
        nota1 = scanner.nextFloat();
        System.out.println("Digite a segunda nota:...");
        nota2 = scanner.nextFloat();

        System.out.println((nota1 + nota2)/2);

    }
}
