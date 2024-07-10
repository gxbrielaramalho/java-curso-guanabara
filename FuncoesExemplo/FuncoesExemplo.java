package FuncoesExemplo;

public class FuncoesExemplo {

    // Função para calcular a soma de dois números
    public static int calcularSoma(int a, int b) {
        return a + b;
    }

    // Função para calcular a subtração de dois números
    public static int calcularSubtracao(int a, int b) {
        return a - b;
    }

    // Função para calcular a multiplicação de dois números
    public static int calcularMultiplicacao(int a, int b) {
        return a * b;
    }

    // Função para calcular a divisão de dois números
    public static double calcularDivisao(int a, int b) {
        if (b != 0) {
            return (double) a / b;
        } else {
            System.out.println("Divisão por zero não é permitida.");
            return 0;
        }
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        System.out.println("Soma: " + calcularSoma(num1, num2));
        System.out.println("Subtração: " + calcularSubtracao(num1, num2));
        System.out.println("Multiplicação: " + calcularMultiplicacao(num1, num2));
        System.out.println("Divisão: " + calcularDivisao(num1, num2));
    }
}

