Main

    public class Main {
        public static void main(String[] args) {
            new Screen();
        }
    }

Screen

    import javax.swing.*;
    import java.awt.event.ActionEvent;
    
    public class Screen extends JFrame {
    
        JTextField num1;
        JTextField num2;
    
        public Screen() {
    
    
            setSize(800,500);
            setTitle("Titulo");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setResizable(false);
            setLocationRelativeTo(null);
            setLayout(null);
    
            JButton jButton = new JButton("Clique aqui");
            jButton.setBounds(100,200,250,70);
    
            add(jButton);
    
            jButton.addActionListener(this::enviar);
    
    
            num1 = new JTextField();
            num1.setBounds(100,100,100,100);
            add(num1);
    
            num2 = new JTextField();
            num2.setBounds(100,300,100,100);
            add(num2);
    
            setVisible(true);
        }
    
        private void enviar(ActionEvent actionEvent) {
    
            Integer numero1 = Integer.parseInt(num1.getText());
            Integer numero2 = Integer.parseInt(num2.getText());
    
            int soma = numero1 + numero2;
    
            JOptionPane.showMessageDialog(null,"A soma é: "+soma,"Titulo",JOptionPane.ERROR_MESSAGE);
        }
    }
