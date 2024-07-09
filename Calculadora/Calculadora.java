package Calculadora;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora {
    public static void main(String[] args) {
        // Criar a janela principal
        JFrame frame = new JFrame("Calculadora");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLayout(new GridBagLayout());

        // Configuração do GridBagConstraints
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        // Criar componentes da interface
        JLabel labelValor = new JLabel("Digite um valor:");
        JTextField campoValor = new JTextField();
        JLabel labelDivisor = new JLabel("Digite um divisor:");
        JTextField campoDivisor = new JTextField();
        JButton botaoCalcular = new JButton("Calcular");
        JTextArea areaResultado = new JTextArea(10, 30);
        areaResultado.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(areaResultado);

        // Adicionar componentes à janela
        gbc.gridx = 0;
        gbc.gridy = 0;
        frame.add(labelValor, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(campoValor, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(labelDivisor, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(campoDivisor, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        frame.add(botaoCalcular, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        frame.add(scrollPane, gbc);

        // Adicionar ação ao botão calcular
        botaoCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double valor = Double.parseDouble(campoValor.getText());
                    double divisor = Double.parseDouble(campoDivisor.getText());

                    // Calcular os valores solicitados
                    double restoDivisao = valor % divisor;
                    double elevadoAoCubo = Math.pow(valor, 3);
                    double raizQuadrada = Math.sqrt(valor);
                    double raizCubica = Math.cbrt(valor);
                    double valorAbsoluto = Math.abs(valor);

                    // Exibir os resultados
                    areaResultado.setText(
                        "Resto da divisão de " + valor + " por " + divisor + " é: " + restoDivisao + "\n" +
                        valor + " elevado ao cubo é: " + elevadoAoCubo + "\n" +
                        "Raiz quadrada de " + valor + " é: " + raizQuadrada + "\n" +
                        "Raiz cúbica de " + valor + " é: " + raizCubica + "\n" +
                        "Valor absoluto de " + valor + " é: " + valorAbsoluto
                    );
                } catch (NumberFormatException ex) {
                    areaResultado.setText("Por favor, insira valores numéricos válidos.");
                }
            }
        });

        // Tornar a janela do programa visível
        frame.setVisible(true);
    }
}
