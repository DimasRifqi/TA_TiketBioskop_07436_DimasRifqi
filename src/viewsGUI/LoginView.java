package viewsGUI;

import java.awt.Color;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;

import viewsGUI.*;

public class LoginView 
{
    JLabel login;
    JTextField textnamalogin;
    JLabel labelnpmlogin, labelpasswordlogin,wallpaper;
    JButton masuk, backButton;
    JPasswordField passwordlogin;
    JDesktopPane coba;

    public LoginView() 
    {

        JFrame frame = new JFrame();
        frame.getContentPane().setBackground(new ColorUIResource(218, 226, 182));
        frame.setLayout(null);
        frame.setSize(700, 630);

        // login = new JLabel("Login");
        // login.setBounds(30, -10, 100, 100);
        // login.setFont(new Font("Lucida Sans", Font.BOLD, 30));
        // frame.add(login);

        labelnpmlogin = new JLabel("Nama");
        labelnpmlogin.setBounds(280, 190, 100, 30);
        frame.add(labelnpmlogin);
        textnamalogin = new JTextField();
        textnamalogin.setBounds(280, 220, 150, 30);
        textnamalogin.setBackground(Color.WHITE);
        frame.add(textnamalogin);

        labelpasswordlogin = new JLabel("Password");
        labelpasswordlogin.setBounds(280, 250, 100, 30);
        frame.add(labelpasswordlogin);
        passwordlogin = new JPasswordField();
        passwordlogin.setBounds(280, 280, 150, 30);
        frame.add(passwordlogin);
        
        masuk= new JButton("MASUK");
        masuk.setBounds(310, 320, 90, 30);
        masuk.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(masuk);

        backButton = new JButton("back");
        backButton.setBounds(20, 520, 90, 30);
        backButton.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(backButton);

        ImageIcon icon3 = new ImageIcon("src/Image/login.png");
        wallpaper = new JLabel(icon3);
        wallpaper.setBounds(-60, -40, 800, 700);
        frame.add(wallpaper);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                RegistrasiAkun obj = new RegistrasiAkun();
            }
        });
       
        masuk.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                try {
                    String nama = textnamalogin.getText();
                    String pass = passwordlogin.getText();
                    AllObjView.LoginC.login(nama, pass);
                    String namaLogin = AllObjView.LoginC.getDataLogin().getNama();
                    JOptionPane.showMessageDialog(null, "selamat datang " + namaLogin, "information",JOptionPane.INFORMATION_MESSAGE);
                    frame.dispose();
                    NamaFilm gui = new NamaFilm();
                    gui.cetakBioskopView();
                    
                } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "data yang anda masukkan salah ", "information",JOptionPane.INFORMATION_MESSAGE);
                        kosong();
                }
            }
         
        });
    }

    public void kosong() 
    {
        textnamalogin.setText(null);
        passwordlogin.setText(null);
    }
}
