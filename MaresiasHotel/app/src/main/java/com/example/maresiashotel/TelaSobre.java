package com.example.maresiashotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaSobre extends AppCompatActivity {

    private Button bt_home;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_sobre);

        getSupportActionBar().hide();
        IniciarCOmponentes();

        bt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaSobre.this, TelaHome.class);
                startActivity(intent);
            }
        });
    }
    private void IniciarCOmponentes() {

        bt_home = findViewById(R.id.bt_home);


    }
}