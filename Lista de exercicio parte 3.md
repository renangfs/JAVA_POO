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
3. Desenvolva uma classe `Produto` com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
4. Desenvolva uma classe `Aluno` com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
5. Desenvolva uma classe `Livro` com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.

---

Caso precise de ajuda, opções de solução das atividades estarão disponíveis na seção “Ver opinião do instrutor”.
