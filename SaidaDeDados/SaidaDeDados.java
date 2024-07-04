package SaidaDeDados;
import java.util.Scanner;

public class SaidaDeDados {
    public static void main (String [] args) {
        Scanner teclado = new Scanner(System.in);

        // byte
        System.out.print("Digite um valor byte: ");
        byte valorByte = teclado.nextByte();

        // short
        System.out.print("Digite um valor short: ");
        short valorShort = teclado.nextShort();

        // int
        System.out.print("Digite um valor int: ");
        int valorInt = teclado.nextInt();

        // long
        System.out.print("Digite um valor long: ");
        long valorLong = teclado.nextLong();

        // float
        System.out.print("Digite um valor float: ");
        float valorFloat = teclado.nextFloat();

        // double
        System.out.print("Digite um valor double: ");
        double valorDouble = teclado.nextDouble();

        // char
        System.out.print("Digite um valor char: ");
        char valorChar = teclado.next().charAt(0);

        // boolean
        System.out.print("Digite um valor boolean (true/false): ");
        boolean valorBoolean = teclado.nextBoolean();
        
        // Limpar o buffer do teclado
        teclado.nextLine();  // Adicionada esta linha para limpar o buffer do teclado

        // String
        System.out.print("Digite uma string: ");
        String valorString = teclado.nextLine();

        // Fechar o scanner
        teclado.close();

        // Impressão dos valores
        System.out.println("Valores digitados:");
        System.out.println("byte: " + valorByte);
        System.out.println("short: " + valorShort);
        System.out.println("int: " + valorInt);
        System.out.println("long: " + valorLong);
        System.out.println("float: " + valorFloat);
        System.out.println("double: " + valorDouble);
        System.out.println("char: " + valorChar);
        System.out.println("boolean: " + valorBoolean);
        System.out.println("string: " + valorString);
    }
}
