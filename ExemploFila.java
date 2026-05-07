import java.util.ArrayDeque;
import java.util.Queue;

public class ExemploFila {
    public static void main(String[] args) {
        // Criar uma Queue usando ArrayDeque
        Queue<Integer> fila = new ArrayDeque<>();

        // Adicionar os números de 1 a 5 usando offer()
        for (int i = 1; i <= 5; i++) {
            fila.offer(i);
        }

        // Remover e exibir cada número usando poll()
        System.out.println("Removendo elementos da fila:");
        while (!fila.isEmpty()) {
            Integer numero = fila.poll();
            System.out.println(numero);
        }
    }
}
