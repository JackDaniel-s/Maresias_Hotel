package com.example.maresiashotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class QuartoSegundo extends AppCompatActivity {

    private Button bt_home;
    private Button bt_agendarReserva2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quarto_segundo);

        getSupportActionBar().hide();
        IniciarCOmponentes();

        bt_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuartoSegundo.this,TelaHome.class);
                startActivity(intent);
            }
        });
        bt_agendarReserva2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(QuartoSegundo.this,MainActivity.class);
                startActivity(intent);
            }
        });


    }
    private void IniciarCOmponentes() {

        bt_home = findViewById(R.id.bt_home);
        bt_agendarReserva2 = findViewById(R.id.bt_agendarReserva2);


    }
}