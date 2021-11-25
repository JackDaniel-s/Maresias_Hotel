package com.example.maresiashotel;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaHome extends AppCompatActivity {

    private Button bt_agendamento1, bt_agendamento2, bt_agendamento3, bt_localizacao, bt_sobre;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_home);

        getSupportActionBar().hide();
        IniciarCOmponentes();

        bt_sobre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaHome.this, TelaSobre.class);
                startActivity(intent);
            }
        });
        bt_agendamento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaHome.this, QuartoPrimeiro.class);
                startActivity(intent);
            }
        });
        bt_agendamento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaHome.this, QuartoSegundo.class);
                startActivity(intent);
            }
        });
        bt_agendamento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaHome.this, QuartoTerceiro.class);
                startActivity(intent);
            }
        });
        bt_localizacao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(TelaHome.this, TelaLocalizacao.class);
                startActivity(intent);
            }
        });

    }
        private void IniciarCOmponentes() {

            bt_localizacao = findViewById(R.id.bt_localizacao);
            bt_sobre = findViewById(R.id.bt_sobre);
            bt_agendamento1 = findViewById(R.id.agendamento1);
            bt_agendamento2 = findViewById(R.id.agendamento2);
            bt_agendamento3 = findViewById(R.id.agendamento3);


    }
}