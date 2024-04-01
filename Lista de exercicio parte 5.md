Vamos explorar na prática conceitos cruciais da herança em programação orientada a objetos: extends, a palavra-chave indicando que uma classe herda de outra; a habilidade de sobrescrever métodos herdados, utilizando a anotação @Override.

Além disso, vamos aplicar o conceito de polimorfismo para evitar duplicação de métodos, proporcionando uma estrutura de código mais eficiente e coesa.

Para consolidar essas ideias, propomos atividades práticas (não obrigatórias) que enriquecerão ainda mais sua compreensão desses princípios fundamentais. Pronto para colocar esses conceitos em prática?

Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos. Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço. Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal para definir preços e mostrar informações.

    // Classe Carro
    public class Carro {
        private String modelo;
        private double precoAno1;
        private double precoAno2;
        private double precoAno3;
    
        public void definirModelo(String modelo) {
            this.modelo = modelo;
        }
    
        public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
            this.precoAno1 = precoAno1;
            this.precoAno2 = precoAno2;
            this.precoAno3 = precoAno3;
        }
    
        public void exibirInfo() {
            System.out.println("Modelo: " + modelo);
            System.out.println("Preço Ano 1: " + precoAno1);
            System.out.println("Preço Ano 2: " + precoAno2);
            System.out.println("Preço Ano 3: " + precoAno3);
            System.out.println("Menor Preço: " + calcularMenorPreco());
            System.out.println("Maior Preço: " + calcularMaiorPreco());
        }
    
        private double calcularMenorPreco() {
            double menorPreco = precoAno1;
    
            if (precoAno2 < menorPreco) {
                menorPreco = precoAno2;
            }
    
            if (precoAno3 < menorPreco) {
                menorPreco = precoAno3;
            }
    
            return menorPreco;
        }
    
        private double calcularMaiorPreco() {
            double maiorPreco = precoAno1;
    
            if (precoAno2 > maiorPreco) {
                maiorPreco = precoAno2;
            }
    
            if (precoAno3 > maiorPreco) {
                maiorPreco = precoAno3;
            }
    
            return maiorPreco;
        }
    }
    
    // Subclasse ModeloCarro
    public class ModeloCarro extends Carro {
        // Pode adicionar propriedades específicas do modelo se necessário
    }

    // Classe de Teste
    public class TesteCarro {
        public static void main(String[] args) {
            ModeloCarro meuCarro = new ModeloCarro();
            meuCarro.definirModelo("Sedan");
            meuCarro.definirPrecos(30000, 32000, 35000);
            meuCarro.exibirInfo();
        }
    }


Crie uma classe Animal com um método emitirSom(). Em seguida, crie duas subclasses: Cachorro e Gato, que herdam da classe Animal. Adicione o método emitirSom() nas subclasses, utilizando a anotação @Override para indicar que estão sobrescrevendo o método. Além disso, adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis() para o Gato.

    // Classe Animal
    public class Animal {
        public void emitirSom() {
            System.out.println("Som do animal");
        }
    }
    
    // Subclasse Cachorro
    public class Cachorro extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("Au Au");
        }
    
        public void abanarRabo() {
            System.out.println("Cachorro abanando o rabo");
        }
    }
    
    // Subclasse Gato
    public class Gato extends Animal {
        @Override
        public void emitirSom() {
            System.out.println("Miau");
        }
    
        public void arranharMoveis() {
            System.out.println("Gato arranhando móveis");
        }
    }
    
    // Classe de Teste
    public class TesteAnimais {
        public static void main(String[] args) {
            Cachorro cachorro = new Cachorro();
            cachorro.emitirSom();
            cachorro.abanarRabo();
    
            Gato gato = new Gato();
            gato.emitirSom();
            gato.arranharMoveis();
        }
    }

