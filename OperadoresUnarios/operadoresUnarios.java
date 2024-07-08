package OperadoresUnarios;

public class operadoresUnarios {
    public static void main(String[] args) {
        // Declaração de variáveis
        int a = 10;
        int b = -a; // Operador de negação
        int c = +a; // Operador de identidade (não altera o valor)
        
        // Operador de negação
        System.out.println("O valor de a é " + a);
        System.out.println("A negação de a é " + b);
        
        // Operador de identidade
        System.out.println("A identidade de a é " + c);
        
        // Incremento e Decremento
        int d = 5;
        
        // Pré-incremento
        int preIncremento = ++d;
        System.out.println("Pré-incremento de d é " + preIncremento + " (d agora é " + d + ")");
        
        d = 5; // Resetando o valor de d para 5
        // Pós-incremento
        int posIncremento = d++;
        System.out.println("Pós-incremento de d é " + posIncremento + " (d agora é " + d + ")");
        
        // Pré-decremento
        int preDecremento = --d;
        System.out.println("Pré-decremento de d é " + preDecremento + " (d agora é " + d + ")");
        
        d = 5; // Resetando o valor de d para 5
        // Pós-decremento
        int posDecremento = d--;
        System.out.println("Pós-decremento de d é " + posDecremento + " (d agora é " + d + ")");
        
        // Operador lógico de negação
        boolean e = true;
        boolean f = !e;
        System.out.println("O valor de e é " + e);
        System.out.println("A negação lógica de e é " + f);
    }
}
