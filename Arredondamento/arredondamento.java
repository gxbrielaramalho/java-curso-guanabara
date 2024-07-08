package Arredondamento;

public class arredondamento {
    public static void main(String[] args) {
        // Declaração de variáveis
        double num1 = 7.5;
        double num2 = 7.4;
        double num3 = -7.5;
        double num4 = -7.6;

        // Arredondamento para o inteiro mais próximo
        System.out.println("Arredondamento de " + num1 + " é " + Math.round(num1));
        System.out.println("Arredondamento de " + num2 + " é " + Math.round(num2));
        System.out.println("Arredondamento de " + num3 + " é " + Math.round(num3));
        System.out.println("Arredondamento de " + num4 + " é " + Math.round(num4));

        // Arredondamento para cima (ceil)
        System.out.println("Arredondamento para cima de " + num1 + " é " + Math.ceil(num1));
        System.out.println("Arredondamento para cima de " + num2 + " é " + Math.ceil(num2));
        System.out.println("Arredondamento para cima de " + num3 + " é " + Math.ceil(num3));
        System.out.println("Arredondamento para cima de " + num4 + " é " + Math.ceil(num4));

        // Arredondamento para baixo (floor)
        System.out.println("Arredondamento para baixo de " + num1 + " é " + Math.floor(num1));
        System.out.println("Arredondamento para baixo de " + num2 + " é " + Math.floor(num2));
        System.out.println("Arredondamento para baixo de " + num3 + " é " + Math.floor(num3));
        System.out.println("Arredondamento para baixo de " + num4 + " é " + Math.floor(num4));

        // Arredondamento com truncamento
        System.out.println("Truncamento de " + num1 + " é " + (int)num1);
        System.out.println("Truncamento de " + num2 + " é " + (int)num2);
        System.out.println("Truncamento de " + num3 + " é " + (int)num3);
        System.out.println("Truncamento de " + num4 + " é " + (int)num4);
    }
}
