import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

public class InicioPlantas extends JFrame implements ActionListener {

        static JButton btnLeer, btnListar,btnNuevo;
        static JTextArea txtTablero;
        static JLabel lblCodigo;
        static String linea;
        static JTextField txtnombreComun,txtubicacion,txtalturamt;
        static ArrayList<Plantas> laListaP;


        public InicioPlantas(){

            btnLeer = new JButton("Lista de Plantas");
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

            lblCodigo = new JLabel("Realice el registro de la planta");
            lblCodigo.setLocation(280,40);
            lblCodigo.setSize(130,30);
            lblCodigo.setForeground(Color.WHITE);


            txtTablero = new JTextArea();
            txtTablero.setLocation(30,70);
            txtTablero.setSize(200,350);

            txtnombreComun = new JTextField(10);
            txtnombreComun.setLocation(270,70);
            txtnombreComun.setSize(150,30);

            txtubicacion = new JTextField(10);
            txtubicacion.setLocation(270,110);
            txtubicacion.setSize(150,30);

            txtalturamt= new JTextField(10);
            txtalturamt.setLocation(270,150);
            txtalturamt.setSize(150,30);


            //adicionar
            add(btnLeer);
            add(txtTablero);
            add(txtnombreComun);
            add(txtubicacion);
            add(txtalturamt);
            add(btnNuevo);
            add(btnListar);
            add(lblCodigo);

            Color c = new Color(38,38,38);
            getContentPane().setBackground(c);

            setLayout(null);
            setSize(500,350);
            setTitle("Lista de Plantas");

            setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
            setLocation(300,200);
            setVisible (true);

        }
    public static void main(String[] args) {
        InicioPlantas planta = new InicioPlantas();

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String listaArea="";
            if (e.getSource().equals(btnListar)) {
                for (Plantas c : laListaP) {
                    listaArea = listaArea + c.getNombreComun() + "-" + c.getUbicacion() + c.getAltura() + "\n";
                }
                txtTablero.setText("");
                txtTablero.append(listaArea);

            }

            if (e.getSource().equals(btnLeer)){
                try {
                    txtTablero.append("");
                    linea = LeerArchivo.readFile("C:\\archivos\\QuizPoo2_Ejercicios\\src\\plantas.txt");
                    txtTablero.setText(linea);
                    txtTablero.append("Archivo leido\nLista creada");
                    laListaP= Lista.crearListaP(linea);


                }catch (IOException ioe){
                    System.out.println(ioe);
                }
            }
            if (e.getSource().equals(btnNuevo)){
                String nombre = txtnombreComun.getText();
                String ubicacion = txtubicacion.getText();
                String altura = txtalturamt.getText();

                Plantas u = new Plantas(nombre,ubicacion,altura);
                laListaP.add(u);

            }

    }
}




