package controllers;

import java.util.ArrayList;

import entity.LoginEntity;

public class LoginControllers implements InterfaceControllers
{
    private int cekLogin = 0;
    public int kode = 0;
    ArrayList <LoginEntity> objLogin = new ArrayList<>();
    
    public int getKode() {
        return kode;
    }

    public int getCekLogin() {
        return this.cekLogin;
    }

    public int search(String nama, int kodeIndex) {
        for (int i = 0; i < AllObjControllers.akun.getArrayList(); i++) {
            if (nama.equals(AllObjControllers.akun.listLogin.get(i).getNama()) && kodeIndex == getKode()) {
                return i;
            }
        }
        return -1;
    }
    
    public LoginEntity getData(int index) 
    {
        return AllObjControllers.akun.getLogin(index);
    }

    public void npmAdd(int index) 
    {
        AllObjControllers.akun.getKode(index);
    }

    public LoginEntity getDataLogin() {
        return AllObjControllers.akun.getLogin(cekLogin);
    }

    public void reg(String nama, String password, String email, String PWEmail, String noTelpon ) 
    {
        AllObjControllers.akun.insert(new LoginEntity(nama, password, email, PWEmail, noTelpon,kode++));
    }

    public void set(String nama, String password, String email, String PWEmail, String noTelpon) {
        AllObjControllers.akun.set(new LoginEntity(nama, password, email, PWEmail, noTelpon,kode));
    }

    @Override
    public int login (String nama, String pasword) 
    {
        cekLogin = AllObjControllers.akun.cekLogin(nama, pasword);
        return cekLogin;
    }

    public int getArrayList() {
        return AllObjControllers.akun.getArrayList();
    }

    public int getArrNpmSize() {
        return AllObjControllers.akun.getArrKode();
    }

    public void setName(String newName) 
    {
        AllObjControllers.akun.setName(cekLogin, newName);
    }

    public void setEmail(String newEmail) 
    {
        AllObjControllers.akun.setEmail(cekLogin, newEmail);
    }

    public void setPWEmail(String newPWEmail) 
    {
        AllObjControllers.akun.setPWEmail(cekLogin, newPWEmail);
    }

    public void setNotTlp(String noTelepon) 
    {
        AllObjControllers.akun.setNoTelepon(cekLogin, noTelepon);
    }

    public void setPass(String newPass) 
    {
        AllObjControllers.akun.setPass(cekLogin, newPass);
    }

    public void delete(int index) 
    {
        AllObjControllers.akun.delete(index);
    }

   
}
