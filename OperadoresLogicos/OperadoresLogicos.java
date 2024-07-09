package OperadoresLogicos;

public class OperadoresLogicos {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;

        // E lógico (AND)
        boolean andResult = a && b;
        System.out.println(a + " && " + b + " : " + andResult);

        // OU lógico (OR)
        boolean orResult = a || b;
        System.out.println(a + " || " + b + " : " + orResult);

        // NÃO lógico (NOT)
        boolean notA = !a;
        System.out.println("!" + a + " : " + notA);

        boolean notB = !b;
        System.out.println("!" + b + " : " + notB);

        // Combinando operadores lógicos
        boolean complexExpression = (a || b) && !b;
        System.out.println("(" + a + " || " + b + ") && !" + b + " : " + complexExpression);

        // Exemplo prático: verificação de idade e país
        int idade = 25;
        String pais = "Brasil";

        boolean podeVotar = (idade >= 18) && pais.equals("Brasil");
        System.out.println("Pode votar? " + podeVotar);

        // Exemplo prático: verificação de acesso a um sistema
        boolean temUsuarioValido = true;
        boolean temSenhaValida = false;
        boolean acessoPermitido = temUsuarioValido && temSenhaValida;
        System.out.println("Acesso permitido? " + acessoPermitido);
    }
}
