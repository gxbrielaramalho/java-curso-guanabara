package Operadores;

public class operadores {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = 5;
        
        // Adição
        int soma = a + b;
        System.out.println("A soma de " + a + " e " + b + " é " + soma);
        
        // Subtração
        int subtracao = a - b;
        System.out.println("A subtração de " + a + " e " + b + " é " + subtracao);
        
        // Multiplicação
        int multiplicacao = a * b;
        System.out.println("A multiplicação de " + a + " e " + b + " é " + multiplicacao);
        
        // Divisão
        int divisao = a / b;
        System.out.println("A divisão de " + a + " por " + b + " é " + divisao);
        
        // Módulo (Resto da divisão)
        int modulo = a % b;
        System.out.println("O módulo de " + a + " por " + b + " é " + modulo);
        
        // Incremento
        int incremento = ++a; // Pré-incremento
        System.out.println("Pré-incremento de a é " + incremento);
        
        a = 10; // Resetando o valor de a para 10
        incremento = a++; // Pós-incremento
        System.out.println("Pós-incremento de a é " + incremento + " (a agora é " + a + ")");
        
        // Decremento
        int decremento = --b; // Pré-decremento
        System.out.println("Pré-decremento de b é " + decremento);
        
        b = 5; // Resetando o valor de b para 5
        decremento = b--; // Pós-decremento
        System.out.println("Pós-decremento de b é " + decremento + " (b agora é " + b + ")");
    }
}

