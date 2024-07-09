package OperadoresTernarios;

 // variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso;

public class operadoresTernarios {
    public static void main(String[] args) {
        int numero = 10;

        // Usando operador ternário para verificar se o número é par ou ímpar
        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número " + numero + " é " + resultado);

        // Outro exemplo: verificando se um número é positivo, negativo ou zero
        int numero2 = -5;
        String tipoNumero = (numero2 > 0) ? "Positivo" : (numero2 < 0) ? "Negativo" : "Zero";

        System.out.println("O número " + numero2 + " é " + tipoNumero);
    }
}
