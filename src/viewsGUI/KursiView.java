package viewsGUI;

import java.awt.*;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KursiView {
    JFrame frame = new JFrame();
    JLabel kursi,textlayar,wallpaper;
    JButton kursiA1,kursiA2,kursiA3,kursiB1,kursiB2,layar;

    public KursiView() {
        frame.getContentPane().setBackground(new ColorUIResource(204, 214, 166));
        frame.setLayout(null);
        frame.setSize(700, 630);

        layar = new JButton();
        layar.setBounds(120, 100, 440, 10);
        layar.setFont(new Font("Lucida Sans", Font.BOLD, 15));
        frame.add(layar);

        textlayar = new JLabel("Layar");
        textlayar.setBounds(310, 70, 150, 100);
        textlayar.setFont(new Font("Lucida Sans", Font.BOLD, 15));
        frame.add(textlayar);

        // kursi A1
        kursiA1 = new JButton("A1");
        kursiA1.setBounds(250, 270, 50, 50);
        kursiA1.setBackground(ColorUIResource.getHSBColor(12, 0, 26));
        frame.add(kursiA1);

        // Kursi A2
        kursiA2 = new JButton("A2");
        kursiA2.setBounds(310, 270, 50, 50);
        kursiA2.setBackground(ColorUIResource.getHSBColor(12, 0, 26));
        frame.add(kursiA2);

        // Kursi A3
        kursiA3 = new JButton("A3");
        kursiA3.setBounds(370, 270, 50, 50);
        kursiA3.setBackground(ColorUIResource.getHSBColor(12, 0, 26));
        frame.add(kursiA3);


        ImageIcon icon4 = new ImageIcon("src/Image/kursi.png");
        wallpaper = new JLabel(icon4);
        wallpaper.setBounds(-60, -40, 800, 700);
        frame.add(wallpaper);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


        kursiA1.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {    
                try {
                    AllObjView.BioskopC.KursiBioskop();
                    String kursi = AllObjView.BioskopC.getDataKursi(0).getKursi();

                    JOptionPane.showMessageDialog(null, "Memilih Kursi : " + kursi, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addKursiUser(kursi);
                    
                    frame.dispose();
                    JamView jam = new JamView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });

        kursiA2.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {    
                try {
                    AllObjView.BioskopC.KursiBioskop();
                    String kursi = AllObjView.BioskopC.getDataKursi(1).getKursi();

                    JOptionPane.showMessageDialog(null, "Memilih Kursi : " + kursi, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addKursiUser(kursi);
                       
                    frame.dispose();
                    JamView jam = new JamView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });


        kursiA3.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {    
                try {
                    AllObjView.BioskopC.KursiBioskop();
                    String kursi = AllObjView.BioskopC.getDataKursi(2).getKursi();

                    JOptionPane.showMessageDialog(null, "Memilih Kursi : " + kursi, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addKursiUser(kursi);
                        
                    frame.dispose();
                    JamView jam = new JamView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });

    }
}
