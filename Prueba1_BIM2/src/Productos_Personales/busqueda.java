package Productos_Personales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class busqueda {
    private JButton buscarButton;
    private JButton registroButton;
    private JTextField codigo;

    String url = "jdbc:mysql://localhost:3306/Product_CuidadoPersonal";
    String usuario = "root";
    String password = "123456";
    String sql = "select * from vehiculos where codigo_producto = ?";

    public busqueda() {
        JFrame frame = new JFrame("Busqueda");
        Container busqueda = new Container();
        frame.setContentPane(busqueda);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(600, 600);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);


        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (codigo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(busqueda, "Ingrese el codigo del producto");
                    return;
                }

                try {
                    Connection connection = DriverManager.getConnection(url, usuario, password);
                    System.out.println("Conexion exitosa");
                    PreparedStatement statement = connection.prepareStatement(sql);
                    statement.setString(1, codigo.getText());
                    ResultSet rs = statement.executeQuery();

                    if (rs.next()) {
                        JOptionPane.showMessageDialog(busqueda, "El Producto encontrado");

                    } else {
                        JOptionPane.showMessageDialog(busqueda, "El producto no existe");
                    }

                } catch (Exception ex) {
                    ex.printStackTrace();
                }

            }
        });

    }
}
