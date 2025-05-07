package gui;

import javax.swing.*;

import java.awt.*;

public class MainMenu extends JFrame {
    public MainMenu() {
        setTitle("Sistema de Gimnasio");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JButton btnClientes = new JButton("Registrar Cliente");
        JButton btnPagos = new JButton("Pagos");
        JButton btnPlanes = new JButton("Plan Alimenticio");
        JButton btnRutinas = new JButton("Rutinas");

        btnClientes.addActionListener(e -> new ClienteForm().setVisible(true));
        btnPagos.addActionListener(e -> new PagosForm().setVisible(true));
        btnPlanes.addActionListener(e -> new PlanAlimenticioForm().setVisible(true));
        btnRutinas.addActionListener(e -> new RutinasForm().setVisible(true));

        setLayout(new GridLayout(4, 1, 10, 10));
        add(btnClientes);
        add(btnPagos);
        add(btnPlanes);
        add(btnRutinas);
    }
}
