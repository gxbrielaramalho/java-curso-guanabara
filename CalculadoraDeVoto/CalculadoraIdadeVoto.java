package CalculadoraDeVoto;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class CalculadoraIdadeVoto extends JFrame {
    private JLabel lblTitulo;
    private JLabel lblDataNascimento;
    private JTextField txtAno;
    private JTextField txtMes;
    private JTextField txtDia;
    private JButton btnCalcular;
    private JLabel lblResultado;

    public CalculadoraIdadeVoto() {
        setTitle("Calculadora de Idade e Voto");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 250);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Painel principal com BorderLayout para organizar os componentes
        JPanel panel = new JPanel(new BorderLayout());
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Título da aplicação
        lblTitulo = new JLabel("Verificação de Idade para Votação", JLabel.CENTER);
        lblTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        panel.add(lblTitulo, BorderLayout.NORTH);

        // Painel para entrada de data de nascimento
        JPanel inputPanel = new JPanel(new FlowLayout());
        lblDataNascimento = new JLabel("Digite sua data de nascimento (DD/MM/YYYY): ");
        txtDia = new JTextField(2);
        txtMes = new JTextField(2);
        txtAno = new JTextField(4);
        inputPanel.add(lblDataNascimento);
        inputPanel.add(txtDia);
        inputPanel.add(new JLabel("/"));
        inputPanel.add(txtMes);
        inputPanel.add(new JLabel("/"));
        inputPanel.add(txtAno);

        // Botão para calcular
        btnCalcular = new JButton("Calcular");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calcularIdadeEVoto();
            }
        });
        inputPanel.add(btnCalcular);

        // Adiciona o painel de entrada ao centro
        panel.add(inputPanel, BorderLayout.CENTER);

        // Rótulo para exibir o resultado
        lblResultado = new JLabel("", JLabel.CENTER);
        lblResultado.setFont(new Font("Arial", Font.PLAIN, 16));
        panel.add(lblResultado, BorderLayout.SOUTH);

        // Adiciona o painel principal ao JFrame
        add(panel);

        // Exibe o JFrame
        setVisible(true);
    }

    private void calcularIdadeEVoto() {
        try {
            // Obtém os valores digitados
            int dia = Integer.parseInt(txtDia.getText());
            int mes = Integer.parseInt(txtMes.getText());
            int ano = Integer.parseInt(txtAno.getText());

            // Verifica se a data é válida
            if (isDataValida(dia, mes, ano)) {
                // Calcula a idade atual
                LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
                LocalDate hoje = LocalDate.now();
                int idade = hoje.getYear() - dataNascimento.getYear();

                // Verifica se pode votar (idade mínima no Brasil é 16 anos)
                String resultado;
                if (idade >= 16) {
                    resultado = "Você tem " + idade + " anos e pode votar!";
                    lblResultado.setForeground(Color.GREEN);
                } else {
                    resultado = "Você tem " + idade + " anos e ainda não pode votar.";
                    lblResultado.setForeground(Color.RED);
                }

                // Exibe o resultado
                lblResultado.setText(resultado);
            } else {
                lblResultado.setText("Data inválida. Por favor, insira uma data correta (DD/MM/YYYY).");
                lblResultado.setForeground(Color.BLACK);
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Por favor, insira apenas números para a data de nascimento.");
            lblResultado.setForeground(Color.BLACK);
        }
    }

    private boolean isDataValida(int dia, int mes, int ano) {
        try {
            LocalDate.of(ano, mes, dia);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CalculadoraIdadeVoto();
            }
        });
    }
}
