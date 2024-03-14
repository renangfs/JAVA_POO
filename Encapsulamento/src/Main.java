class Main{

public static void main(String[] args) {
        // instanciando duas contas, c1 e c2
        Conta c1 = new Conta();
        Conta c2 = new Conta();

        // Definindo o nome de ambas pelo método setNome
        c1.setNome("Fulano da Silva");
        c2.setNome("Beltrano de Oliveira");

        // depositando
        c1.deposita(100);
        c2.deposita(200);

        // imprimindo o saldo e o nome dos clientes
        System.out.println("C1 - Nome: " + c1.getNome());
        System.out.println("C1 - Saldo: " + c1.getSaldo());
        System.out.println("C2 - Nome: " + c2.getNome());
        System.out.println("C2 - Saldo: " + c2.getSaldo());
    }
}