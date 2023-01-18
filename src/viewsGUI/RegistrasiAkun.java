package viewsGUI;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.FontUIResource;

public class RegistrasiAkun {
  
    JFrame LogReg = new JFrame();
    JLabel daftar,top,wallpaper;
    JTextField textnamalogin, textnotelp, textEmail, textnamadaftar, textLogin;
    JLabel labelpasswordlogin, labelnotelp, labelEmail, labelnamadaftar, labelpassworddaftar,labelPWEmail, loginJLabel;
    JButton check, Reg, loginmasuk;
    JPasswordField passwordlogin, passworddaftar, passwordEmail;

    public RegistrasiAkun() {
        ColorUIResource c = new ColorUIResource(255, 212, 149);
        LogReg.setSize(700, 630);
        LogReg.setLayout(null);
        LogReg.getContentPane().setBackground(new ColorUIResource(218, 226, 182));

        top = new JLabel("DAFTAR AKUN BIOSKOP");
        top.setBounds(140, 10, 400, 50);
        top.setFont(new FontUIResource("Lucida Sans", Font.BOLD, 30));
        LogReg.add(top);

        labelnamadaftar = new JLabel("NAMA");
        labelnamadaftar.setBounds(220, 150, 100, 30);
        LogReg.add(labelnamadaftar);
        textnamadaftar = new JTextField();
        textnamadaftar.setBounds(220, 180, 200, 30);
        LogReg.add(textnamadaftar);

        labelpassworddaftar = new JLabel("PASSWORD");
        labelpassworddaftar.setBounds(220, 210, 100, 30);
        LogReg.add(labelpassworddaftar);
        passworddaftar = new JPasswordField();
        passworddaftar.setBounds(220, 240, 200, 30);
        LogReg.add(passworddaftar);

        labelEmail = new JLabel("EMAIL");
        labelEmail.setBounds(220, 270, 100, 30);
        LogReg.add(labelEmail);
        textEmail = new JTextField();
        textEmail.setBounds(220, 300, 200, 30);
        LogReg.add(textEmail);

        labelPWEmail = new JLabel("PASSWORD EMAIL");
        labelPWEmail.setBounds(220, 330, 200, 30);
        LogReg.add(labelPWEmail);
        passwordEmail = new JPasswordField();
        passwordEmail.setBounds(220, 360, 200, 30);
        LogReg.add(passwordEmail);
        

        labelnotelp = new JLabel("NOMER TELEPPON");
        labelnotelp.setBounds(220, 390, 200, 30);
        LogReg.add(labelnotelp);
        textnotelp = new JTextField();
        textnotelp.setBounds(220, 420, 200, 30);
        LogReg.add(textnotelp);

        Reg = new JButton("DAFTAR");
        Reg.setBounds(245, 470, 150, 30);
        Reg.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        LogReg.add(Reg);

        ImageIcon icon3 = new ImageIcon("src/Image/wallpaper.png");
        wallpaper = new JLabel(icon3);
        wallpaper.setBounds(-60, -40, 800, 700);
        LogReg.add(wallpaper);

        LogReg.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        LogReg.setVisible(true);
        LogReg.setLocationRelativeTo(null);

       

        Reg.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {

                try {
                    String nama = textnamadaftar.getText();
                    String pass = passworddaftar.getText();
                    String email = textEmail.getText();
                    String PWEmail = passwordEmail.getText();
                    String notelp = textnotelp.getText();
                    AllObjView.LoginC.reg(nama, pass, email, PWEmail, notelp);
                    JOptionPane.showMessageDialog(null, "  REGISTRASI BERHASIL","information", JOptionPane.INFORMATION_MESSAGE);
                    kosong();
                    LogReg.dispose();
                    LoginView login = new LoginView();
                    
                } catch (Exception exception) {
                    JOptionPane.showMessageDialog(null, "Format penulisan salah", "registrasi gagal ",JOptionPane.INFORMATION_MESSAGE);
                }
            }
        });
    }

    public void kosong() {
        textnamadaftar.setText(null);
        passworddaftar.setText(null);
        textnotelp.setText(null);
        passwordEmail.setText(null);
        textEmail.setText(null);
    }
}