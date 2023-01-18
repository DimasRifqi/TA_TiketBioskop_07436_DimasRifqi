package models;

import java.util.ArrayList;
import entity.*;

public class AkunModels 
{
    public int cek = 0;
    public ArrayList<LoginEntity> listLogin;
    private ArrayList<String> arrKode;

    public int getCek() 
    {
        return cek;
    }

    public AkunModels() 
    {
        this.listLogin = new ArrayList<>();
        this.arrKode = new ArrayList<>();
    }

    public void insert(LoginEntity login) 
    {
        listLogin.add(login);
    }

    public void getDataLogin(int index) 
    {
        listLogin.get(index);
    }

    public void set(LoginEntity login) 
    {
        listLogin.set(cek, login);
    }

    public void getKode(int index) 
    {
        arrKode.add("06" + index);
    }

    public String getDataKodeLogin(int index) 
    {
        String kode = arrKode.get(index++);
        return kode;
    }

    public String getDataKode(int i) 
    {
        String kode = null;
        for (i = 0; i < getArrKode(); i++) 
        {
            kode = arrKode.get(i);
        }
        return kode;
    }

    public ArrayList <LoginEntity> getListLogin() 
    {
        return listLogin;

    }

    public int jumlah_data_array_Login() 
    {
        return listLogin.size();
    }

    public int getArrayList() 
    {
        return listLogin.size();
    }

    public int getArrKode() 
    {
        return arrKode.size();
    }

    public LoginEntity getLogin(int index) {
        return listLogin.get(index);
    }

    public void setName(int index, String nama_baru) 
    {
        listLogin.get(index).setNama(nama_baru);
    }

    public void setEmail(int index, String emailBaru) 
    {
        listLogin.get(index).setEmail(emailBaru);
    }

    public void setPWEmail(int index, String PWEmailBaru) 
    {
        listLogin.get(index).setPWEmail(PWEmailBaru);
    }

    public void setNoTelepon(int index, String nomor_telepon_baru) 
    {
        listLogin.get(index).setNoTelepon(nomor_telepon_baru);
    }

    public void setPass(int index, String password_baru) 
    {
        listLogin.get(index).setPassword(password_baru);
    }

    public void delete(int index) 
    {
        listLogin.remove(index);
    } 
    

    public int cekLogin(String nama, String password) {
        for (int j = 0; j < listLogin.size(); j++) 
        {
            if (getLogin(j).getNama().equals(nama) && getLogin(j).getPass().equals(password)) {
                cek = j;
            } else {
                cek = -1;
            }
        }
        return cek;
    }

       
}
