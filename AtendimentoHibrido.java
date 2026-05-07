import java.util.LinkedList;
import java.util.Queue;

public class AtendimentoHibrido {
    public static void main(String[] args) {
        // Criar as duas filas
        Queue<String> filaPrioritaria = new LinkedList<>();
        Queue<String> filaNormal = new LinkedList<>();

        // Adicionar nomes na fila Prioritária
        filaPrioritaria.offer("Sr. José (80)");
        filaPrioritaria.offer("Dona Maria (70)");
        filaPrioritaria.offer("Sr. Pedro (65)");

        // Adicionar nomes na fila Normal
        filaNormal.offer("João");
        filaNormal.offer("Maria");
        filaNormal.offer("Carlos");
        filaNormal.offer("Ana");
        filaNormal.offer("Marcos");

        int atendidosPrioritarios = 0;
        int atendidosNormais = 0;

        System.out.println("--- Início do Atendimento ---\n");

        // Loop enquanto houver alguém em qualquer uma das filas
        while (!filaPrioritaria.isEmpty() || !filaNormal.isEmpty()) {
            
            // Atende até 2 da fila prioritária
            for (int i = 0; i < 2 && !filaPrioritaria.isEmpty(); i++) {
                System.out.println("ATENDIMENTO PRIORITÁRIO: " + filaPrioritaria.poll());
                atendidosPrioritarios++;
            }

            // Atende 1 da fila normal
            if (!filaNormal.isEmpty()) {
                System.out.println("Atendimento Normal: " + filaNormal.poll());
                atendidosNormais++;
            }
        }

        // Relatório final
        System.out.println("\n-------------------------");
        System.out.println("Expediente encerrado.");
        System.out.println("Total Prioritários: " + atendidosPrioritarios);
        System.out.println("Total Normais: " + atendidosNormais);
    }
}
