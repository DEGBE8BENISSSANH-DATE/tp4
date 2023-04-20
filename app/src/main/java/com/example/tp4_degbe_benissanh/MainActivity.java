package com.example.tp4_degbe_benissanh;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.tp4_degbe_benissanh.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
 private static final String TAG= "TP4";
 private ActivityMainBinding ui;

    // private int compteur=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

// initialisation interne de l'activité
super.onCreate(savedInstanceState);
// mise en place du layout
ui=ActivityMainBinding.inflate(getLayoutInflater());
setContentView(ui. getRoot());
// titre de l'activité
setTitle(getLocalClassName());
// message d'information
Log.i(TAG, "dans "+getLocalClassName()+".onCreate");
//recuperation de l'object java
        TextView text= findViewById(R.id.text);
//CHANGEMENT DU TEXT EN BONJOUR
        text.setText("bonjour");
//recuperation des information
Intent intent=getIntent();
String username= intent.getStringExtra("username");
ui.text.setText("Bienvenue "+username);
        //ecouteur   pour le bouton2
ui.bouton2.setOnClickListener(btn ->{
    TP4Application app=(TP4Application)getApplicationContext();
    int compteur =app.getCompteur();
    //compteur+=2;
    ui.text.setText("compteur= "+compteur);
});
//ecouteur pour le bouton 3 , reference a une methode
 ui.bouton3.setOnClickListener(this::onBouton3Click);
   ui.bouton4.setOnClickListener(this);
   ui.bouton5.setOnClickListener(this::onBouton5Click);
   ui.bouton6.setOnClickListener(this::onBouton6Click);
   ui.bouton7.setOnClickListener(this::onBouton7Click);
    }
//


    //methode  d'appel du bouton 1
    public void onBouton1Click(View view){
        TP4Application app=(TP4Application)getApplicationContext();
        int compteur =app.getCompteur();
       // compteur+=1;
        ui.text.setText("compteur= "+compteur);
    }

    //methode  d'appel du bouton 5
    private void onBouton5Click(View view){
        Intent intent=new Intent(MainActivity.this,InfosActivity.class );
        startActivity(intent);
        }

    //methode  d'appel du bouton 6
    private void onBouton6Click(View view){
        Intent intent=new Intent(this,InfosActivity.class );
        startActivity(intent);
        finish();
    }

    //methode  d'appel du bouton 7
    private void onBouton7Click(View view){
        String url= "https://perso.univ-rennes1.fr/pierre.nerzic/Android";
        Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(url) );
        startActivity(intent);

    }
    //methode  d'appel du bouton 3
    private void onBouton3Click(View view){
        TP4Application app=(TP4Application)getApplicationContext();
        int compteur =app.getCompteur();
        // compteur*=2;
        ui.text.setText("compteur= "+compteur);
    }
    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.i(TAG,"dans "+getLocalClassName()+" .onDestroy");

    }
    @Override
    protected  void  onPause(){
        super.onPause();
        Log.i(TAG, "dans "+getLocalClassName()+" onPause()");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Log.i(TAG,"dans "+getLocalClassName()+" .onResume");
    }



@Override
    public void onClick(View view){
    TP4Application app=(TP4Application)getApplicationContext();
    int compteur =app.getCompteur();
        compteur *=5;
        ui.text.setText("compteur = "+compteur);
}
}