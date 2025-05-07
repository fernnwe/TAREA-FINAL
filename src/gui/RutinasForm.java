package gui;

import javax.swing.*;
import java.awt.*;

public class RutinasForm extends JFrame {

    private JTextField txtCedula;
    private JTextArea txtRutina;

    public RutinasForm() {
        setTitle("Rutinas de Ejercicio");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtCedula = new JTextField();
        txtRutina = new JTextArea(10, 30);
        txtRutina.setLineWrap(true);
        txtRutina.setWrapStyleWord(true);

        topPanel.add(new JLabel("Cédula del Cliente:"));
        topPanel.add(txtCedula);
        topPanel.add(new JLabel("Rutina:"));
        topPanel.add(new JScrollPane(txtRutina));

        JButton btnGuardar = new JButton("Guardar Rutina");
        add(topPanel, BorderLayout.CENTER);
        add(btnGuardar, BorderLayout.SOUTH);
    }
}