Crie uma classe ContaBancaria com métodos para realizar operações bancárias como depositar(), sacar() e consultarSaldo(). Em seguida, crie uma subclasse ContaCorrente que herda da classe ContaBancaria. Adicione um método específico para a subclasse, como cobrarTarifaMensal(), que desconta uma tarifa mensal da conta corrente.

    //Classe ContaBancaria
    public class ContaBancaria {
        protected double saldo;
    
        public void depositar(double valor) {
            saldo += valor;
            System.out.println("Depósito de " + valor + " realizado. Saldo atual: " + saldo);
        }
    
        public void sacar(double valor) {
            if (valor <= saldo) {
                saldo -= valor;
                System.out.println("Saque de " + valor + " realizado. Saldo atual: " + saldo);
            } else {
                System.out.println("Saldo insuficiente para saque.");
            }
        }
    
        public void consultarSaldo() {
            System.out.println("Saldo atual: " + saldo);
        }
    }
    
    //Subclasse ContaCorrente
    public class ContaCorrente extends ContaBancaria {
        private double tarifaMensal;
    
        public void cobrarTarifaMensal() {
            saldo -= tarifaMensal;
            System.out.println("Tarifa mensal de " + tarifaMensal + " cobrada. Saldo atual: " + saldo);
        }
    }
    
    //Classe Teste
    public class TesteContaBancaria {
        public static void main(String[] args) {
            // Criando uma conta bancária com saldo inicial de 1000
            ContaBancaria conta = new ContaBancaria();
            conta.depositar(1000);
            conta.consultarSaldo();
    
            // Realizando operações na conta corrente
            ContaCorrente contaCorrente = new ContaCorrente();
            contaCorrente.depositar(200);
            contaCorrente.cobrarTarifaMensal();
            contaCorrente.consultarSaldo();
            contaCorrente.sacar(150);
            contaCorrente.consultarSaldo();
        }
    }

Crie uma classe NumerosPrimos com métodos como verificarPrimalidade() e listarPrimos(). Em seguida, crie duas subclasses, VerificadorPrimo e GeradorPrimo, que herdam da classe NumerosPrimos. Adicione um método específico para cada uma das subclasses, como verificarSeEhPrimo() para o VerificadorPrimo e gerarProximoPrimo() para o GeradorPrimo.

    public class NumerosPrimos {
        public boolean verificarPrimalidade(int numero) {
            if (numero <= 1) {
                return false;
            }
            for (int i = 2; i * i <= numero; i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
            return true;
        }
    
        public void listarPrimos(int limiteSuperior) {
            System.out.println("Números primos até " + limiteSuperior + ": ");
            for (int i = 2; i <= limiteSuperior; i++) {
                if (verificarPrimalidade(i)) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }
    }
    
    // Subclasse VerificadorPrimo
    public class VerificadorPrimo extends NumerosPrimos {
        public void verificarSeEhPrimo(int numero) {
            if (verificarPrimalidade(numero)) {
                System.out.println(numero + " é primo.");
            } else {
                System.out.println(numero + " não é primo.");
            }
        }
    }
    
    // Subclasse GeradorPrimo
    public class GeradorPrimo extends NumerosPrimos {
        public int gerarProximoPrimo(int ultimoPrimoConhecido) {
            int proximoNumero = ultimoPrimoConhecido + 1;
            while (!verificarPrimalidade(proximoNumero)) {
                proximoNumero++;
            }
            return proximoNumero;
        }
    }
    
    // Classe de Teste
    public class TesteNumerosPrimos {
        public static void main(String[] args) {
            VerificadorPrimo verificador = new VerificadorPrimo();
            verificador.verificarSeEhPrimo(17);
    
            GeradorPrimo gerador = new GeradorPrimo();
            int proximoPrimo = gerador.gerarProximoPrimo(17);
            System.out.println("O próximo primo após 17 é: " + proximoPrimo);
    
            NumerosPrimos numerosPrimos = new NumerosPrimos();
            numerosPrimos.listarPrimos(30);
        }
    }


Caso precise de ajuda, opções de solução das atividades estarão disponíveis na seção “Ver opinião do instrutor”.
