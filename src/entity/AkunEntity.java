package entity;

public class AkunEntity 
{
    protected String nama;
    protected String password;

    //constructor
    public AkunEntity(String nama, String password)
    {
        this.nama = nama;
        this.password = password;
    }

    //getter
    public String getNama()
    {
        return nama;
    }

    public String getPass()
    {
        return password;
    }

    //setter
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setPass(String password)
    {
        this.password = password;
    }

}
