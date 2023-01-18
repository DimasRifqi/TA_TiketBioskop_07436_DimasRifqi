package models;

import java.util.ArrayList;
import entity.*;

public class BioskopModels 
{
    public ArrayList<NamaFilmEntity> listNamaFilm;
    public ArrayList<RuangFilmEntity> listRuangFilm;
    public ArrayList<kursiEntity> listKursiFilm;
    public ArrayList<JamEntity> listJamFilm;
    public ArrayList<NamaFilmEntity> AddArrFilm;
    public ArrayList<RuangFilmEntity> AddArrRuang;
    public ArrayList<kursiEntity> AddArrKursi;
    public ArrayList<JamEntity> AddArrJam;

    public BioskopModels() 
    {
        
        listNamaFilm = new ArrayList<>();
        listRuangFilm = new ArrayList<>();
        listKursiFilm = new ArrayList<>();
        listJamFilm = new ArrayList<>();
        AddArrFilm = new ArrayList<>();
        AddArrRuang = new ArrayList<>();
        AddArrKursi = new ArrayList<>();
        AddArrJam = new ArrayList<>();
        
    }

    //nama
    public void insertNama(NamaFilmEntity NamaFilm) 
    {
        listNamaFilm.add(NamaFilm);
    }

    public NamaFilmEntity getListNamaFilm(int index) 
    {
        return listNamaFilm.get(index);
    }

    public void insertNamaFilm(NamaFilmEntity addNamaFilm)
    {
        this.AddArrFilm.add(addNamaFilm);
    }
    public NamaFilmEntity getListFilmUser(int index){
        return AddArrFilm.get(index);
    }
    
    //ruang
    public void insertRuang(RuangFilmEntity ruangFilm) 
    {
        listRuangFilm.add(ruangFilm);
    }

    public RuangFilmEntity getListRuangFilm(int index) 
    {
        return listRuangFilm.get(index);
    } 

    public void insertRuangFilm(RuangFilmEntity addRuangFilm)
    {
        this.AddArrRuang.add(addRuangFilm);
    }
    public RuangFilmEntity getListRuangUser(int index){
        return AddArrRuang.get(index);
    }

    //kursi
    public void insertKursi(kursiEntity kursi) 
    {
        listKursiFilm.add(kursi);
    }


    public kursiEntity getListKursiFilm(int index) 
    {
        return listKursiFilm.get(index);
    } 

    public void insertKursiFilm(kursiEntity addKursiFilm)
    {
        this.AddArrKursi.add(addKursiFilm);
    }

    public kursiEntity getListKursiUser(int index){
        return AddArrKursi.get(index);
    }

    
    //jam
    public void insertJam(JamEntity jam) 
    {
        listJamFilm.add(jam);
    }

    public JamEntity getListJamFilm(int index) 
    {
        return listJamFilm.get(index);
    } 

    public void insertJamFilm(JamEntity addJamFilm)
    {
        this.AddArrJam.add(addJamFilm);
    }

    public JamEntity getListJamUser(int index){
        return AddArrJam.get(index);
    }

    public int cek = 0;

    public int getCek() 
    {
        return cek;
    }

    public void setNama(NamaFilmEntity film) 
    {
        listNamaFilm.set(cek, film);
    }

    public void setKursi(kursiEntity kursi) 
    {
        listKursiFilm.set(cek, kursi);
    }

    public void setRuang(RuangFilmEntity ruang) 
    {
        listRuangFilm.set(cek, ruang);
    }

    public void setJam(JamEntity jam) 
    {
        listJamFilm.set(cek, jam);
    }

   
}
