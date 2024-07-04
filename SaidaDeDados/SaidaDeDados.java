package SaidaDeDados;
import java.util.Scanner;

public class SaidaDeDados {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome: ");
        String nome = teclado.nextLine();

        System.out.print("Digite a nota: ");
        float nota = teclado.nextFloat();

        System.out.println(String.format("A nota de %s é %.2f", nome, nota));

        teclado.close();
    }
}
