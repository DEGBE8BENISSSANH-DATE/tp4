package com.example.tp4_degbe_benissanh;

import android.app.Application;

public class TP4Application extends Application {
    private int compteur;
    @Override
    public void onCreate(){
        super.onCreate();
        this.compteur=0;
    }

    public int getCompteur() {
        return compteur;
    }

    public void setCompteur(int compteur) {
        this.compteur = compteur;
    }

}
