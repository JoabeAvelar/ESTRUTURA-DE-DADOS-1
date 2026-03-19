public class ListaNotas {
    public static void main(String[] args) {
        // Declara e inicializa o vetor com os valores fornecidos
        int[] notas = {85, 92, 78, 95, 88};

        // Percorre o vetor usando o laço for
        for (int i = 0; i < notas.length; i++) {
            // Exibe a posição (i + 1) e o valor da nota
            System.out.println("Nota " + (i + 1) + ": " + notas[i]);
        }
    }
}
