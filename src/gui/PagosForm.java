package gui;

import javax.swing.*;
import java.awt.*;

public class PagosForm extends JFrame {

    private JTextField txtCedula, txtMonto, txtFecha;

    public PagosForm() {
        setTitle("Registro de Pagos");
        setSize(400, 300);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel formPanel = new JPanel(new GridLayout(4, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtCedula = new JTextField();
        txtMonto = new JTextField();
        txtFecha = new JTextField();

        formPanel.add(new JLabel("Cédula del Cliente:"));
        formPanel.add(txtCedula);
        formPanel.add(new JLabel("Monto:"));
        formPanel.add(txtMonto);
        formPanel.add(new JLabel("Fecha (dd/mm/yyyy):"));
        formPanel.add(txtFecha);

        JButton btnRegistrar = new JButton("Registrar Pago");
        formPanel.add(new JLabel());
        formPanel.add(btnRegistrar);

        add(formPanel, BorderLayout.CENTER);
    }
}
