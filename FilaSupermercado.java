import java.util.LinkedList;
import java.util.Queue;

public class FilaSupermercado {
    public static void main(String[] args) {
        // Criar a fila de clientes
        Queue<String> fila = new LinkedList<>();

        // 1. Adicionar 5 clientes na fila
        fila.offer("Ana");
        fila.offer("Bruno");
        fila.offer("Carla");
        fila.offer("Diego");
        fila.offer("Elena");

        // 2. Exibir a fila completa
        System.out.println("Fila atual: " + fila);
        System.out.println("-------------------------");

        int totalAtendido = 0;

        // 3. Atender (remover) um a um
        while (!fila.isEmpty()) {
            String clienteSendoAtendido = fila.poll();
            System.out.println("Atendendo agora: " + clienteSendoAtendido);
            totalAtendido++;
        }

        // 4. Exibir o total de clientes atendidos
        System.out.println("-------------------------");
        System.out.println("Expediente encerrado. Total de clientes atendidos: " + totalAtendido);
    }
}
