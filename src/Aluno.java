public class Aluno {
    private String nome;
    private String matricula;
    private int idade;

    public void setNome(String nome){//capturando nome da class main e guardando na variável nome da classe aluno
        this.nome = nome;
    }
    public void setMatricula(String matricula){
        this.matricula = matricula;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNome() {//pegando a variável armazenada na classe aluno e retornando o valor para class main
        return nome;
    }
    public String getMatricula(){
        return matricula;
    }
    public int getIdade(){
        return idade;
    }
}