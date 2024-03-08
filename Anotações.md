![image](https://github.com/renangfs/Java_POO/assets/61218420/9fce265e-ed67-482f-9679-452c7c45fc3b)


### Classes e Objetos
Na Orientação a Objetos, temos dois conceitos essenciais, que são:

- Classes;
- Objetos.

### Classes
no mundo real, podemos identificar e classificar diversos objetos que compartilham um conjunto de características em comum. Por exemplo, um livro é um conceito que pode representar vários objetos com características compartilhadas, como capa, autor, número de páginas, ISBN, entre outros; assim, diante de objetos que têm em comum esse conjunto de características, conseguimos classificá-los como livros, certo?

O que é Classe na Orientação a Objetos?
Por definição, uma classe serve como um modelo, uma “planta”, um desenho por meio do qual objetos serão criados. No Java, podemos definir uma classe como mostrado na codificação abaixo:

    public class Pessoa {
        public String nome;
        public String email;
        public String cpf;  
    }
Em uma classe, além das características (propriedades) comuns aos objetos, temos também os comportamentos que aquele objeto pode executar. Veja um exemplo:

    public class Pessoa {
        public String nome;
        public String email;
        public String cpf;
    
        public String exibirDados() {
            return "=== Dados da Pessoa ===" + "\n" +
                    "Nome: " + this.nome + "\n" +
                    "Email: " + this.email + "\n" +
                    "CPF: " + this.cpf;
        }
    }

Então, para a utilização de objetos precisamos definir as classes, por isso alguns defendem que poderíamos chamar de “Programação Orientada a Classes”, o que daria muito certo também!

### Objetos
Como já demos um spoiler, um objeto é criado a partir da definição de uma classe. Ele representa uma instância específica de um objeto existente em um conjunto de objetos.

### O que é Objeto na Orientação a Objetos?
Os objetos são essenciais na Programação Orientada a Objetos, pois serão eles que irão interagir e executar as funcionalidades do sistema. Então, tomando como exemplo a definição da classe Pessoa, do exemplo acima, para representar um único objeto do conjunto “pessoas” no Java, escrevemos da seguinte forma:

    //Definindo um objeto pessoa.
            Pessoa andre = new Pessoa();
            andre.nome = "André Silva";
            andre.email = "andre@email.com";
            andre.cpf = "1111111-11";
            System.out.println(andre.exibirDados());
    
             //Definindo um outro objeto pessoa.
             Pessoa helen = new Pessoa();
             helen.nome = "Helen Cardoso";
             helen.email = "helen@email.com";
             helen.cpf = "2222222-22";
             System.out.println(helen.exibirDados());

Note que no exemplo definimos dois objetos do tipo Pessoa e ambos possuem as mesmas propriedades: nome, email e cpf, mas cada um possui um conjunto de dados que os tornam diferentes.

## Os pilares da O.O.
Além dos dois conceitos centrais desse paradigma, apresentados anteriormente, temos alguns outros conceitos que são de extrema importância e que formam os pilares da Programação Orientada a Objetos:

- Polimorfismo;
- Herança;
- Abstração;
- Encapsulamento.

![image](https://github.com/renangfs/JavaPOO/assets/61218420/68c7ecb3-f13f-4391-9989-eff573f25b27)


### Polimorfismo
Palavra de origem grega e que significa “várias formas”. Por meio da implementação desse conceito, podemos fazer um objeto de uma determinada classe executar um comportamento diferente de acordo com algum parâmetro passado.

### Herança
É um mecanismo muito importante na Orientação a Objetos, no qual uma classe pode herdar atributos e comportamentos de uma outra classe. Por meio da herança conseguimos reaproveitar o código, podendo facilitar a implementação e a manutenção de classes no futuro.

    public class Producao {
        public int id;
        public String nome;
        public String classificacao;
        public String diretor;
        public String estudio;
        public Date dataLancamento;
    }
Agora vamos fazer uma classe herdar da classe Produção:

    public class Serie extends Producao {
        public int temporadas;
        public Date dataEncerramento;
    }
    
Em resumo, fizemos a classe Serie herdar de Producao. Mas, o que ela herda? Pela herança, uma classe derivada herda os atributos, então Serie possui agora: id, nome, classificação e também os comportamentos que forem definidos em Producao.

### Abstração
É um processo mental, é a atividade onde vamos definir o que é importante para ser representado em um sistema. Por exemplo: na definição de um sistema médico para acompanhamento de pacientes, pode ser necessário identificar o nome, CPF, data de nascimento, tipo sanguíneo, etc.

Já para um sistema de paciente no contexto de uma clínica de beleza, as informações essenciais podem ser: identidade, endereço, telefone de contato e e-mail.

    Este processo de identificar e analisar quais informações deverão ser modeladas em uma classe de um sistema é a abstração.

### Encapsulamento
Conceitualmente, o encapsulamento é algo bem simples. A ideia aqui é conseguirmos ocultar parte do nosso código para implementar segurança a fim de que a modificação na estrutura de um determinado objeto não afete outros em nosso sistema.

### A convenção de código do Java é um conjunto de regras recomendadas para escrever código Java que é fácil de ler, entender e manter. Essas regras foram definidas pela Oracle, a empresa que mantém a linguagem Java, e são amplamente seguidas pela comunidade de desenvolvedores Java.

### Aqui estão algumas das principais convenções de código do Java:

- Nomes de classes devem começar com letra maiúscula e usar a convenção PascalCase (também conhecida como Upper CamelCase).
  
        Exemplo: MinhaClasse.

- Nomes de métodos devem começar com letra minúscula e usar a convenção camelCase.
  
        Exemplo: meuMetodo().

- Nomes de constantes devem ser totalmente em letras maiúsculas, separadas por underline.

        Exemplo: MINHA_CONSTANTE.

- Nomes de variáveis devem começar com letra minúscula e usar a convenção camelCase.

        Exemplo: minhaVariavel.

- Todas as linhas de código devem ter no máximo 80 caracteres de largura para facilitar a leitura.

- Recomenda-se usar espaços em branco para separar operadores, palavras-chave e elementos de controle de fluxo.

        Exemplo: if (condicao) {.

- Use comentários para documentar seu código, explicando o que ele faz e por que ele faz isso. Comentários devem ser claros e concisos.
<hr>
O casting é utilizado para permitir que tipos de dados incompatíveis possam ser utilizados em uma mesma operação ou expressão. Por exemplo, se um método espera um parâmetro do tipo int e o valor que se deseja passar é do tipo double, é necessário fazer um casting para converter o valor em int.

![image](https://github.com/renangfs/Java_POO/assets/61218420/e0503efe-bd26-4d00-b773-9677a18caf47)


