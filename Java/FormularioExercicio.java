import javax.swing.*;
import java.awt.*;

public class FormularioExercicio extends JFrame{
    private JPanel fundo;
    private JLabel cpf;
    private JLabel rg;
    private JLabel nome;
    private JLabel logradouro;
    private JLabel endereco;
    private JTextField txtCpf;
    private JTextField txtRg;
    private JTextField txtNome;
    private JTextField txtLogradouro;
    private JTextField txtEndereco;
    private JButton btnGravar;
    private JButton btnCancelar;


    public FormularioExercicio(){
        components();
    }

    public void components(){
        setSize(500, 350);
        setResizable(false);
        setTitle("Formulário");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        fundo = new JPanel();
        fundo.setBounds(getContentPane().getBounds());
        fundo.setBackground(Color.white);
        fundo.setLayout(null);

        cpf = new JLabel("CPF");
        cpf.setBounds(20, 20, 30,30);


        rg = new JLabel("RG");
        rg.setBounds(220, 20, 30,30);

        nome = new JLabel("NOME");
        nome.setBounds(20, 60, 50, 30);

        logradouro = new JLabel("LOGRADOURO");
        logradouro.setBounds(20, 100,110,30);

        endereco = new JLabel("ENDEREÇO");
        endereco.setBounds(220, 100, 90,30);

        JLabel[] labels = new JLabel[]{cpf, rg, nome, endereco, logradouro};

        for(JLabel texto : labels){
            texto.setForeground(Color.BLACK);
            texto.setFont(new Font("Arial", Font.BOLD, 14));
            fundo.add(texto);
        }

        txtNome = new JTextField();
        txtNome.setBounds(70,60,380,25);

        txtCpf = new JTextField();
        txtCpf.setBounds(60,20,150,25);

        txtEndereco = new JTextField();
        txtEndereco.setBounds(305,100,145,25);

        txtLogradouro = new JTextField();
        txtLogradouro.setBounds(125,100,85,25);

        txtRg = new JTextField();
        txtRg.setBounds(250,20,200,25);

        JTextField[] inputs = new JTextField[]{txtRg, txtLogradouro, txtEndereco, txtCpf, txtNome};

        for(JTextField input : inputs){
            input.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));
            input.setFont(new Font("Arial", Font.PLAIN, 14));
            fundo.add(input);
        }

        getContentPane().add(fundo);

        setVisible(true);
    }

    public static void main(String[] args) {
        new FormularioExercicio();
    }
}
