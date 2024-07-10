package AlgoritmoExemplo;

import java.util.Scanner;

public class AlgoritmoExemplo {
    public static void main(String[] args) {
        // Passo 1: Obtenção de entrada do usuário
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();
        
        // Passo 2: Inicialização da variável para armazenar o fatorial
        int fatorial = 1;

        // Passo 3: Cálculo do fatorial usando um loop for
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        // Passo 4: Saída do resultado
        System.out.println("O fatorial de " + numero + " é: " + fatorial);
        
        // Passo 5: Fechando o scanner
        scanner.close();
    }
}
