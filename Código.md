### Atribuindo valores a um filme

    public class Main {
        public static void main(String[] args) {
            System.out.println("Esse é o Screen Match");
    
            System.out.println("Filme: Top Gun: Maverick");
    
            int anoDeLancamento = 2022;
            System.out.println("Ano de lançamento: "+anoDeLancamento);
            boolean incluidoNoPlano = true;
            double notaDoFilme = 8.1;
        }
    }  


### Atribui o valor 5 à variável valor
    int valor =  5;  //Atribui o valor 5 à variável valor  

### Equivalente a valor = valor + 15, atribui o valor 25 à variável valor 
    int valor =  10; 
    valor += 15;  //Equivalente a valor = valor + 15, atribui o valor 25 à variável valor 

</br>

    int a = 10 + 5; // Atribui o valor 15 à variável a
    int b = 10 - 5; // Atribui o valor 5 à variável b
    int c = 10 * 5; // Atribui o valor 50 à variável c
    int d = 10 / 5; // Atribui o valor 2 à variável d
    int e = 10 % 3; // Atribui o valor 1 à variável e (o resto da divisão de 10 por 3 é 1)



    int a = 10; // Atribui o valor 10 à variável a
    int b = 5; // Atribui o valor 5 à variável b
    int c = 30; // Atribui o valor 30 à variável c
    
    boolean igual = (b == a); //Nesse caso a variável igual ficará com o valor *false*, pois o valor de b não é igual o valor de a.
    boolean diferente = (b != c); //A variável diferente ficará com o valor *true*, pois o valor de b é diferente do valor de c.
    boolean maior = (b > a); //A variável maior ficará com o valor *false*, pois o valor de b é menor que o valor de a.
    boolean menorIgual = (b <= c); //A variável menorIgual ficará com o valor *true*, pois o valor de b é menor que o valor de c.

</br>

### Este código não será executado, já que a é verdadeiro e b é falso.
    boolean a = true;
    boolean b = false;
    if (a && b) {
       // Este código não será executado, já que a é verdadeiro e b é falso.
    }

</br>

### Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
    boolean a = true;
    boolean b = false;
    if (a || b) {
       // Este código será executado, já que a é verdadeiro, mesmo que b seja falso.
    }

</br>

### Este código não será executado, já que a é verdadeiro.
    boolean a = true;
    if (!a) {
       // Este código não será executado, já que a é verdadeiro.
    }
<hr>

    public class Main {
        public static void main(String[] args) {
            System.out.println("Esse é o Screen Match");
    
            System.out.println("Filme: Top Gun: Maverick");
    
            int anoDeLancamento = 2022;
            System.out.println("Ano de lançamento: "+anoDeLancamento);
            boolean incluidoNoPlano = true;
            double notaDoFilme = 8.1;
    
            //Média calculada pelas 3 notas da Jack
            double media = (9.8 + 6.3 + 8.0) / 3;
            System.out.println(media);
    
            String sinopse;
            sinopse = """
                    Filme Top Gun
                    Filme de aventura com galā dos anos 80
                    Muito bom!
                    Ano de lançamento
                    """+ anoDeLancamento;
            System.out.println(sinopse);
        }
    }


### Para comparar o conteúdo de duas Strings, é necessário utilizar o método equals(). Por exemplo:

    String senha = "12345";
    if (senha.equals("12345")) {
        System.out.println("Acesso autorizado!");
    } else {
        System.out.println("Senha incorreta.");
    }

### Formatando String com Stringformat()

    String nome = "Maria";
    int idade = 30;
    double valor = 55.9999;
    System.out.println(String.format("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais", nome, idade, valor));
%s indica que uma String será inserida no placeholder, %d indica um valor inteiro e %f indica um valor de ponto flutuante.
    
    
### Usando casting para aceitar o tipo primitivo diferente
    int classificacao;
    classificacao = (int) (media/ 2);

      
