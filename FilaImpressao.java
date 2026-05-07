import java.util.LinkedList;
import java.util.Scanner;

class Documento {
    private static int contadorGlobal = 1;
    private int id;
    private String nomeDocumento;
    private String usuario;

    public Documento(String nomeDocumento, String usuario) {
        this.id = contadorGlobal++;
        this.nomeDocumento = nomeDocumento;
        this.usuario = usuario;
    }

    public int getId() { return id; }

    @Override
    public String toString() {
        return String.format("[ID: %d] %s (Usuário: %s)", id, nomeDocumento, usuario);
    }
}

public class FilaImpressao {
    public static void main(String[] args) {
        LinkedList<Documento> fila = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- FILA DE IMPRESSÃO ---");
            System.out.println("1. Adicionar documento");
            System.out.println("2. Imprimir próximo");
            System.out.println("3. Cancelar documento (por ID)");
            System.out.println("4. Exibir fila");
            System.out.println("0. Sair");
            System.out.print("Opção: ");
            
            String opcao = scanner.nextLine();

            if (opcao.equals("0")) break;

            switch (opcao) {
                case "1":
                    System.out.print("Nome do documento: ");
                    String doc = scanner.nextLine();
                    System.out.print("Nome do usuário: ");
                    String user = scanner.nextLine();
                    fila.addLast(new Documento(doc, user));
                    System.out.println("Documento enviado para a fila!");
                    break;

                case "2":
                    Documento proximo = fila.pollFirst();
                    if (proximo == null) {
                        System.out.println("Erro: Não há documentos para imprimir.");
                    } else {
                        System.out.println("Imprimindo: " + proximo);
                    }
                    break;

                case "3":
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                        break;
                    }
                    System.out.print("Informe o ID para cancelar: ");
                    int idParaRemover = Integer.parseInt(scanner.nextLine());
                    
                    boolean removido = fila.removeIf(d -> d.getId() == idParaRemover);
                    
                    if (removido) {
                        System.out.println("Documento ID " + idParaRemover + " cancelado com sucesso.");
                    } else {
                        System.out.println("Erro: Documento com ID " + idParaRemover + " não encontrado.");
                    }
                    break;

                case "4":
                    if (fila.isEmpty()) {
                        System.out.println("Fila de impressão vazia.");
                    } else {
                        System.out.println("Documentos aguardando:");
                        fila.forEach(System.out::println);
                    }
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }
}
