Main

    public class Main {
        public static void main(String[] args) {
            new MainFrame();
        }
    }

MainFrame

    import javax.swing.*;
    import java.awt.*;
    
    public class MainFrame extends JFrame {
        public MainFrame() {
            setTitle("Janela com Botão Centralizado e Responsivo");
            setSize(720, 480);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
            // Cria um painel para conter o botão
            JPanel buttonPanel = new JPanel(new GridBagLayout());
    
            // Adiciona o botão ao painel
            JButton button = new JButton("Clique Aqui!");
            button.setPreferredSize(new Dimension(200, 50)); // Define o tamanho do botão
    
            // Adiciona o botão ao painel usando GridBagLayout para centralizá-lo
            GridBagConstraints gbc = new GridBagConstraints();
            gbc.gridx = 0;
            gbc.gridy = 0;
            gbc.weightx = 1;
            gbc.weighty = 1;
            gbc.anchor = GridBagConstraints.CENTER;
            buttonPanel.add(button, gbc);
    
            // Adiciona o painel do botão ao centro da janela
            add(buttonPanel, BorderLayout.CENTER);
        }
    
        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    MainFrame frame = new MainFrame();
                    frame.setLocationRelativeTo(null); // Centraliza a janela na tela
                    frame.setVisible(true);
                }
            });
        }
    }
