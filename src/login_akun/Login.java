package login_akun;
public class Login extends Akun 
{
    public void DaftarAkun ()
    {
       
        System.out.print("Masukkan Username : ");
        super.nama= input.next();
        nama1.add(super.nama);

        System.out.print("Masukkan Password : ");
        super.password = input.next();
        pasword1.add(super.password);
    }

    public void login()
    {
        System.out.print("Masukkan Username : ");
        String usr = input.next();
        System.out.print("Masukkan Password : ");
        String pw = input.next();
         
        if(usr.equals(nama1.get(0)) || pw.equals(pasword1.get(0)))
        {
            
            System.out.println("\nAkun Anda Berhasil Login\n");
            log =true;
            
        }
        
        else 
        {
            System.out.println("\nHarap Masukkan ID dan Password yang benar\n");
            log = false;
            
        }
    }
}
