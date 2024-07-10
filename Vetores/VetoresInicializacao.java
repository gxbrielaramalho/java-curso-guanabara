package Vetores;

public class VetoresInicializacao {
    public static void main(String[] args) {
        // Inicialização direta de um vetor
        int[] numeros = {10, 20, 30, 40, 50};

        // Acessando e imprimindo os valores dos elementos do vetor
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento na posição " + i + ": " + numeros[i]);
        }
    }
}
