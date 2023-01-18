package entity.menu_film;

public abstract class Film
{
    public abstract String namafilm();
    public abstract String hargaTiket();

    public void cetakfilm()
    {
        System.out.println(this.namafilm() + " ||              "+this.hargaTiket());

    }
}


