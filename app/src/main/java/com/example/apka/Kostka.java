package com.example.apka;

import android.view.View;

import java.util.ArrayList;

public class Kostka {
    private int wartosc;
    private int idObrazka;
    private boolean czy;
    private int wylosowana;
    private ArrayList<Integer> obrazki = new ArrayList<>();

    public Kostka() {
        UstawObrazek();
        this.wartosc = (int)(Math.random()*6+1);
        this.czy=false;
        this.idObrazka=obrazki.get(wartosc-1);
    }
    private void UstawObrazek(){
        obrazki.add(R.drawable.dice_1);
        obrazki.add(R.drawable.dice_2);
        obrazki.add(R.drawable.dice_3);
        obrazki.add(R.drawable.dice_4);
        obrazki.add(R.drawable.dice_5);
        obrazki.add(R.drawable.dice_6);
    }

    public int getWylosowana() {
        return wylosowana;
    }

    public void setWylosowana(int wylosowana) {
        this.wylosowana = wylosowana;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public int getIdObrazka() {
        return idObrazka;
    }

    public void setIdObrazka(int idObrazka) {
        this.idObrazka = idObrazka;
    }

    public boolean isCzy() {
        return czy;
    }

    public void setCzy(boolean czy) {
        this.czy = czy;
    }

    public ArrayList<Integer> getObrazki() {
        return obrazki;
    }

    public void setObrazki(ArrayList<Integer> obrazki) {
        this.obrazki = obrazki;
    }

    public int losuj(){
        this.wartosc = (int)(Math.random()*6+1);
        this.idObrazka=obrazki.get(wartosc-1);
        return this.idObrazka;
    }
}
