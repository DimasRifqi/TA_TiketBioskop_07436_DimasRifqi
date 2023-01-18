package viewsGUI;

import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.plaf.ColorUIResource;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JamView {
    JFrame frame = new JFrame();
    JLabel wallpaper;
    JButton jam9,jam11,jam13;

    public JamView() {
        frame.getContentPane().setBackground(new ColorUIResource(76, 50, 103));
        frame.setLayout(null);
        frame.setSize(700, 630);

        // jam9
        jam9 = new JButton("09:00");
        jam9.setBounds(200, 220, 90, 60);
        jam9.setBackground(ColorUIResource.getHSBColor(0, 0, 2));
        frame.add(jam9);

        // jam11
        jam11 = new JButton("11:00");
        jam11.setBounds(300, 220, 90, 60);
        jam11.setBackground(ColorUIResource.getHSBColor(0, 0, 2));
        frame.add(jam11);

        // jam13
        jam13 = new JButton("13:00");
        jam13.setBounds(400, 220, 90, 60);
        jam13.setBackground(ColorUIResource.getHSBColor(0, 0, 2));
        frame.add(jam13);

        ImageIcon icon4 = new ImageIcon("src/Image/jam.png");
        wallpaper = new JLabel(icon4);
        wallpaper.setBounds(-60, -70, 800, 700);
        frame.add(wallpaper);

        frame.setVisible(true);
        frame.setLocationRelativeTo(null);


        jam9.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                try {
                    AllObjView.BioskopC.JamBioskop();
                    String jam = AllObjView.BioskopC.getDataJam(0).getjam();

                    JOptionPane.showMessageDialog(null, "Memilih Jam : " + jam, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addJamUser(jam);
                    
                    frame.dispose();
                    RiwayatView riwayat = new RiwayatView();
                    riwayat.cetakRiwayatView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });

        jam11.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                try {
                    AllObjView.BioskopC.JamBioskop();
                    String jam = AllObjView.BioskopC.getDataJam(1).getjam();

                    JOptionPane.showMessageDialog(null, "Memilih Jam : " + jam, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addJamUser(jam);
                    
                    frame.dispose();
                    RiwayatView riwayat = new RiwayatView();
                    riwayat.cetakRiwayatView();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });

        jam13.addActionListener(new ActionListener() 
        {
            @Override
            public void actionPerformed(ActionEvent ae) 
            {
                
                try {
                    AllObjView.BioskopC.JamBioskop();
                    String jam = AllObjView.BioskopC.getDataJam(2).getjam();

                    JOptionPane.showMessageDialog(null, "Memilih Jam : " + jam, "information",JOptionPane.INFORMATION_MESSAGE);
                    AllObjView.BioskopC.addJamUser(jam);

                    frame.dispose();
                    RiwayatView riwayat = new RiwayatView();
                    riwayat.cetakRiwayatView();

                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "pilih dulu woe", "information",JOptionPane.INFORMATION_MESSAGE);
                }
                
            }
        });

    }
}
