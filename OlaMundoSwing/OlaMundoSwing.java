package OlaMundoSwing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class OlaMundoSwing {

    // Método principal que inicia a aplicação
    public static void main(String[] args) {
        // Executa o código da interface gráfica na thread do Swing
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI(); // Cria e exibe a interface gráfica
            }
        });
    }

    // Método que cria e exibe a interface gráfica
    private static void createAndShowGUI() {
        // Cria um JFrame (janela)
        JFrame frame = new JFrame("Olá, Mundo Swing!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Define o comportamento de fechar a janela

        // Cria um JPanel (painel) para organizar os componentes
        JPanel panel = new JPanel();

        // Cria um JLabel (rótulo) com a mensagem
        JLabel label = new JLabel("Olá, Mundo!", JLabel.CENTER);

        // Cria um JButton (botão) com a mensagem "Clique Aqui"
        JButton button = new JButton("Clique Aqui");

        // Adiciona um ActionListener ao botão para tratar o clique
        button.addActionListener(e -> {
            // Mostra um diálogo com uma mensagem quando o botão é clicado
            JOptionPane.showMessageDialog(frame, "Você clicou no botão!");
        });

        // Adiciona o JLabel e o JButton ao painel
        panel.add(label);
        panel.add(button);

        // Adiciona o painel ao JFrame
        frame.getContentPane().add(panel);

        // Define o tamanho da janela
        frame.setSize(300, 200);

        // Centraliza a janela na tela
        frame.setLocationRelativeTo(null);

        // Torna a janela visível
        frame.setVisible(true);
    }
}
