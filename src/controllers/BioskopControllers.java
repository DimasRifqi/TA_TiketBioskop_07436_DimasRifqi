package controllers;

import java.util.ArrayList;

import javax.swing.table.DefaultTableModel;
import entity.*;

public class BioskopControllers 
{
    int indexLogin = 0;
    private ArrayList <LoginEntity> produk = new ArrayList<>();
    public void NamaBioskop() 
    {
        String namaFilm[] = {"Avengers","Spiderman","KKN","Satria dewa gatotkaca"};
        int harga[] = {45000,40000,35000,350000};

        for (int i = 0; i < namaFilm.length; i++) {
            AllObjControllers.bioskop.insertNama(new NamaFilmEntity(namaFilm[i], harga[i]));
     
        }
    }

    public void RuangBioskop() 
    {
        String ruangFilm[] = {"Cinema 1","Cinema 2","Cinema 3"};
        for (int i = 0; i < ruangFilm.length; i++) {
            AllObjControllers.bioskop.insertRuang(new RuangFilmEntity(ruangFilm[i]));
        }
    }

    public void KursiBioskop() 
    {
        String kursi[] = {"A1","A2","A3","B1","B2","B3","C1","C2","C3"};
        for (int i = 0; i < kursi.length; i++) {
            AllObjControllers.bioskop.insertKursi(new kursiEntity(kursi[i]));
   
        }
    }

    public void JamBioskop() 
    {
        String jam[] = {"09:00","11:00","13:00","15:00","17:00"};

        for (int i = 0; i < jam.length; i++) {
            AllObjControllers.bioskop.insertJam(new JamEntity(jam[i]));
        }
    }

    public NamaFilmEntity getDataNama(int index) {
        NamaBioskop();
        return AllObjControllers.bioskop.getListNamaFilm(index);
    }
    //---
    public NamaFilmEntity getDataFilmUser(int index) {
        return AllObjControllers.bioskop.getListFilmUser(index);
    }

    public RuangFilmEntity getDataRuang(int index) {
        RuangBioskop();
        return AllObjControllers.bioskop.getListRuangFilm(index);
    }

    //---
    public RuangFilmEntity getDataRuangUser(int index) {
        return AllObjControllers.bioskop.getListRuangUser(index);
    }

    public kursiEntity getDataKursi(int index) {
        KursiBioskop();
        return AllObjControllers.bioskop.getListKursiFilm(index);
    }

    //---
    public kursiEntity getDataKursiUser(int index) {
        return AllObjControllers.bioskop.getListKursiUser(index);
    }

    public JamEntity getDataJam(int index) {
        JamBioskop();
        return AllObjControllers.bioskop.getListJamFilm(index);
    }

    //---
    public JamEntity getDataJamUser(int index) {
        return AllObjControllers.bioskop.getListJamUser(index);
    }

    public LoginEntity getLoginEntity() {
        return AllObjControllers.akun.getLogin(indexLogin);
    }

    public void addNamaBioskop(String namaFilm, int harga) 
    {
        AllObjControllers.bioskop.insertNama(new NamaFilmEntity(namaFilm, harga));
    }
    public void addNamaBioskopUser(String namaFilm, int harga) 
    {
        AllObjControllers.bioskop.insertNamaFilm(new NamaFilmEntity(namaFilm, harga));
    }


    public void addRuangFilm(String ruangFilm) 
    {
        AllObjControllers.bioskop.insertRuang(new RuangFilmEntity(ruangFilm));
    }

    public void addRuangUser(String ruangFilm) 
    {
        AllObjControllers.bioskop.insertRuangFilm(new RuangFilmEntity(ruangFilm));
    }
    
    public void addKursi(String kursi) 
    {
        AllObjControllers.bioskop.insertKursi(new kursiEntity(kursi));
    }

    public void addKursiUser(String kursi) 
    {
        AllObjControllers.bioskop.insertKursiFilm(new kursiEntity(kursi));
    }

    public void addJam(String jam) 
    {
        AllObjControllers.bioskop.insertJam(new JamEntity(jam));
    }

    public void addJamUser(String jam) 
    {
        AllObjControllers.bioskop.insertJamFilm(new JamEntity(jam));
    }

    public void setNama(String namaFilm, int harga) 
    {
        AllObjControllers.bioskop.setNama(new NamaFilmEntity(namaFilm, harga));
    }

    public void setRuang(String ruangFilm) 
    {
        AllObjControllers.bioskop.setRuang(new RuangFilmEntity(ruangFilm));
    }

    public void setKursi(String kursi) 
    {
        AllObjControllers.bioskop.setKursi(new kursiEntity(kursi));
    }

    public void setJam(String jam) 
    {
        AllObjControllers.bioskop.setJam(new JamEntity(jam));
    }

    public DefaultTableModel daftarPelanggan() 
    {
        DefaultTableModel DataUser = new DefaultTableModel();
        Object[] kolom = { "Index","Nama","Email","NoTelepon","No Pembelian","Nama Film","Harga","Ruang Film","Kursi","jam"};
        DataUser.setColumnIdentifiers(kolom);

        int size = AllObjControllers.akun.getArrayList();

        for (int i = 0; i < size; i++) {
            Object[] data = new Object[10];
            data[0] = i;
            data[1] = AllObjControllers.akun.getListLogin().get(i).getNama();
            data[2] = AllObjControllers.akun.getListLogin().get(i).getEmail();
            data[3] = AllObjControllers.akun.getListLogin().get(i).getNoTelepon();
            data[4] = AllObjControllers.akun.getListLogin().get(i).getKode();

            data[5] = AllObjControllers.bioskop.getListFilmUser(i).getnamaFilm();
            data[6] = AllObjControllers.bioskop.getListFilmUser(i).getHarga();
            data[7] = AllObjControllers.bioskop.getListRuangUser(i).getruangFilm();
            data[8] = AllObjControllers.bioskop.getListKursiUser(i).getKursi();
            data[9] = AllObjControllers.bioskop.getListJamUser(i).getjam();
            
            DataUser.addRow(data);
        }
        return DataUser;
    }    
}
