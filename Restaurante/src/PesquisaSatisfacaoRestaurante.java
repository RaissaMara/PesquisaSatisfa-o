
import java.util.Scanner;

public class PesquisaSatisfacaoRestaurante {
	// Dupla: Wendell Alcântara e Raíssa Mara
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] classificacoes = new int[10];
        
        // Solicitar classificações de satisfação dos clientes
        System.out.println("Por favor, forneça as classificações de satisfação dos 10 clientes (de 1 a 5):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Cliente " + (i + 1) + ": ");
            classificacoes[i] = scanner.nextInt();
        }
        
        // Calcular média das classificações
        double media = calcularMedia(classificacoes);
        
        // Exibir resumo dos resultados
        System.out.println("\nResumo dos Resultados:");
        System.out.println("Média das classificações: " + media);
        
        // Contar e exibir o número de classificações para cada estrela
        for (int i = 1; i <= 5; i++) {
            int count = contarClassificacoes(classificacoes, i);
            System.out.println(i + " estrela: " + count);
        }
        
        scanner.close();
    }
    
    // Método para calcular a média das classificações
    public static double calcularMedia(int[] classificacoes) {
        int soma = 0;
        for (int i = 0; i < classificacoes.length; i++) {
            soma += classificacoes[i];
        }
        return (double) soma / classificacoes.length;
    }
    
    // Método para contar quantas classificações correspondem a uma determinada estrela
    public static int contarClassificacoes(int[] classificacoes, int estrela) {
        int count = 0;
        for (int i = 0; i < classificacoes.length; i++) {
            if (classificacoes[i] == estrela) {
                count++;
            }
        }
        return count;
    }
}
