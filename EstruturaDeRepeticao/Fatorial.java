package EstruturaDeRepeticao;

public class Fatorial {
    public static void main(String[] args) {
        int numero = 5; // Número para calcular o fatorial
        int fatorial = 1;

        // Calculando o fatorial usando um loop for
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);
    }
}
