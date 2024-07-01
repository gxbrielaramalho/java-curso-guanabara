package OlaMundoJavaFx;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class OlaMundoJavaFx {

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

        // Cria um JPanel (painel) para conter os componentes
        JPanel panel = new JPanel();

        // Cria um JLabel (rótulo) com a mensagem
        JLabel label = new JLabel("Olá, Mundo!", JLabel.CENTER);

        // Cria um JButton (botão) com o texto "Clique aqui"
        JButton button = new JButton("Clique aqui");

        // Adiciona um evento de clique ao botão
        button.addActionListener(e -> {
            // Ação que será executada quando o botão for clicado
            label.setText("Botão clicado!");
        });

        // Adiciona o JLabel e o JButton ao JPanel
        panel.add(label);
        panel.add(button);

        // Adiciona o JPanel ao JFrame
        frame.getContentPane().add(panel);

        // Define o tamanho da janela
        frame.setSize(300, 200);

        // Centraliza a janela na tela
        frame.setLocationRelativeTo(null);

        // Torna a janela visível
        frame.setVisible(true);
    }
}
