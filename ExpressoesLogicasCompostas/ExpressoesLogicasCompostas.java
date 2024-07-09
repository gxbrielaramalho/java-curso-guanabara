package ExpressoesLogicasCompostas;

public class ExpressoesLogicasCompostas {
    public static void main(String[] args) {
        int idade = 25;
        boolean temCarteiraDeMotorista = true;
        boolean temAntecedentesCriminais = false;

        // Verificação composta: pode alugar um carro?
        boolean podeAlugarCarro = (idade >= 21 && temCarteiraDeMotorista && !temAntecedentesCriminais);
        System.out.println("Pode alugar um carro? " + podeAlugarCarro);

        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 9.0;
        double media = (nota1 + nota2 + nota3) / 3;

        // Verificação composta: aluno passou de ano?
        boolean passouDeAno = (media >= 7.0 && nota1 >= 5.0 && nota2 >= 5.0 && nota3 >= 5.0);
        System.out.println("Passou de ano? " + passouDeAno);

        int temperatura = 30;
        boolean isChovendo = false;

        // Verificação composta: é um bom dia para um piquenique?
        boolean bomParaPiquenique = (temperatura >= 20 && temperatura <= 30 && !isChovendo);
        System.out.println("Bom para piquenique? " + bomParaPiquenique);

        boolean temIngresso = true;
        boolean amigoVaiAoShow = false;

        // Verificação composta: vai ao show?
        boolean vaiAoShow = (temIngresso && (amigoVaiAoShow || idade >= 18));
        System.out.println("Vai ao show? " + vaiAoShow);

        // Verificação composta complexa
        boolean condicaoComplexa = (idade > 18 && (media >= 8.0 || (nota1 > 6.0 && nota2 > 6.0 && nota3 > 6.0)) && (temCarteiraDeMotorista || podeAlugarCarro));
        System.out.println("Condição complexa satisfeita? " + condicaoComplexa);
    }
}
