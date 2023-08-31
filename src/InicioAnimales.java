import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class InicioAnimales extends JFrame implements ActionListener {

        static JButton btnLeer, btnListar,btnNuevo;
        static JTextArea txtTablero;
        static JLabel lblCodigo;
        static String linea;
        static JTextField txtnombre,txttamano,txtespecie,txtlugarAvistamiento;
        static ArrayList<Animales> laListaA;



        public InicioAnimales(){

            btnLeer = new JButton("Lista de Animales");
            btnLeer.setLocation(54,30);
            btnLeer.setSize(150,30);
            btnLeer.addActionListener(this);
            btnLeer.setForeground(Color.BLACK);

            btnNuevo = new JButton("Registrar");
            btnNuevo.setLocation(280,230);
            btnNuevo.setSize(130,30);
            btnNuevo.addActionListener(this);
            btnNuevo.setForeground(Color.BLACK);

            btnListar = new JButton("Listar");
            btnListar.setLocation(280,270);
            btnListar.setSize(130,30);
            btnListar.addActionListener(this);
            btnListar.setForeground(Color.BLACK);

            lblCodigo = new JLabel("Registre la información");
            lblCodigo.setLocation(280,40);
            lblCodigo.setSize(130,30);
            lblCodigo.setForeground(Color.WHITE);

            txtTablero = new JTextArea();
            txtTablero.setLocation(30,70);
            txtTablero.setSize(200,350);

            txtnombre = new JTextField(10);
            txtnombre.setLocation(270,70);
            txtnombre.setSize(150,30);

            pack();
            setLocationRelativeTo(null);
            setVisible(true);


            txttamano = new JTextField(10);
            txttamano.setLocation(270,110);
            txttamano.setSize(150,30);

            txtespecie = new JTextField(10);
            txtespecie.setLocation(270,150);
            txtespecie.setSize(150,30);

            txtlugarAvistamiento= new JTextField(10);
            txtlugarAvistamiento.setLocation(270,192);
            txtlugarAvistamiento.setSize(150,30);


            //adicionar
            add(btnLeer);
            add(txtTablero);
            add(txtnombre);
            add(txttamano);
            add(txtespecie);
            add(txtlugarAvistamiento);
            add(btnNuevo);
            add(btnListar);
            add(lblCodigo);


            Color c = new Color(38,38,38);
            getContentPane().setBackground(c);

            setLayout(null);
            setSize(500,350);
            setTitle("Lista de Animales");

            setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            setLocation(300,200);
            setVisible (true);

        }
    public static void main(String[] args) {
        InicioAnimales animal  = new InicioAnimales();

        }
        @Override
        public void actionPerformed(ActionEvent e) {
            String listaArea="";
            if (e.getSource().equals(btnListar)) {
                for (Animales c : laListaA) {
                    listaArea = listaArea + c.getNombre() + "-" + c.getTamano() + c.getEspecie() + c.getLugarAvistamiento()+ "\n";
                }
                txtTablero.setText("");
                txtTablero.append(listaArea);

            }

            if (e.getSource().equals(btnLeer)){
                try {
                    txtTablero.append("");
                    linea = LeerArchivo.readFile("C:\\archivos\\QuizPoo2_Ejercicios\\src\\animales.txt");
                    txtTablero.setText(linea);
                    txtTablero.append("Archivo leido\nLista creada");
                    laListaA= Lista.crearListaA(linea);


                }catch (IOException ioe){
                    System.out.println(ioe);
                }
            }
            if (e.getSource().equals(btnNuevo)){
                String nombre = txtnombre.getText();
                String tamano = txttamano.getText();
                String especie = txtespecie.getText();
                String lugarAvistamiento = txtlugarAvistamiento.getText();

                Animales c = new Animales(nombre,tamano,especie,lugarAvistamiento);
                laListaA.add(c);

            }

        }
    }






