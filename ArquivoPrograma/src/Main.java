import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Criando um objeto Scanner para ler entrada do teclado
        Scanner scanner = new Scanner(System.in);
        //Criando um objeto aluno
        Aluno aluno1 = new Aluno();

        aluno1.nome = "Renan";

        System.out.println("Digite sua matrícula: ");
        aluno1.matricula = scanner.nextLine();
        System.out.println("Digite sua idade: ");
        aluno1.idade = scanner.nextInt();


        System.out.println(aluno1.nome);
        System.out.println(aluno1.matricula);
        System.out.println(aluno1.idade);

    }
}