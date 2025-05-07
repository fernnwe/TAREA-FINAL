import gui.ClienteForm;
import gui.PagosForm;
import gui.PlanAlimenticioForm;
import gui.RutinasForm;

import javax.swing.*;
import java.awt.*;

public class MainMenu {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame menu = new JFrame("Sistema de Gym - Menú Principal");
            menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            menu.setSize(400, 300);
            menu.setLocationRelativeTo(null);
            menu.setLayout(new GridLayout(5, 1, 10, 10));

            JButton btnClientes = new JButton("Registrar Clientes");
            JButton btnPagos = new JButton("Registrar Pagos");
            JButton btnPlanes = new JButton("Plan Alimenticio");
            JButton btnRutinas = new JButton("Rutinas");
            JButton btnSalir = new JButton("Salir");

            btnClientes.addActionListener(e -> new ClienteForm().setVisible(true));
            btnPagos.addActionListener(e -> new PagosForm().setVisible(true));
            btnPlanes.addActionListener(e -> new PlanAlimenticioForm().setVisible(true));
            btnRutinas.addActionListener(e -> new RutinasForm().setVisible(true));
            btnSalir.addActionListener(e -> System.exit(0));

            menu.add(btnClientes);
            menu.add(btnPagos);
            menu.add(btnPlanes);
            menu.add(btnRutinas);
            menu.add(btnSalir);

            menu.setVisible(true);
        });
    }
}
