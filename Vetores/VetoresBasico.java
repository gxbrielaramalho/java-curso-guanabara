package Vetores;

public class VetoresBasico {
    public static void main(String[] args) {
        // Declaração e inicialização de um vetor de inteiros com 5 elementos
        int[] numeros = new int[5];

        // Atribuindo valores aos elementos do vetor
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Acessando e imprimindo os valores dos elementos do vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }
    }
}
