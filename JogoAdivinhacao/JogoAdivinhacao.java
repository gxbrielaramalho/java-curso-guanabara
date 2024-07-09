package JogoAdivinhacao;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class JogoAdivinhacao extends JFrame {
    private JTextField txtTentativa;
    private JButton btnTentar;
    private JLabel lblResultado;
    private int numeroSecreto;
    private int tentativas;

    public JogoAdivinhacao() {
        setTitle("Jogo de Adivinhação");
        setSize(300, 200); // Tamanho inicial da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centraliza a janela na tela

        // Gerar número secreto entre 0 e 99
        Random random = new Random();
        numeroSecreto = random.nextInt(100);
        tentativas = 0;

        // Painel principal com BorderLayout
        JPanel panel = new JPanel(new BorderLayout(10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        // Componentes
        JLabel lblInstrucao = new JLabel("Tente adivinhar o número secreto (00-99):");
        txtTentativa = new JTextField(10);
        btnTentar = new JButton("Tentar");
        lblResultado = new JLabel("");

        // Ação do botão Tentar
        btnTentar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                verificarAdivinhacao();
            }
        });

        // Painel para os componentes centrais
        JPanel centerPanel = new JPanel(new FlowLayout());
        centerPanel.add(lblInstrucao);
        centerPanel.add(txtTentativa);
        centerPanel.add(btnTentar);

        // Adicionar componentes ao painel principal
        panel.add(centerPanel, BorderLayout.CENTER);
        panel.add(lblResultado, BorderLayout.SOUTH);

        // Adicionar painel ao JFrame
        add(panel);

        // Ajustar o tamanho da janela para caber todos os componentes
        pack();

        // Exibir JFrame
        setVisible(true);
    }

    private void verificarAdivinhacao() {
        try {
            int tentativa = Integer.parseInt(txtTentativa.getText());
            tentativas++;

            if (tentativa < 0 || tentativa > 99) {
                lblResultado.setText("Por favor, insira um número entre 00 e 99.");
            } else if (tentativa < numeroSecreto) {
                lblResultado.setText("O número secreto é maior.");
            } else if (tentativa > numeroSecreto) {
                lblResultado.setText("O número secreto é menor.");
            } else {
                lblResultado.setText("Parabéns! Você acertou o número secreto em " + tentativas + " tentativas.");
                btnTentar.setEnabled(false); // Desabilita o botão após acertar
            }
        } catch (NumberFormatException ex) {
            lblResultado.setText("Por favor, insira um número válido.");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JogoAdivinhacao();
            }
        });
    }
}
