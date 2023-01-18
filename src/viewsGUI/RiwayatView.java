package viewsGUI;

import java.awt.Color;
import javax.swing.JDesktopPane;
import javax.swing.*;
import javax.swing.JLabel;
import javax.swing.JTable;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RiwayatView {

    JFrame frame = new JFrame();
    JDesktopPane coba;
    JLabel member, wallpaper;
    JTable tabelUser = new JTable();
    JScrollPane scrollUser = new JScrollPane(tabelUser);
    JButton back,delete,buatTransaksi;
    JLabel userlabel, passlabel;
    JTextField usertext,hapus, passtext;

    public void cetakRiwayatView() {

        frame.setSize(700, 630);
        scrollUser.setBounds(20, 100, 650, 200);
        tabelUser.setModel(AllObjView.BioskopC.daftarPelanggan());
        frame.add(scrollUser);

        buatTransaksi = new JButton("Beli Lagi");
        buatTransaksi.setBounds(520, 310, 150, 30);
        buatTransaksi.setBackground(Color.white);
        frame.add(buatTransaksi);

        userlabel = new JLabel("Hapus Index ");
        userlabel.setBounds(20, 300, 100, 30);
        frame.add(userlabel);
        hapus = new JTextField();
        hapus.setBounds(20, 330, 100, 30);
        frame.add(hapus);
        delete = new JButton("Delete");
        delete.setBounds(20, 370, 80, 30);
        delete.setBackground(Color.white);
        frame.add(delete);

        back = new JButton("back");
        back.setBounds(20, 520, 90, 30);
        back.setBackground(Color.white);
        frame.add(back);

        ImageIcon icon4 = new ImageIcon("src/Image/Riwayat.png");
        wallpaper = new JLabel(icon4);
        wallpaper.setBounds(-60, -40, 800, 700);
        frame.add(wallpaper);

        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                LoginView loginn = new LoginView();
            }
        });

        buatTransaksi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                frame.dispose();
                RegistrasiAkun regis = new RegistrasiAkun();
            }
        });

        delete.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    int index = new Integer(hapus.getText());
                    JOptionPane.showMessageDialog(null, "Data ke : "+index +" Berhasil Dihapus ","Warning", JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.LoginC.delete(index);
                    cetakRiwayatView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Data yang anda masukkan salah", "Eror ",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

    }
}
