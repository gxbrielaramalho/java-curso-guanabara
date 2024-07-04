package SomaSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SomaValoresGUI {
    public static void main(String[] args) {
        // Definir o look and feel do sistema
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Cria a janela
        JFrame frame = new JFrame("Soma de Valores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Cria o painel
        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(new Color(0xFFFFFF)); // Cor de fundo do painel (branco)
        frame.add(panel);
        placeComponents(panel);

        // Define a janela como visível
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // Definindo a paleta de cores
        Color primaryColor = new Color(0x6200EE);   // Cor primária (roxo)
        Color primaryLightColor = new Color(0xBB86FC); // Cor primária clara (lavanda)
        Color primaryDarkColor = new Color(0x3700B3); // Cor primária escura (roxo escuro)
        Color secondaryColor = new Color(0x03DAC6);  // Cor secundária (ciano)
        Color textColor = new Color(0x000000);       // Cor do texto (preto)
        Color backgroundColor = new Color(0xFFFFFF); // Cor de fundo (branco)

        // Cria o JLabel e JTextField para o primeiro valor
        JLabel label1 = new JLabel("Primeiro valor:");
        label1.setBounds(50, 30, 120, 25);
        label1.setFont(new Font("Arial", Font.PLAIN, 14));
        label1.setForeground(textColor); // Definir cor do texto do JLabel
        panel.add(label1);

        JTextField textField1 = new JTextField(20);
        textField1.setBounds(180, 30, 150, 25);
        textField1.setFont(new Font("Arial", Font.PLAIN, 14));
        textField1.setBackground(primaryLightColor); // Definir cor de fundo do JTextField
        textField1.setForeground(textColor); // Definir cor do texto do JTextField
        panel.add(textField1);

        // Cria o JLabel e JTextField para o segundo valor
        JLabel label2 = new JLabel("Segundo valor:");
        label2.setBounds(50, 70, 120, 25);
        label2.setFont(new Font("Arial", Font.PLAIN, 14));
        label2.setForeground(textColor); // Definir cor do texto do JLabel
        panel.add(label2);

        JTextField textField2 = new JTextField(20);
        textField2.setBounds(180, 70, 150, 25);
        textField2.setFont(new Font("Arial", Font.PLAIN, 14));
        textField2.setBackground(primaryLightColor); // Definir cor de fundo do JTextField
        textField2.setForeground(textColor); // Definir cor do texto do JTextField
        panel.add(textField2);

        // Cria o botão para calcular a soma
        JButton calcularButton = new JButton("Calcular");
        calcularButton.setBounds(50, 110, 280, 35);
        calcularButton.setFont(new Font("Arial", Font.BOLD, 16));
        calcularButton.setBackground(primaryColor); // Definir cor de fundo do JButton
        calcularButton.setForeground(textColor); // Definir cor do texto do JButton (preto)
        panel.add(calcularButton);

        // Cria o JLabel para exibir a soma
        JLabel resultLabel = new JLabel("A soma é: ");
        resultLabel.setBounds(50, 160, 280, 25);
        resultLabel.setFont(new Font("Arial", Font.BOLD, 16));
        resultLabel.setForeground(textColor); // Definir cor do texto do JLabel
        resultLabel.setHorizontalAlignment(SwingConstants.CENTER); // Centralizar o texto
        panel.add(resultLabel);

        // Adiciona o ActionListener ao botão
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int valor1 = Integer.parseInt(textField1.getText());
                    int valor2 = Integer.parseInt(textField2.getText());
                    int soma = valor1 + valor2;
                    resultLabel.setText("A soma é: " + soma);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Por favor, insira números válidos.");
                }
            }
        });
    }
}
