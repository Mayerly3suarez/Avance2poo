import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class InicioPrincipal {

    public static void main(String[] args) {
    SwingUtilities.invokeLater(() -> {
        JFrame frame = new JFrame("Seleccione el registro que desea realizar");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JButton buttonPlantas = new JButton("Inicio Plantas");
        JButton buttonUsuario = new JButton("Inicio Usuario");
        JButton buttonAnimales = new JButton("Inicio Animales");

        buttonPlantas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWindow(new InicioPlantas());
            }
        });

        buttonUsuario.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWindow(new InicioUsuario());
            }
        });

        buttonAnimales.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                openWindow(new InicioAnimales());
            }
        });

        frame.add(buttonPlantas);
        frame.add(buttonUsuario);
        frame.add(buttonAnimales);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    });
    }

    private static void openWindow(JFrame window) {
        window.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}

