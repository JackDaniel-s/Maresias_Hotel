package com.example.maresiashotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class QuartoTerceiro extends AppCompatActivity {

    private Button bt_home;
    private Button bt_agendarReserva3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarto_terceiro);

        getSupportActionBar().hide();
        IniciarCOmponentes();

        bt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuartoTerceiro.this, TelaHome.class);
                startActivity(intent);
            }
        });
        bt_agendarReserva3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuartoTerceiro.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
    private void IniciarCOmponentes() {

        bt_home = findViewById(R.id.bt_home);
        bt_agendarReserva3 = findViewById(R.id.bt_agendarReserva3);


    }
}