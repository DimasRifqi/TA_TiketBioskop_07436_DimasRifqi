import java.util.Scanner;

import login_akun.Login;
import tiket_bioskop.TiketFilm;
public class Main
{
    public static void main(String[] args) throws Exception 
   {    
        Scanner input = new Scanner(System.in);
        Login objek3 = new Login();
        TiketFilm objtiket = new TiketFilm();
        int pilih;

        do
        {
            System.out.println("1.Daftar Akun   ");
            System.out.println("2.Login Akun    ");
            System.out.println("Ketik 0 Exit");
            System.out.print("Masukkan Pilihan : ");
            pilih = input.nextInt();

            switch (pilih)
            {
                case 1 :
                objek3.DaftarAkun();
                break;

                case 2:
                objek3.login();
                if (objek3.log == true)
                {
                    do{
                        System.out.println("1.Pesan Tiket   ");
                        System.out.println("2.Edit Tiket   ");
                        System.out.println("3.Hapus Tiket   ");
                        System.out.println("4.Daftar Tiket   ");
                        System.out.print("Masukkan Pilihan : ");
                        pilih = input.nextInt();
                        switch (pilih)
                        {
                            case 1 :
                                objtiket.TiketFilm();
                                System.out.print("Tekan -1 untuk kembali ke menu (-1) : ");
                                pilih = input.nextInt();
                        
                            break;
    
                            case 2:
                                objtiket.editTiket();
                                System.out.print("Tekan -1 untuk kembali ke menu (-1) : ");
                                pilih = input.nextInt();
                                System.out.println("===============================================");
                    
                            break;
    
                            case 3:
                                objtiket.hapusTiket();
                                System.out.print("Tekan -1 untuk kembali ke menu (-1) : ");
                                pilih = input.nextInt();
                                System.out.println("===============================================");
    
                            break;
    
                            case 4:
                            objtiket.daftarTiket();
                            System.out.print("Tekan -1 untuk kembali ke menu (-1) : ");
                            pilih = input.nextInt();
    
                            break;
                        }

                    }while(pilih == -1);
                
                }
                else if (objek3.log == false)
                {
                    System.out.println("Periksa Password dan Username Anda");
                }

            }
            
        }while (pilih != 0);
        
         
    }
}
 