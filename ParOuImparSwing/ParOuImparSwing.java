package ParOuImparSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ParOuImparSwing extends JFrame {
    private JLabel lblNumero;
    private JTextField txtNumero;
    private JButton btnVerificar;
    private JLabel lblResultado;

    public ParOuImparSwing() {
        setTitle("Verificador de Par ou Ímpar");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Painel principal com GridLayout
        JPanel panel = new JPanel(new GridLayout(3, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Componentes
        lblNumero = new JLabel("Digite um número:");
        txtNumero = new JTextField(10);
        btnVerificar = new JButton("Verificar");
        lblResultado = new JLabel();

        // Ação do botão Verificar
        btnVerificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarParOuImpar();
            }
        });

        // Adicionar componentes ao painel
        panel.add(lblNumero);
        panel.add(txtNumero);
        panel.add(btnVerificar);
        panel.add(lblResultado);

        // Adicionar painel ao JFrame
        add(panel);

        // Exibir JFrame
        setVisible(true);
    }

    private void verificarParOuImpar() {
        try {
            int numero = Integer.parseInt(txtNumero.getText());

            if (numero % 2 == 0) {
                lblResultado.setText(numero + " é um número par.");
            } else {
                lblResultado.setText(numero + " é um número ímpar.");
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Por favor, insira um número válido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ParOuImparSwing();
            }
        });
    }
}
