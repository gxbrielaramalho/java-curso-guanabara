package OperadoresRelacionais;

public class operadoresRelacionais {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Igual a
        boolean isEqual = (a == b);
        System.out.println(a + " == " + b + " : " + isEqual);

        // Diferente de
        boolean isNotEqual = (a != b);
        System.out.println(a + " != " + b + " : " + isNotEqual);

        // Maior que
        boolean isGreater = (a > b);
        System.out.println(a + " > " + b + " : " + isGreater);

        // Menor que
        boolean isLess = (a < b);
        System.out.println(a + " < " + b + " : " + isLess);

        // Maior ou igual a
        boolean isGreaterOrEqual = (a >= b);
        System.out.println(a + " >= " + b + " : " + isGreaterOrEqual);

        // Menor ou igual a
        boolean isLessOrEqual = (a <= b);
        System.out.println(a + " <= " + b + " : " + isLessOrEqual);

        // Outro exemplo com strings
        String str1 = "Hello";
        String str2 = "World";
        boolean areStringsEqual = str1.equals(str2);
        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\" : " + areStringsEqual);
    }
}
