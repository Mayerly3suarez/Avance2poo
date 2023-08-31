import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class InicioUsuario extends JFrame implements ActionListener{

    static JButton btnLeer, btnListar,btnNuevo;
    static JTextArea txtTablero;
    static JLabel lblCodigo;
    static String linea;
    static JTextField txtNombre,txtid,txtTipodeUsuario;
    static ArrayList<Usuario> laLista;



    public InicioUsuario(){

        btnLeer = new JButton("Lista de Usuarios");
        btnLeer.setLocation(54,30);
        btnLeer.setSize(150,30);
        btnLeer.addActionListener(this);
        btnLeer.setForeground(Color.BLACK);

        btnNuevo = new JButton("Registrar");
        btnNuevo.setLocation(280,190);
        btnNuevo.setSize(130,30);
        btnNuevo.addActionListener(this);
        btnNuevo.setForeground(Color.BLACK);

        btnListar = new JButton("Listar");
        btnListar.setLocation(280,230);
        btnListar.setSize(130,30);
        btnListar.addActionListener(this);
        btnListar.setForeground(Color.BLACK);

        lblCodigo = new JLabel("Digite sus datos");
        lblCodigo.setLocation(280,40);
        lblCodigo.setSize(130,30);
        lblCodigo.setForeground(Color.WHITE);


        txtTablero = new JTextArea();
        txtTablero.setLocation(30,70);
        txtTablero.setSize(200,350);

        txtNombre = new JTextField(10);
        txtNombre.setLocation(270,70);
        txtNombre.setSize(150,30);

        txtid = new JTextField(10);
        txtid.setLocation(270,110);
        txtid.setSize(150,30);



        txtTipodeUsuario= new JTextField(10);
        txtTipodeUsuario.setLocation(270,150);
        txtTipodeUsuario.setSize(150,30);


        //adicionar
        add(btnLeer);
        add(txtTablero);
        add(txtNombre);
        add(txtid);
        add(txtTipodeUsuario);
        add(btnNuevo);
        add(btnListar);
        add(lblCodigo);


        Color c = new Color(38,38,38);
        getContentPane().setBackground(c);

        setLayout(null);
        setSize(500,350);
        setTitle("Lista de Usuarios");

        setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        setLocation(300,200);
        setVisible (true);

    }
    public static void main(String[] args) {
        InicioUsuario ventana = new InicioUsuario();

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String listaArea="";
        if (e.getSource().equals(btnListar)) {
            for (Usuario c : laLista) {
                listaArea = listaArea + c.getNombre() + "-" + c.getId() + c.getTipodeUsuario() + "\n";
            }
            txtTablero.setText("");
            txtTablero.append(listaArea);

        }

        if (e.getSource().equals(btnLeer)){
            try {
                txtTablero.append("");
                linea = LeerArchivo.readFile("C:\\archivos\\QuizPoo2_Ejercicios\\src\\usuarios.txt");
                txtTablero.setText(linea);
                txtTablero.append("Archivo leido\nLista creada");
                laLista=Lista.crearLista(linea);


            }catch (IOException ioe){
                System.out.println(ioe);
            }
        }
        if (e.getSource().equals(btnNuevo)){
            String nombre = txtNombre.getText();
            String id = txtid.getText();
            String tipoUsuario = txtTipodeUsuario.getText();

            Usuario u = new Usuario(nombre,id,tipoUsuario);
            laLista.add(u);


        }
    }
}







