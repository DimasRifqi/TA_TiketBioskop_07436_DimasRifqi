package viewsGUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RuangFilmView {
    JFrame frame = new JFrame();
    JLabel wallpaper;
    JButton backButton,cinema1,cinema2,cinema3;

    public RuangFilmView() {
        frame.getContentPane().setBackground(new ColorUIResource(204, 214, 166));
        frame.setLayout(null);
        frame.setSize(700, 630);

        // cinema1
        ImageIcon icon1 = new ImageIcon("src/Image/Cinema1.png");
        cinema1 = new JButton(icon1);
        cinema1.setBounds(20, 90, 200, 300);
        cinema1.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(cinema1);

        // cinema2
        ImageIcon icon2 = new ImageIcon("src/Image/Cinema2.png");
        cinema2 = new JButton(icon2);
        cinema2.setBounds(240, 90, 200, 300);
        cinema2.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(cinema2);

        // cinema3
        ImageIcon icon3 = new ImageIcon("src/Image/Cinema3.png");
        cinema3 = new JButton(icon3);
        cinema3.setBounds(460, 90, 200, 300);
        cinema3.setBackground(ColorUIResource.getHSBColor(0, 0, 26));
        frame.add(cinema3);

        ImageIcon icon4 = new ImageIcon("src/Image/ruangFilm.png");
        wallpaper = new JLabel(icon4);
        wallpaper.setBounds(-60, -40, 800, 700);
        frame.add(wallpaper);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        cinema1.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                try {
                    AllObjView.BioskopC.RuangBioskop();
                    String ruangFilm = AllObjView.BioskopC.getDataRuang(0).getruangFilm();

                    JOptionPane.showMessageDialog(null, "Memilih " + ruangFilm, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addRuangUser(ruangFilm);

                    frame.dispose();
                    KursiView kursi = new KursiView();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                    }
                
            }
        });

        cinema2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                try {
                    AllObjView.BioskopC.RuangBioskop();
                    String ruangFilm = AllObjView.BioskopC.getDataRuang(1).getruangFilm();

                    JOptionPane.showMessageDialog(null, "Memilih " + ruangFilm, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addRuangUser(ruangFilm);

                    frame.dispose();
                    KursiView kursi = new KursiView();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                    }
                
            }
        });


        cinema3.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                try {
                    AllObjView.BioskopC.RuangBioskop();
                    String ruangFilm = AllObjView.BioskopC.getDataRuang(2).getruangFilm();

                    JOptionPane.showMessageDialog(null, "Memilih Ruang : " + ruangFilm, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addRuangUser(ruangFilm);

                    frame.dispose();
                    KursiView kursi = new KursiView();

                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                    }
                
            }
        });




    }
}
