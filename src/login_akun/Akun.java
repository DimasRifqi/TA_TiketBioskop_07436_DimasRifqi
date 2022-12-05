package login_akun;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Akun 
{
    public boolean log = false;
    protected String nama;
    protected String password;
    int pilih;
    Scanner input = new Scanner(System.in);
    List<String> nama1 = new ArrayList<>();
    List<String> pasword1 = new ArrayList<>();

    public void DaftarAkun ()
    {
        Akun objek1 = new Akun();
        System.out.print("Masukkan Username : ");
        objek1.nama= input.next();
        nama1.add(objek1.nama);

        System.out.print("Masukkan Password : ");
        objek1.password = input.next();
        pasword1.add(objek1.password);
    }
}
