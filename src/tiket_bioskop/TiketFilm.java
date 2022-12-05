package tiket_bioskop;
import java.util.ArrayList;
import java.util.Scanner;

public class TiketFilm 
{
    int i;
    String film,jam,kursi;
    Scanner input = new Scanner(System.in);
    ArrayList <Tiket> objek2 = new ArrayList<>();

    public void TiketFilm()
    {
        System.out.println("===============================================");
        System.out.print("Nama Film : ");
        film = input.next();
        System.out.print("Jam       : ");
        jam = input.next();
        System.out.print("Kursi     : ");
        kursi = input.next();

        System.out.println("===============================================");
        objek2.add(new Tiket(film,jam,kursi));

    }

    public void daftarTiket()
    {
        for ( i = 0 ; i < objek2.size() ; i++)
                            {
                                System.out.println("Daftar Tiket  ");
                                System.out.println("===============================================");
                                System.out.println("Nama Film : " + objek2.get(i).getFilm());
                                System.out.println("Jam       : " + objek2.get(i).getJam());
                                System.out.println("Kursi     : " + objek2.get(i).getKursi());
                                System.out.println("===============================================");
                          
                            }
    }

    public void editTiket()
    {
        System.out.println("===============================================");
                                System.out.print("Data Yang Dirubah : ");
                                i = input.nextInt();
                                System.out.print("Nama Film : ");
                                film = input.next();
                                System.out.print("Jam       : ");
                                jam = input.next();
                                System.out.print("Kursi     : ");
                                kursi = input.next();
                                objek2.set((i), (new Tiket(film,jam,kursi)));           
    }

    public void hapusTiket()
    {
        System.out.println("===============================================");
                                System.out.print("Data Yang Dihapus : ");
                                i = input.nextInt();
                                objek2.remove(i);
                                
    }
}
