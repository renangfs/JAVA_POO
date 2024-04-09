import javax.swing.*; // Importa as classes necessárias para criar uma interface gráfica Swing
import java.awt.*; // Importa as classes necessárias para a manipulação de componentes gráficos
import java.awt.event.ActionEvent; // Importa a classe necessária para lidar com eventos de ação
import java.awt.event.ActionListener; // Importa a classe necessária para ouvir eventos de ação
import java.util.ArrayList; // Importa a classe necessária para usar ArrayList
import java.util.List; // Importa a classe necessária para usar List

public class CadastroFuncionarios extends JFrame { // Define uma classe chamada CadastroFuncionarios que estende JFrame (janela)
    private JTextField modeloField, marcaField, cavalosField, anoField; // Declara campos de texto para entrada de dados
    private JButton cadastrarButton, listarButton; // Declara botões
    private JTextArea outputArea; // Declara uma área de texto para exibir saída
    private List<Funcionario> carros; // Declara uma lista de objetos do tipo Funcionario

    public CadastroFuncionarios() { // Construtor da classe
        // Inicializa a lista de carros
        carros = new ArrayList<>();
        // Inicializa os campos de texto e botões
        modeloField = new JTextField(20);
        marcaField = new JTextField(20);
        cavalosField = new JTextField(20);
        anoField = new JTextField(20);
        cadastrarButton = new JButton("Cadastrar");
        listarButton = new JButton("Listar");
        outputArea = new JTextArea(10, 40);
        outputArea.setEditable(false);
        // Cria um painel para os campos de entrada
        JPanel inputPanel = new JPanel(new GridLayout(5, 2));
        // Adiciona rótulos e campos de texto ao painel de entrada
        inputPanel.add(new JLabel("ID Funcionario:"));
        inputPanel.add(modeloField);
        inputPanel.add(new JLabel("Nome:"));
        inputPanel.add(marcaField);
        inputPanel.add(new JLabel("CPF:"));
        inputPanel.add(cavalosField);
        inputPanel.add(new JLabel("E-mail:"));
        inputPanel.add(anoField);
        inputPanel.add(cadastrarButton);
        inputPanel.add(listarButton);
        // Cria um painel para a saída
        JPanel outputPanel = new JPanel();
        // Adiciona um rótulo e uma área de texto de rolagem ao painel de saída
        outputPanel.add(new JLabel("Funcionarios cadastrados:"));
        outputPanel.add(new JScrollPane(outputArea));
        // Adiciona os painéis à janela
        add(inputPanel, BorderLayout.NORTH);
        add(outputPanel, BorderLayout.CENTER);
        // Adiciona ouvintes de ação aos botões
        cadastrarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cadastrarCarro();
            }
        });
        listarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                listarCarros();
            }
        });
        // Configurações da janela
        setTitle("Cadastro de Funcionario");
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void cadastrarCarro() { // Método para cadastrar um funcionário
        // Obtém os dados dos campos de texto
        String IDFUNCIONARIO = modeloField.getText();
        String nome = marcaField.getText();
        String CPF = cavalosField.getText();
        String Email = anoField.getText();
        // Cria um objeto Funcionario com os dados fornecidos
        Funcionario carro = new Funcionario(IDFUNCIONARIO, nome, CPF, Email);
        // Adiciona o funcionário à lista de funcionários
        carros.add(carro);
        // Exibe os detalhes do funcionário na área de texto
        outputArea.append(carro.toString() + "\n");
        // Limpa os campos de texto após o cadastro
        modeloField.setText("");
        marcaField.setText("");
        cavalosField.setText("");
        anoField.setText("");
    }

    private void listarCarros() { // Método para listar todos os funcionários cadastrados
        // Limpa a área de texto
        outputArea.setText("");
        // Percorre a lista de funcionários e exibe seus detalhes na área de texto
        for (Funcionario carro : carros) {
            outputArea.append(carro.toString() + "\n");
        }
    }

    public static void main(String[] args) { // Método principal
        SwingUtilities.invokeLater(new Runnable() { // Inicia a aplicação Swing na thread de despacho de eventos
            public void run() {
                new CadastroFuncionarios(); // Cria uma instância da classe CadastroFuncionarios
            }
        });
    }
}

class Funcionario { // Classe Funcionario
    private String IDFUNCIONARIO; // Atributo para o ID do funcionário
    private String NOME; // Atributo para o nome do funcionário
    private String CPF; // Atributo para o CPF do funcionário
    private String EMAIL; // Atributo para o e-mail do funcionário

    public Funcionario(String modelo, String marca, String cavalos, String ano) { // Construtor da classe Funcionario
        // Inicializa os atributos com os valores fornecidos
        this.IDFUNCIONARIO = modelo;
        this.NOME = marca;
        this.CPF = cavalos;
        this.EMAIL = ano;
    }

    @Override
    public String toString() { // Método para representar o objeto como uma String
        // Retorna uma string formatada com os detalhes do funcionário
        return "ID do funcionario:" + IDFUNCIONARIO + ", Nome: " + NOME + ", CPF: " + CPF + ", E-mail: " + EMAIL;
    }
}
