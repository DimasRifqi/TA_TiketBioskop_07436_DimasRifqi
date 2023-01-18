package entity;

public class LoginEntity extends AkunEntity
{
    private String noTelpon,email,PWEmail;
    private int kode;
    public LoginEntity(String nama, String password, String email, String PWEmail, String noTelpon,int kode) 
    {
        super(nama, password);
        this.email = email;
        this.PWEmail = PWEmail;
        this.noTelpon = noTelpon;
        this.kode = kode;
    }

    //setter

    public int getKode() {
        return kode ;
    }

    public String getUsername()
    {
        return nama;
    }

    public String getPassword()
    {
        return password;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPWEmail()
    {
        return PWEmail;
    }

    public String getNoTelepon()
    {
        return noTelpon;
    }

    public String getNama()
    {
        return nama;
    }

    //getter
    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPWEmail(String PWEmail)
    {
        this.PWEmail= PWEmail;
    }

    public void setNoTelepon(String noTelepon) 
    {
        this.noTelpon = noTelepon;
    }

   
}
