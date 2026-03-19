public class SomaPrecos {
    public static void main(String[] args) {
        // Declara e inicializa o vetor de double
        double[] precos = {1.50, 2.75, 5.00, 3.25};
        double soma = 0;

        // Percorre o vetor e acumula os valores na variável soma
        for (int i = 0; i < precos.length; i++) {
            soma += precos[i];
        }

        // Imprime o resultado final
        System.out.println("A soma total dos preços é: " + soma);
    }
}
