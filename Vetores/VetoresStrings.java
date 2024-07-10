package Vetores;

public class VetoresStrings {
    public static void main(String[] args) {
        // Declaração e inicialização de um vetor de strings
        String[] frutas = {"Maçã", "Banana", "Laranja", "Uva", "Pêra"};

        // Acessando e imprimindo os valores dos elementos do vetor
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("Fruta na posição " + i + ": " + frutas[i]);
        }
    }
}
