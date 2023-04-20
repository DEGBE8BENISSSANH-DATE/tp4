package com.example.tp4_degbe_benissanh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.tp4_degbe_benissanh.databinding.ActivityInfosBinding;
import com.example.tp4_degbe_benissanh.databinding.ActivityMainBinding;

public class InfosActivity extends AppCompatActivity {
private ActivityInfosBinding  ui;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ui=ActivityInfosBinding.inflate(getLayoutInflater());
        setContentView(ui.getRoot());
        setTitle("Information" );
        ui.bouton7.setOnClickListener(this::onClickBouton7);

    }
    private void onClickBouton7(View view){
        finish();
    }
}