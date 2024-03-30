Na programação orientada a objetos, conceitos fundamentais como classe, métodos, atributos e instanciação desempenham papéis cruciais na organização e estruturação do código.

Compreender esses conceitos é fundamental para a programação orientada a objetos, pois proporciona uma estrutura organizada, modular e reutilizável ao código. Para aprimorar essas habilidades, criamos uma lista de atividades (não obrigatórias) focada na prática para melhorar ainda mais sua experiência de aprendizagem. Vamos praticar?

Crie uma classe Pessoa com um método que exibe "Olá, mundo!" no console.
      
    //Classe Pessoa
    public class Pessoa {
    
         void saudacao() {
            System.out.println("Olá, mundo!");
        }
    }
    
    //Classe Principal
    public class Principal {
    
        public static void main(String[] args) {
        
            Pessoa pessoa = new Pessoa();
            pessoa.saudacao();
        }
    }


Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.

    //Classe Calculadora
    public class Calculadora {
    
        public int dobrarNumero(int numero) {
            return numero * 2;
        }
    }
    
    //Classe Principal
    public class Principal {
    
        public static void main(String[] args) {
        
            Calculadora calculadora = new Calculadora();
            int resultado = calculadora.dobrarNumero(5);
            System.out.println(resultado);
        }
    }

Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    //Classe Musica
    public class Musica {
        String titulo;
        String artista;
        int anoLancamento;
        double somaDasAvaliacoes;
        int numAvaliacoes;
    
        void exibeFichaTecnica() {
            System.out.println("Título da música: " + titulo);
            System.out.println("Artista: " + artista);
            System.out.println("Ano de lançamento: " + anoLancamento);
        }
    
        void avalia(double nota) {
            somaDasAvaliacoes += nota;
            numAvaliacoes++;
        }
    
        double pegaMedia() {
            return somaDasAvaliacoes / numAvaliacoes;
        }
    }
    
    //Classe Principal
    public class Principal {
        public static void main(String[] args) {
            Musica minhaMusica = new Musica();
    
            minhaMusica.titulo = "Nome da Música";
            minhaMusica.artista = "Nome do Artista";
            minhaMusica.anoLancamento = 2023;
    
            minhaMusica.exibeFichaTecnica();
    
            minhaMusica.avalia(4.5);
            minhaMusica.avalia(3.8);
            minhaMusica.avalia(5.0);
    
            double mediaAvaliacoes = minhaMusica.pegaMedia();
            System.out.println("Média das avaliações: " + mediaAvaliacoes);
        }
    }

Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

    //Classe Carro
    public class Carro {
        String modelo;
        int ano;
        String cor;
    
        void exibeFichaTecnica() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Ano: " + ano);
            System.out.println("Cor: " + cor);
        }
    
        int calculaIdade() {
            return 2023 - ano;
        }
    }
    
    //Classe Principal
    public class Principal {
        public static void main(String[] args) {
            Carro meuCarro = new Carro();
            meuCarro.modelo = "Gol";
            meuCarro.ano = 2023;
            meuCarro.cor = "Preto";
    
            // Exibir ficha técnica
            meuCarro.exibeFichaTecnica();
    
            // Calcular idade do carro
            System.out.println("Idade do carro: " + meuCarro.calculaIdade() + " anos");
        }
    }

Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.

    //Classe Aluno
    public class Aluno {
        String nome;
        int idade;
    
        void exibeInformacoes() {
            System.out.println("Nome do aluno: " + nome);
            System.out.println("Idade do aluno: " + idade);
        }
    }
    
    //Classe Principal
    public class Principal {
        public static void main(String[] args) {
            Aluno meuAluno = new Aluno();
            meuAluno.nome = "Akemi";
            meuAluno.idade = 18;
    
            meuAluno.exibeInformacoes();
        }
    }

Caso precise de ajuda, opções de solução das atividades estarão disponíveis na seção “Ver opinião do Instrutor”.
