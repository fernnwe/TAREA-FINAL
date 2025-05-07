package gui;

import javax.swing.*;

import models.cliente;
import utils.FileManager;

import java.awt.*;
import java.util.ArrayList;

public class ClienteForm extends JFrame {
    private JTextField txtNombre, txtCedula, txtTelefono, txtCorreo, txtDireccion;
    private DefaultListModel<cliente> clienteListModel;
    private ArrayList<cliente> listaClientes;
    private final String ARCHIVO_CLIENTES = "clientes.dat";

    public ClienteForm() {
        setTitle("Registro de Cliente");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        // Panel del formulario
        JPanel formPanel = new JPanel(new GridLayout(6, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        txtNombre = new JTextField();
        txtCedula = new JTextField();
        txtTelefono = new JTextField();
        txtCorreo = new JTextField();
        txtDireccion = new JTextField();

        formPanel.add(new JLabel("Nombre:"));
        formPanel.add(txtNombre);
        formPanel.add(new JLabel("Cédula:"));
        formPanel.add(txtCedula);
        formPanel.add(new JLabel("Teléfono:"));
        formPanel.add(txtTelefono);
        formPanel.add(new JLabel("Correo:"));
        formPanel.add(txtCorreo);
        formPanel.add(new JLabel("Dirección:"));
        formPanel.add(txtDireccion);

        JButton btnGuardar = new JButton("Guardar Cliente");
        formPanel.add(new JLabel());
        formPanel.add(btnGuardar);

        clienteListModel = new DefaultListModel<>();
        JList<cliente> clienteList = new JList<>(clienteListModel);
        JScrollPane scrollPane = new JScrollPane(clienteList);

        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        // Cargar datos al iniciar
        listaClientes = FileManager.cargarLista(ARCHIVO_CLIENTES);
        for (cliente c : listaClientes) {
            clienteListModel.addElement(c);
        }

        btnGuardar.addActionListener(e -> guardarCliente());
    }

    private void guardarCliente() {
        String nombre = txtNombre.getText();
        String cedula = txtCedula.getText();
        String telefono = txtTelefono.getText();
        String correo = txtCorreo.getText();
        String direccion = txtDireccion.getText();

        if (nombre.isEmpty() || cedula.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nombre y Cédula son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        cliente nuevoCliente = new cliente(nombre, cedula, telefono, correo, direccion);
        listaClientes.add(nuevoCliente);
        clienteListModel.addElement(nuevoCliente);
        FileManager.guardarLista(listaClientes, ARCHIVO_CLIENTES);
        limpiarCampos();
    }

    private void limpiarCampos() {
        txtNombre.setText("");
        txtCedula.setText("");
        txtTelefono.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
    }
}
