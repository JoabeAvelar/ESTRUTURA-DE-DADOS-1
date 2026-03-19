public class GerenciadorFrutas {
    public static void main(String[] args) {
        // Declara e inicializa o vetor de Strings
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva"};

        // Imprime o valor da primeira posição (índice 0)
        System.out.println("Primeira fruta: " + frutas[0]);

        // Altera o valor da segunda posição (índice 1)
        frutas[1] = "Morango";

        // Imprime o novo valor da segunda posição
        System.out.println("Novo valor da segunda posição: " + frutas[1]);
    }
}
