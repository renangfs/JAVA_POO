import java.util.Scanner;
// é real
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double celsius;
        double fahrenheit;

        System.out.println("Digite a temperatura em Celsius para a conversão:...");
        celsius = scanner.nextDouble();

        fahrenheit = (celsius * 1.8) + 32;
        System.out.printf("A temperatura de %.1f graus celsius corresponde a %.1f fahrenheit%n",celsius,fahrenheit);


    }
}
