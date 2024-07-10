package Vetores;

public class MaiorElementoVetor {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int maior = numeros[0];

        // Encontrando o maior elemento do vetor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("O maior elemento do vetor é: " + maior);
    }
}
