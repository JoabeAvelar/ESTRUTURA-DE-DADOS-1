import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

class Chamada {
    int id;
    String descricao;
    int nivelAtual;

    public Chamada(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.nivelAtual = 1;
    }

    @Override
    public String toString() {
        return "Chamada #" + id + " (" + descricao + ")";
    }
}

public class CallCenterSimulacao {
    public static void main(String[] args) {
        Queue<Chamada> nivel1 = new LinkedList<>();
        Queue<Chamada> nivel2 = new LinkedList<>();
        Queue<Chamada> nivel3 = new LinkedList<>();
        Random random = new Random();

        int resolvidosN1 = 0, resolvidosN2 = 0, resolvidosN3 = 0;

        // Adicionar 5 chamadas iniciais no Nível 1
        for (int i = 1; i <= 5; i++) {
            nivel1.offer(new Chamada(i, "Problema técnico " + i));
        }

        System.out.println("--- Iniciando Processamento do Call Center --- \n");

        // Processar Nível 1
        while (!nivel1.isEmpty()) {
            Chamada c = nivel1.poll();
            System.out.print("Nível 1 atendendo " + c + "... ");
            
            if (random.nextInt(100) < 70) { // 70% de chance
                System.out.println("RESOLVIDO!");
                resolvidosN1++;
            } else {
                System.out.println("Não resolvido. Escalando para Nível 2.");
                c.nivelAtual = 2;
                nivel2.offer(c);
            }
        }

        System.out.println();

        // Processar Nível 2
        while (!nivel2.isEmpty()) {
            Chamada c = nivel2.poll();
            System.out.print("Nível 2 atendendo " + c + "... ");
            
            if (random.nextInt(100) < 50) { // 50% de chance
                System.out.println("RESOLVIDO!");
                resolvidosN2++;
            } else {
                System.out.println("Não resolvido. Escalando para Nível 3.");
                c.nivelAtual = 3;
                nivel3.offer(c);
            }
        }

        System.out.println();

        // Processar Nível 3
        while (!nivel3.isEmpty()) {
            Chamada c = nivel3.poll();
            System.out.println("Nível 3 atendendo " + c + "... RESOLVIDO (100%)!");
            resolvidosN3++;
        }

        // Estatísticas Finais
        System.out.println("\n=== ESTATÍSTICAS FINAIS ===");
        System.out.println("Resolvidos no Nível 1: " + resolvidosN1);
        System.out.println("Resolvidos no Nível 2: " + resolvidosN2);
        System.out.println("Resolvidos no Nível 3: " + resolvidosN3);
        System.out.println("Total de chamadas: " + (resolvidosN1 + resolvidosN2 + resolvidosN3));
    }
}
