package viewsGUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NamaFilm {
    JFrame frame = new JFrame();
    JLabel avengerLabel,spidermanLabel,kknLabel,wallpaper;
    JButton buy, backButton, avenger, spiderman, kkn;
   

    public void cetakBioskopView() {
        frame.getContentPane().setBackground(new ColorUIResource(204, 214, 166));
        frame.setLayout(null);
        frame.setSize(700, 630);

        // avenger
        ImageIcon icon = new ImageIcon("src/Image/avengers.png");
        avenger = new JButton(icon);
        avenger.setBounds(50, 120, 150, 285);
        avenger.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(avenger);
        avengerLabel = new JLabel("Rp.45.000");
        avengerLabel.setBounds(80, 380, 100, 100);
        avengerLabel.setFont(new Font("Lucida Sans", Font.BOLD, 20));
        frame.add(avengerLabel);

        // Spiderman
        ImageIcon icon2 = new ImageIcon("src/Image/spidermann.png");
        spiderman = new JButton(icon2);
        spiderman.setBounds(265, 120, 150, 285);
        spiderman.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(spiderman);
        spidermanLabel = new JLabel("Rp.40.000");
        spidermanLabel.setBounds(285, 380, 100, 100);
        spidermanLabel.setFont(new Font("Lucida Sans", Font.BOLD, 20));
        frame.add(spidermanLabel);

        // KKN
        ImageIcon icon3 = new ImageIcon("src/Image/kknnn.png");
        kkn = new JButton(icon3);
        kkn.setBounds(480, 120, 150, 285);
        kkn.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(kkn);
        kknLabel = new JLabel("Rp.35.000");
        kknLabel.setBounds(510, 380, 100, 100);
        kknLabel.setFont(new Font("Lucida Sans", Font.BOLD, 20));
        frame.add(kknLabel);

        ImageIcon icon4 = new ImageIcon("src/Image/namafilm.png");
        wallpaper = new JLabel(icon4);
        wallpaper.setBounds(-60, -40, 800, 700);
        frame.add(wallpaper);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        avenger.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    AllObjView.BioskopC.NamaBioskop();
                    String namaFilm = AllObjView.BioskopC.getDataNama(0).getnamaFilm();
                    int harga = AllObjView.BioskopC.getDataNama(0).getHarga();

                    JOptionPane.showMessageDialog(null, "Memilih Film : " + namaFilm, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addNamaBioskopUser(namaFilm, harga);

                    frame.dispose();
                    RuangFilmView ruang = new RuangFilmView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe","information",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        spiderman.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    AllObjView.BioskopC.NamaBioskop();
                    String namaFilm = AllObjView.BioskopC.getDataNama(1).getnamaFilm();
                    int harga = AllObjView.BioskopC.getDataNama(1).getHarga();

                    JOptionPane.showMessageDialog(null, "Memilih Film : " + namaFilm, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addNamaBioskopUser(namaFilm, harga);

                    frame.dispose();
                    RuangFilmView ruang = new RuangFilmView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe","information",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

        kkn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    AllObjView.BioskopC.NamaBioskop();
                    String namaFilm = AllObjView.BioskopC.getDataNama(2).getnamaFilm();
                    int harga = AllObjView.BioskopC.getDataNama(2).getHarga();

                    JOptionPane.showMessageDialog(null, "Memilih Film : " + namaFilm, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addNamaBioskopUser(namaFilm, harga);


                    frame.dispose();
                    RuangFilmView ruang = new RuangFilmView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe","information",JOptionPane.INFORMATION_MESSAGE);
                }

            }
        });

    }

}
