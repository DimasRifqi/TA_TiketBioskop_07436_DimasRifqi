package entity;

public class NamaFilmEntity
{
    private int harga;
    private String namaFilm;
    
    public NamaFilmEntity(String namaFilm, int harga)
    {
        this.namaFilm = namaFilm;
        this.harga = harga;
      
    }

    public int getHarga() 
    {
        return harga;
    }

    public String getnamaFilm() 
    {
        return namaFilm;
    }

    public void setHarga(int harga) 
    {
        this.harga = harga;
    }

    public void setNama(String namaFilm) 
    {
        this.namaFilm = namaFilm;
    }  

}
