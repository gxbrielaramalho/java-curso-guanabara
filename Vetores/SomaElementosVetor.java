package Vetores;

public class SomaElementosVetor {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        // Somando todos os elementos do vetor
        for (int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("A soma de todos os elementos do vetor é: " + soma);
    }
}
