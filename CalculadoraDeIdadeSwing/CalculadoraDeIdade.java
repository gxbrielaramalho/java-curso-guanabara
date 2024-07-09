package CalculadoraDeIdadeSwing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class CalculadoraDeIdade extends JFrame {
    private JTextField txtDia;
    private JTextField txtMes;
    private JTextField txtAno;
    private JLabel lblResultado;

    public CalculadoraDeIdade() {
        setTitle("Calculadora de Idade");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);

        // Criação dos componentes
        JLabel lblDia = new JLabel("Dia:");
        JLabel lblMes = new JLabel("Mês:");
        JLabel lblAno = new JLabel("Ano:");

        txtDia = new JTextField(10);
        txtMes = new JTextField(10);
        txtAno = new JTextField(10);

        JButton btnCalcular = new JButton("Calcular Idade");
        lblResultado = new JLabel("Sua idade aparecerá aqui.");

        // Adicionando componentes ao painel central
        gbc.gridx = 0;
        gbc.gridy = 0;
        centralPanel.add(lblDia, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        centralPanel.add(txtDia, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        centralPanel.add(lblMes, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        centralPanel.add(txtMes, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        centralPanel.add(lblAno, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        centralPanel.add(txtAno, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        centralPanel.add(btnCalcular, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        centralPanel.add(lblResultado, gbc);

        add(centralPanel, BorderLayout.CENTER);

        // Ação do botão Calcular
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIdade();
            }
        });
    }

    private void calcularIdade() {
        try {
            int dia = Integer.parseInt(txtDia.getText());
            int mes = Integer.parseInt(txtMes.getText());
            int ano = Integer.parseInt(txtAno.getText());

            LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
            LocalDate dataAtual = LocalDate.now();

            Period periodo = Period.between(dataNascimento, dataAtual);
            int idade = periodo.getYears();

            lblResultado.setText("Sua idade é: " + idade + " anos.");
        } catch (NumberFormatException ex) {
            lblResultado.setText("Por favor, insira valores válidos.");
        } catch (Exception ex) {
            lblResultado.setText("Erro ao calcular a idade.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraDeIdade().setVisible(true);
            }
        });
    }
}
