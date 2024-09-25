import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.EventListener;
import java.util.concurrent.TimeUnit;

public class Janela extends JFrame {
    private JPanel painelDeFundo;
    private JLabel nome;
    private JTextField txtNome;
    private JComboBox cmbEstadoCivil;
    private JButton btnOk;
    private JButton btnCancel;

    public Janela(){
        components();
    }

    public void components(){
        //janela
        setTitle("Cadastro");
        setBounds(0,0,300,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        //painelDeFundo
        painelDeFundo = new JPanel();
        painelDeFundo.setBounds(getContentPane().getBounds());
        painelDeFundo.setBackground(Color.WHITE);
        painelDeFundo.setLayout(null);

        //nome
        nome = new JLabel("Nome");
        nome.setFont(new Font("Arial", Font.BOLD , 20));
        nome.setBounds(30,35,100,50);
        nome.setForeground(Color.BLACK);

        //txtNome
        txtNome = new JTextField();
        txtNome.setBounds(30, 90,200,20);
        txtNome.setFont(new Font("Arial", Font.PLAIN , 14));
        txtNome.setBorder(BorderFactory.createMatteBorder(0,0,1,0, Color.BLACK));

        //cmbEstadoCivil
        cmbEstadoCivil = new JComboBox();
        cmbEstadoCivil.setFont(new Font("Arial", Font.PLAIN , 14));
        cmbEstadoCivil.addItem("Casado");
        cmbEstadoCivil.addItem("Solteiro");
        cmbEstadoCivil.addItem("Divorciado");
        cmbEstadoCivil.addItem("Viuvo");
        cmbEstadoCivil.setBounds(30,140,100,30);
        cmbEstadoCivil.setBackground(Color.white);
        cmbEstadoCivil.setBorder(BorderFactory.createEmptyBorder());

        //btnOk
        btnOk = new JButton("Ok");
        btnOk.setBounds(30,200,100,30);
        btnOk.setBackground(Color.black);
        btnOk.setForeground(Color.white);
        btnOk.setBorder(BorderFactory.createEmptyBorder());
        btnOk.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnOk.setFocusPainted(false);

        //btnCancel
        btnCancel = new JButton("Cancel");
        btnCancel.setBounds(150,200,100,30);
        btnCancel.setBackground(Color.black);
        btnCancel.setForeground(Color.white);
        btnCancel.setBorder(BorderFactory.createEmptyBorder());
        btnCancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btnCancel.setFocusPainted(false);

        JButton[] botoes = new JButton[]{btnCancel, btnOk};

        for(JButton comp : botoes){
            comp.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    txtNome.setText("");

                }
            });
        }

        //adicionando componentes
        getContentPane().add(painelDeFundo);
        painelDeFundo.add(nome);
        painelDeFundo.add(txtNome);
        painelDeFundo.add(cmbEstadoCivil);
        painelDeFundo.add(btnOk);
        painelDeFundo.add(btnCancel);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Janela();
    }

}
