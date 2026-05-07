import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

class Tarefa implements Comparable<Tarefa> {
    String nome;
    int prioridade;
    int ordem;

    public Tarefa(String nome, int prioridade, int ordem) {
        this.nome = nome;
        this.prioridade = prioridade;
        this.ordem = ordem;
    }

    @Override
    public int compareTo(Tarefa outra) {
        if (this.prioridade != outra.prioridade) {
            return Integer.compare(this.prioridade, outra.prioridade);
        }
        return Integer.compare(this.ordem, outra.ordem);
    }

    @Override
    public String toString() {
        return nome + " (Prioridade: " + prioridade + ")";
    }
}

public class SistemaTarefas {
    public static void main(String[] args) {
        PriorityQueue<Tarefa> fila = new PriorityQueue<>();
        List<Tarefa> listaEntrada = new ArrayList<>();
        int contador = 1;

        // Criando as tarefas conforme seu exemplo
        Tarefa[] tarefasParaAdicionar = {
            new Tarefa("Fazer backup", 2, contador++),
            new Tarefa("Reiniciar servidor", 1, contador++),
            new Tarefa("Limpar logs", 3, contador++),
            new Tarefa("Atualizar sistema", 1, contador++),
            new Tarefa("Responder emails", 2, contador++)
        };

        System.out.println("Tarefas adicionadas:");
        for (int i = 0; i < tarefasParaAdicionar.length; i++) {
            Tarefa t = tarefasParaAdicionar[i];
            System.out.println((i + 1) + ". " + t);
            fila.offer(t);
        }

        System.out.println("\n=== EXECUTANDO TAREFAS ===");
        int execucao = 1;
        while (!fila.isEmpty()) {
            System.out.println((execucao++) + ". " + fila.poll());
        }
    }
}
