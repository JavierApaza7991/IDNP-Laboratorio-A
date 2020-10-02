package com.example.laboratorio3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.music_file);

        Button btn_pause = findViewById(R.id.btn_pause);
        Button btn_restart = findViewById(R.id.btn_restart);

        // botón para pausar el audio
        btn_pause.setOnClickListener(v -> {
            pausarAudio();
        });
        // botón para reanudar el audio
        btn_restart.setOnClickListener(v -> {
            reiniciarAudio();
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        reiniciarAudio();
    }

    @Override
    protected void onPause() {
        super.onPause();
        pausarAudio();
    }

    void pausarAudio() {
        mediaPlayer.pause();
    }

    void reiniciarAudio() {
        mediaPlayer.start();
    }
}