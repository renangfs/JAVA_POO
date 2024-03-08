public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        //add segundo push
        aluno1.setNome("Renan");
        aluno1.setMatricula("12345");
        aluno1.setIdade(20);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getMatricula());
        System.out.println(aluno1.getIdade());
    }
}