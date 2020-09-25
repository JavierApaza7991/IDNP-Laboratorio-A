package com.example.idnplaboratorio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edt_cui = findViewById(R.id.edt_cui);
        EditText edt_dni = findViewById(R.id.edt_dni);
        EditText edt_nombres = findViewById(R.id.edt_nombres);
        EditText edt_apellidos = findViewById(R.id.edt_apellidos);

        Button btn_registro = findViewById(R.id.btn_registrar);
        btn_registro.setOnClickListener(v -> {

            String cui = edt_cui.getText().toString();
            String dni = edt_dni.getText().toString();
            String nombres = edt_nombres.getText().toString();
            String apellidos = edt_apellidos.getText().toString();

            Intent intendEnviarRegistro = new Intent(MainActivity.this, InformationActivity.class);

            intendEnviarRegistro.putExtra("cui", cui);
            intendEnviarRegistro.putExtra("dni", dni);
            intendEnviarRegistro.putExtra("nombres", nombres);
            intendEnviarRegistro.putExtra("apellidos", apellidos);

            startActivity(intendEnviarRegistro);
        });
    }
}