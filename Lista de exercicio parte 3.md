Vamos aplicar na prática os conceitos de modificadores de acesso public e private, import, this, getters e setters. Para reforçar essas habilidades, propomos uma lista de atividades práticas (**não obrigatórias**), enriquecendo ainda mais sua experiência de aprendizado.

Vamos colocar esses conceitos em ação?

1. Crie uma classe `ContaBancaria` com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.

            //Classe ContaBancaria
            public class ContaBancaria {
                private int numeroConta;
                private double saldo;
                public String titular;
            
                public int getNumeroConta() {
                    return numeroConta;
                }
            
                public void setNumeroConta(int numeroConta) {
                    this.numeroConta = numeroConta;
                }
            
                public double getSaldo() {
                    return saldo;
                }
            
                public void setSaldo(double saldo) {
                    this.saldo = saldo;
                }
            }
            
            //Classe Principal
            public class Principal {
                public static void main(String[] args) {
                    ContaBancaria conta = new ContaBancaria();
            
                    conta.setNumeroConta(123);
                    conta.setSaldo(1000);
                    conta.titular = "João";
            
                    System.out.println("Número da Conta: " + conta.getNumeroConta());
                    System.out.println("Saldo: " + conta.getSaldo());
                    System.out.println("Titular: " + conta.titular);
            
                    conta.setSaldo(1500);
                    System.out.println("Novo Saldo: " + conta.getSaldo());
                }
            }

2. Crie uma classe `idadePessoa` com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.

            //Classe IdadePessoa
            public class IdadePessoa {
                private String nome;
                private int idade;
            
                public String getNome() {
                    return nome;
                }
            
                public void setNome(String nome) {
                    this.nome = nome;
                }
            
                public int getIdade() {
                    return idade;
                }
            
                public void setIdade(int idade) {
                    this.idade = idade;
                }
            
                public void verificarIdade() {
                    if (idade >= 18) {
                        System.out.println(nome + " é maior de idade.");
                    } else {
                        System.out.println(nome + " não é maior de idade.");
                    }
                }
            }
            
            // Classe Principal
            public class Principal {
                public static void main(String[] args) {
                    IdadePessoa pessoa1 = new IdadePessoa();
                    pessoa1.setNome("Carowl");
                    pessoa1.setIdade(22);
            
                    IdadePessoa pessoa2 = new IdadePessoa();
                    pessoa2.setNome("Camila");
                    pessoa2.setIdade(20);
            
                    System.out.println(pessoa1.getNome() + " tem " + pessoa1.getIdade() + " anos.");
                    pessoa1.verificarIdade();
            
                    System.out.println(pessoa2.getNome() + " tem " + pessoa2.getIdade() + " anos.");
                    pessoa2.verificarIdade();
                }
            }


3. Desenvolva uma classe `Produto` com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

            //Classe Produto
            public class Produto {
                private String nome;
                private double preco;
            
                public String getNome() {
                    return nome;
                }
            
                public void setNome(String nome) {
                    this.nome = nome;
                }
            
                public double getPreco() {
                    return preco;
                }
            
                public void setPreco(double preco) {
                    this.preco = preco;
                }
            
                public void aplicarDesconto(double percentual) {
                    double desconto = preco * (percentual / 100);
                    preco -= desconto;
                }
            }
            
            //Classe Principal
            public class Principal {
                public static void main(String[] args) {
                    Produto produto = new Produto("Celular", 2000.0);
            
                    System.out.println("Nome do Produto: " + produto.getNome());
                    System.out.println("Preço: " + produto.getPreco());
            
                    produto.aplicarDesconto(10);
                    System.out.println("Novo Preço após Desconto: " + produto.getPreco());
                }
            }


4. Desenvolva uma classe `Aluno` com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.

            //Classe Aluno
            public class Aluno {
                private String nome;
                private double nota1;
                private double nota2;
                private double nota3;
            
                public String getNome() {
                    return nome;
                }
            
                public void setNome(String nome) {
                    this.nome = nome;
                }
            
                public double getNota1() {
                    return nota1;
                }
            
                public void setNota1(double nota1) {
                    this.nota1 = nota1;
                }
            
                public double getNota2() {
                    return nota2;
                }
            
                public void setNota2(double nota2) {
                    this.nota2 = nota2;
                }
            
                public double getNota3() {
                    return nota3;
                }
            
                public void setNota3(double nota3) {
                    this.nota3 = nota3;
                }
            
                public double calcularMedia() {
                    return (nota1 + nota2 + nota3) / 3;
                }
            }
            
            
            //Classe Principal
            public class Principal {
                public static void main(String[] args) {
                    Aluno aluno1 = new Aluno("Lulu", 7.5, 8.0, 9.2);
                    Aluno aluno2 = new Aluno("Karina", 6.8, 7.3, 8.5);
            
                    System.out.println("Aluno 1:");
                    System.out.println("Nome: " + aluno1.getNome());
                    System.out.println("Nota 1: " + aluno1.getNota1());
                    System.out.println("Nota 2: " + aluno1.getNota2());
                    System.out.println("Nota 3: " + aluno1.getNota3());
                    System.out.println("Média: " + aluno1.calcularMedia());
                    System.out.println();
            
                    System.out.println("Aluno 2:");
                    System.out.println("Nome: " + aluno2.getNome());
                    System.out.println("Nota 1: " + aluno2.getNota1());
                    System.out.println("Nota 2: " + aluno2.getNota2());
                    System.out.println("Nota 3: " + aluno2.getNota3());
                    System.out.println("Média: " + aluno2.calcularMedia());
                }
            }


5. Desenvolva uma classe `Livro` com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

            //Classe Livro
            public class Livro {
                private String titulo;
                private String autor;
            
                public String getTitulo() {
                    return titulo;
                }
            
                public void setTitulo(String titulo) {
                    this.titulo = titulo;
                }
            
                public String getAutor() {
                    return autor;
                }
            
                public void setAutor(String autor) {
                    this.autor = autor;
                }
            
                public void exibirDetalhes() {
                    System.out.println("Título: " + titulo);
                    System.out.println("Autor: " + autor);
                }
            }
            
            // Classe Principal
            public class Principal {
                public static void main(String[] args) {
                    Livro livro1 = new Livro();
                    livro1.setTitulo("Lógica de Programação");
                    livro1.setAutor("Paulo Silveira");
            
                    Livro livro2 = new Livro();
                    livro2.setTitulo("A lógica do jogo");
                    livro2.setAutor("Marcus Becker");
            
                    livro1.exibirDetalhes();
                    livro2.exibirDetalhes();
                }
            }

Caso precise de ajuda, opções de solução das atividades estarão disponíveis na seção “Ver opinião do instrutor”.
