package com.example.idnplaboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class InformationActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information);

        TextView txt_cui = findViewById(R.id.txt_cui);
        TextView txt_dni = findViewById(R.id.txt_dni);
        TextView txt_nombres = findViewById(R.id.txt_nombres);
        TextView txt_apellidos = findViewById(R.id.txt_apellidos);

        Intent intentRecibirRegistro = getIntent();
        String cui = intentRecibirRegistro.getStringExtra("cui");
        String dni = intentRecibirRegistro.getStringExtra("dni");
        String nombres = intentRecibirRegistro.getStringExtra("nombres");
        String apellidos = intentRecibirRegistro.getStringExtra("apellidos");

        txt_cui.setText(cui);
        txt_dni.setText(dni);
        txt_nombres.setText(nombres);
        txt_apellidos.setText(apellidos);
    }
}