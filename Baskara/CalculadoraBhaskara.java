package Baskara;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraBhaskara extends JFrame {
    private JLabel lblFormula;
    private JTextField txtA, txtB, txtC;
    private JButton btnCalcular;
    private JLabel lblResultado;

    public CalculadoraBhaskara() {
        setTitle("Calculadora de Bhaskara");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null);

        // Painel principal com BorderLayout para centralizar
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Rótulo para a fórmula de Bhaskara
        lblFormula = new JLabel("<html>Fórmula: <font color='red'>ax²</font> + <font color='red'>bx</font> + <font color='red'>c</font> = 0</html>", JLabel.CENTER);
        panel.add(lblFormula, BorderLayout.NORTH);

        // Painel para os campos de entrada de A, B e C
        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("a:"));
        txtA = new JTextField(5);
        inputPanel.add(txtA);
        inputPanel.add(new JLabel("b:"));
        txtB = new JTextField(5);
        inputPanel.add(txtB);
        inputPanel.add(new JLabel("c:"));
        txtC = new JTextField(5);
        inputPanel.add(txtC);

        // Botão para calcular
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularBhaskara();
            }
        });
        inputPanel.add(btnCalcular);

        // Adiciona o painel de entrada abaixo da fórmula
        panel.add(inputPanel, BorderLayout.CENTER);

        // Rótulo para exibir o resultado
        lblResultado = new JLabel("", JLabel.CENTER);
        panel.add(lblResultado, BorderLayout.SOUTH);

        // Adiciona o painel principal ao JFrame
        add(panel);

        // Exibe o JFrame
        setVisible(true);
    }

    private void calcularBhaskara() {
        try {
            double a = Double.parseDouble(txtA.getText());
            double b = Double.parseDouble(txtB.getText());
            double c = Double.parseDouble(txtC.getText());

            // Calcula delta
            double delta = b * b - 4 * a * c;

            if (delta < 0) {
                lblResultado.setText("Delta é negativo, não há raízes reais.");
            } else {
                // Calcula as raízes
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                // Exibe as raízes
                lblResultado.setText(String.format("Raízes: x1 = %.2f, x2 = %.2f", x1, x2));
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Por favor, insira valores válidos para A, B e C.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraBhaskara();
            }
        });
    }
}
