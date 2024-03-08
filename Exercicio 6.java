public class CalculaDesconto {
    public static void main(String[] args) {
        double precoOriginal = 100.0; // Preço original do produto em reais
        double percentualDesconto = 10.0; // Percentual de desconto
        double desconto = (precoOriginal * percentualDesconto) / 100; // Calcula o valor do desconto em reais
        double precoComDesconto = precoOriginal - desconto; // Calcula o novo preço com desconto
        System.out.println("Preço original: R$ " + precoOriginal);
}
