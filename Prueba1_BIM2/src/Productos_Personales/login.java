package Productos_Personales;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import java.sql.*;

public class login {
    private JPanel LOGIN;
    private JTextField user;
    private JTextField password;
    private JButton loginButton;
    private JLabel imageLabel;

    String urlB = "jdbc:mysql://localhost:3306/Productos_Personales";
    String usuarioB = "root";
    String passwordB = "123456";
    String sql = "select * from USUARIO where usuario = ?";

    public Container LOGIN() {
        return LOGIN;
    }

    public login() {

        usuarios user1 = new usuarios();
        try{
            URL url = new URL("https://static.vecteezy.com/system/resources/thumbnails/019/879/186/small/user-icon-on-transparent-background-free-png.png");
            ImageIcon icon = new ImageIcon(url);
            imageLabel.setIcon(icon);
        } catch (Exception e){
            e.printStackTrace();
        }

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (user.getText().equals("admin") && password.getText().equals("admin")) {
                    System.out.println("Iniciando sesion exitoso");
                    JFrame login = new JFrame();
                    login.dispose();

                    JFrame menu = new JFrame("Menu Productos");
                    menu.setContentPane(new MenuProductos().menu);
                    menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    menu.pack();
                    menu.setSize(600,600);
                    menu.setLocationRelativeTo(null);
                    menu.setVisible(true);

                    new MenuProductos();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o Contraseña incorrecta");
                }
            }
        });
    }
}
