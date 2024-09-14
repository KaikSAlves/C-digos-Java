import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.BorderUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.EventListener;

public class Formulario extends JFrame {
    private JPanel painel;
    private JLabel id;
    private JLabel nome;
    private JTextField textId;
    private JTextField textNome;
    private JButton cadastrar;
    private JButton excluir;
    private JButton limpar;


    public Formulario(){
        this.components();
    }

    public void components(){
        //bordas
        Border bordaLimpa = BorderFactory.createEmptyBorder();
        Border bordaDeLinha = BorderFactory.createLineBorder(Color.black, 2);

        //fontes
        Font ArialFont = new Font("Arial", Font.BOLD, 14);

        //frame
        setTitle("Formulario");
        setSize(600, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //painel
        painel = new JPanel();
        painel.setBounds(100, 25, 600, 600);
        painel.setBackground(Color.white);
        painel.setLayout(null);

        //label id
        id = new JLabel("ID: ");
        id.setFont(ArialFont);
        id.setBounds(100, 50, 50, 25);

        //text id
        textId = new JTextField();
        textId.setFont(ArialFont);
        textId.setBounds(175, 50, 300, 25);

        //label nome
        nome = new JLabel("Nome: ");
        nome.setFont(ArialFont);
        nome.setBounds(100, 100, 50, 25);

        //text nome
        textNome = new JTextField();
        textNome.setFont(ArialFont);
        textNome.setBounds(175, 100, 300, 25);

        //botao cadastrar
        cadastrar = new JButton("Cadastrar");
        cadastrar.setFont(ArialFont);
        cadastrar.setBounds(100, 450, 100, 25);
        cadastrar.setBackground(Color.green);
        cadastrar.setForeground(Color.white);
        cadastrar.setBorder(bordaLimpa);
        cadastrar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        cadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String id = textId.getText();
                String nome = textNome.getText();

                System.out.println(id);
                System.out.println(nome);

                textId.setText("");
                textNome.setText("");
            }
        });

        //botao excluir
        excluir = new JButton("Excluir");
        excluir.setFont(ArialFont);
        excluir.setBounds(225, 450, 100, 25);
        excluir.setBackground(Color.red);
        excluir.setForeground(Color.white);
        excluir.setBorder(bordaLimpa);
        excluir.setCursor(new Cursor(Cursor.HAND_CURSOR));

        excluir.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String id = textId.getText();
                String nome = textNome.getText();
            }
        });

        //limpar
        limpar = new JButton("Limpar");
        limpar.setFont(ArialFont);
        limpar.setBounds(350, 450, 100, 25);
        limpar.setBackground(Color.white);
        limpar.setForeground(Color.black);
        limpar.setBorder(bordaDeLinha);
        limpar.setCursor(new Cursor(Cursor.HAND_CURSOR));

        limpar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                System.out.println(e);
                textNome.setText("");
                textId.setText("");
            }
        });

        //adicionando componentes
        getContentPane().add(painel);
        painel.add(id);
        painel.add(textId);
        painel.add(nome);
        painel.add(textNome);
        painel.add(cadastrar);
        painel.add(excluir);
        painel.add(limpar);

        setVisible(true);

    }


}
