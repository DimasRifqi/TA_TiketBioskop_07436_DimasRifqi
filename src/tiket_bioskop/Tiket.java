package tiket_bioskop;
import java.util.ArrayList;
import java.util.Scanner;
class Tiket
{
    private String film;
    private String jam;
    private String kursi;
    Scanner input = new Scanner(System.in);
    ArrayList <Tiket> objek2 = new ArrayList<>();

    public String getFilm ()
    {
        return film;
    }

    public String getJam()
    {
        return jam;
    }

    public String getKursi()
    {
        return kursi;
    }

    public Tiket (String movie , String watch, String chair)
    {
        this.film = movie;
        this.jam = watch;
        this.kursi = chair;
    }
    

    
}