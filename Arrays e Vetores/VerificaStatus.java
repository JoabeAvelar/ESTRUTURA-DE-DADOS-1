public class VerificaStatus {
    public static void main(String[] args) {
        // Declara o vetor de booleanos com 3 posições
        boolean[] status = new boolean[3];

        // Atribui os valores
        status[0] = true;
        status[1] = false;
        status[2] = true;

        // Verifica a primeira posição
        if (status[0]) {
            System.out.println("O primeiro status está ativo.");
        } else {
            System.out.println("O primeiro status está inativo.");
        }
    }
}
