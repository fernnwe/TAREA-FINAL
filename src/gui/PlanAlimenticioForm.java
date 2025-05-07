package gui;

import javax.swing.*;
import java.awt.*;

public class PlanAlimenticioForm extends JFrame {

    private JTextField txtCedula;
    private JTextArea txtPlan;

    public PlanAlimenticioForm() {
        setTitle("Plan Alimenticio");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel(new GridLayout(2, 2, 10, 10));
        topPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtCedula = new JTextField();
        txtPlan = new JTextArea(10, 30);
        txtPlan.setLineWrap(true);
        txtPlan.setWrapStyleWord(true);

        topPanel.add(new JLabel("Cédula del Cliente:"));
        topPanel.add(txtCedula);
        topPanel.add(new JLabel("Plan Alimenticio:"));
        topPanel.add(new JScrollPane(txtPlan));

        JButton btnGuardar = new JButton("Guardar Plan");
        add(topPanel, BorderLayout.CENTER);
        add(btnGuardar, BorderLayout.SOUTH);
    }
}
