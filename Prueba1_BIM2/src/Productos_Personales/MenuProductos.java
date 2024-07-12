package Productos_Personales;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MenuProductos {

    private JButton registrarProductoButton;
    private JButton buscarProductoButton;
    private JTextField codigoTxt;
    private JTextField nombreTxt;
    private JTextField precioTxt;
    private JTextField cantidadTxt;
    private JTextField categoriaTxt;
    private JTextArea descripcionTxt;
    public JPanel menu;
    private JButton limpiarButton;

    String urlB = "jdbc:mysql://localhost:3306/Productos_Personales";
    String usuarioB = "root";
    String passwordB = "123456";
    String sql = "INSERT INTO PRODUCTO (codigo_producto, nombre, descripcion, precio, cantidad, categoria) values (?,?,?,?,?,?)";

    public MenuProductos() {

        registrarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                productos product = new productos();
                if (codigoTxt.getText().isEmpty() || nombreTxt.getText().isEmpty() || descripcionTxt.getText().isEmpty() || precioTxt.getText().isEmpty() || cantidadTxt.getText().isEmpty() || categoriaTxt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Los campos deben estar llenos");
                    return;
                } else if (codigoTxt.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Ingrese un numero de placa valido");
                }

                product.setCod_product(codigoTxt.getName());
                product.setNombre(nombreTxt.getText());
                product.setDescripcion(descripcionTxt.getText());
                product.setPrecio(Double.parseDouble(precioTxt.getText()));
                product.setCantidad(Integer.parseInt(cantidadTxt.getText()));
                product.setCategoria(categoriaTxt.getText());

                try {
                    System.out.println("Conexion exitosa");
                    Connection connection = DriverManager.getConnection(urlB, usuarioB, passwordB);
                    PreparedStatement declarar = connection.prepareStatement(sql);
                    declarar.setString(1, codigoTxt.getText());
                    declarar.setString(2, nombreTxt.getText());
                    declarar.setString(3, descripcionTxt.getText());
                    declarar.setString(4, precioTxt.getText());
                    declarar.setString(5, cantidadTxt.getText());
                    declarar.setString(6, categoriaTxt.getText());
                    declarar.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Producto registrado correctamente");

                } catch (Exception ex){
                    JOptionPane.showMessageDialog(null,"Error al registrar el producto");
                    ex.printStackTrace();
                }
            }
        });
        buscarProductoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                codigoTxt.setText(null);
                nombreTxt.setText(null);
                descripcionTxt.setText(null);
                precioTxt.setText(null);
                cantidadTxt.setText(null);
                categoriaTxt.setText(null);
            }
        });
    }
}
