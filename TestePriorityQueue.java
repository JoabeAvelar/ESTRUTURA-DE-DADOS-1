import java.util.PriorityQueue;
import java.util.Random;

public class TestePriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> filaPrioridade = new PriorityQueue<>();
        Random random = new Random();

        // 1. Adicionar 10 números aleatórios entre 1 e 100
        System.out.println("Adicionando números:");
        for (int i = 0; i < 10; i++) {
            int num = random.nextInt(100) + 1;
            filaPrioridade.offer(num);
            System.out.print(num + " ");
        }

        // 2. Exibir a fila (ordem interna do array/heap)
        System.out.println("\n\nFila completa (toString): " + filaPrioridade);

        // 3. Remover e exibir todos os números
        System.out.println("\nRemovendo com poll():");
        while (!filaPrioridade.isEmpty()) {
            System.out.print(filaPrioridade.poll() + " ");
        }
    }
}
