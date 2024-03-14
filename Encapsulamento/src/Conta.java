class Conta {
    private double Saldo = 0;
    private String Nome;
    //Declaração dos Metodos
    public void deposita(double Valor) {
        //deposita o valor + 10% dele
        this.Saldo = this.Saldo + Valor + (Valor * 0.10);
    }
    public double getSaldo() {
        return this.Saldo;
    }
    public void setNome(String N) {
        this.Nome = N;
    }
    public String getNome() {
        return this.Nome;
    }
}

