package viewsCLI;

import java.util.Scanner;

import controllers.AllObjControllers;
import viewsGUI.AllObjView;

public class HomeCLI 
{

    public void cetakCLI()
    {
        int pilih,pilihFilm,pilihRuang,pilihKursi,PilihJam,hapus;
        String nama,password,email,PWEmail,noTelepon;
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("=========================");
            System.out.println("1.Daftar Akun   ");
            System.out.println("2.Login Akun    ");
            System.out.println("3.Hapus Akun    ");
            System.out.println("4.Riwayat Transaksi    ");
            System.out.println("------------------------");
            System.out.println("Kalau Mau Beli Lagi ketik 1");
            System.out.println("Ketik 0 Exit");
            System.out.println("=========================");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();
            switch (pilih)
            {
                case 1 :
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan Username     : ");
                    nama = input.next();

                    System.out.print("Masukkan Password     : ");
                    password = input.next();
                    
                    System.out.print("Masukkan Email        : ");
                    email = input.next();

                    System.out.print("Masukkan PW Email     : ");
                    PWEmail = input.next();
                    
                    System.out.print("Masukkan No Telepon   : ");
                    noTelepon = input.next();

                    AllObjView.LoginC.reg(nama, password, email, PWEmail, noTelepon);
                    System.out.println("-------------------------------------");
                break;

                case 2:
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan Username : ");
                    String usr = input.next();
                    System.out.print("Masukkan Password : ");
                    String pw = input.next();
                    AllObjView.LoginC.login(usr, pw);
                    String namaLogin = AllObjView.LoginC.getDataLogin().getNama();
                    System.out.println("Selamat datang "+namaLogin);
                    System.out.println("-------------------------------------");

                    System.out.println("====================================================");
                    System.out.println("FILM YANG SEDANG TAYANG");
                    System.out.println("-------------------------------------");
                    System.out.println("0.Avengers   || Harga : RP.45.000");
                    System.out.println("1.Spiderman  || Harga : RP.40.000");
                    System.out.println("2.KKN        || Harga : RP.35.000");
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan Pilihan : ");
                    pilihFilm = input.nextInt();
                    AllObjView.BioskopC.NamaBioskop();
                    String namaFilm = AllObjView.BioskopC.getDataNama(pilihFilm).getnamaFilm();
                    int harga = AllObjView.BioskopC.getDataNama(pilihFilm).getHarga();
                    AllObjView.BioskopC.addNamaBioskopUser(namaFilm, harga);
        
                    System.out.println("====================================================");
                    System.out.println("RUANGAN FILM");
                    System.out.println("-------------------------------------");
                    System.out.println("0.CINEMA 1");
                    System.out.println("1.CINEMA 2");
                    System.out.println("2.CINEMA 3");
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan Pilihan : ");
                    pilihRuang = input.nextInt();
                    AllObjView.BioskopC.RuangBioskop();
                    String ruangFilm = AllObjView.BioskopC.getDataRuang(pilihRuang).getruangFilm();
                    AllObjView.BioskopC.addRuangUser(ruangFilm);
        
                    System.out.println("====================================================");
                    System.out.println("KURSI");
                    System.out.println("-------------------------------------");
                    System.out.println("0. A1");
                    System.out.println("1. A2");
                    System.out.println("2. A3");
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan Pilihan : ");
                    pilihKursi = input.nextInt();
                    AllObjView.BioskopC.KursiBioskop();
                    String kursi = AllObjView.BioskopC.getDataKursi(pilihKursi).getKursi();
                    AllObjView.BioskopC.addKursiUser(kursi);
        
                    System.out.println("====================================================");
                    System.out.println("JAM");
                    System.out.println("-------------------------------------");
                    System.out.println("0. 09:00");
                    System.out.println("1. 11:00");
                    System.out.println("2. 13:00");
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan Pilihan : ");
                    PilihJam = input.nextInt();
                    AllObjView.BioskopC.JamBioskop();
                    String jam = AllObjView.BioskopC.getDataJam(PilihJam).getjam();
                    AllObjView.BioskopC.addJamUser(jam);
                break;

                case 3:
                    System.out.println("====================================================");
                    System.out.println("PILIH INDEX YANG DIHAPUS");
                    System.out.println("-------------------------------------");
                    System.out.print("Masukkan Pilihan : ");
                    hapus = input.nextInt();
                    AllObjView.LoginC.delete(hapus);
                    System.out.println("INDEX KE : "+hapus +" Berhasil Dihapus");

                break;

                case 4:
                    System.out.println("====================================================");
                    System.out.println("RIWAYAT TRANSAKSI");
                    int size = AllObjControllers.akun.getArrayList();
                    for (int i = 0; i < size; i++) {
                        System.out.println("-------------------------------------");
                        System.out.println("Index        : "+i);
                        System.out.println("Nama         : "+AllObjControllers.akun.getListLogin().get(i).getNama());
                        System.out.println("Email        : "+AllObjControllers.akun.getListLogin().get(i).getEmail());
                        System.out.println("No Telepon   : "+AllObjControllers.akun.getListLogin().get(i).getNoTelepon());
                        System.out.println("No Pembelian : "+AllObjControllers.akun.getListLogin().get(i).getKode());
    
                        System.out.println("Nama Film    : "+AllObjControllers.bioskop.getListFilmUser(i).getnamaFilm());
                        System.out.println("Harga        : "+AllObjControllers.bioskop.getListFilmUser(i).getHarga());
                        System.out.println("Ruang Film   : "+AllObjControllers.bioskop.getListRuangUser(i).getruangFilm());
                        System.out.println("Kursi        : "+AllObjControllers.bioskop.getListKursiUser(i).getKursi());
                        System.out.println("Jam          : "+AllObjControllers.bioskop.getListJamUser(i).getjam());
                    }
                   
                break;

            }
           


        }while (pilih != 0);
    }    
}
