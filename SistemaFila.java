import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SistemaFila {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();

        System.out.println("--- Sistema de Atendimento ---");
        System.out.println("Digite um nome, 'atender', 'fila' ou 'sair'");

        while (true) {
            System.out.print("\nDigite um comando ou nome: ");
            String entrada = scanner.nextLine().trim();

            if (entrada.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando sistema...");
                break;
            }

            if (entrada.equalsIgnoreCase("atender")) {
                String atendido = fila.poll();
                if (atendido == null) {
                    System.out.println("Aviso: A fila está vazia!");
                } else {
                    System.out.println("Atendendo: " + atendido);
                }
            } else if (entrada.equalsIgnoreCase("fila")) {
                if (fila.isEmpty()) {
                    System.out.println("A fila está vazia no momento.");
                } else {
                    System.out.println("Clientes na fila: " + fila);
                }
            } else if (!entrada.isEmpty()) {
                fila.offer(entrada);
                System.out.println(entrada + " entrou na fila.");
            }
        }
        scanner.close();
    }
}

