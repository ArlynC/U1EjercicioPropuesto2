package com.example.u1ejerciciopropuesto2;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;

public class Multimedia2 extends AppCompatActivity {

    MediaPlayer mp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia2);

        mp = MediaPlayer.create(this, R.raw.musica);
        mp.start();
    }

    @Override
    protected void onResume()
    {
        super.onResume();
        mp.start();
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        mp.pause();
    }
}
