package com.example.u1ejerciciopropuesto2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true; /** true -> el menú ya está visible */
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.accion_salir) {
            finish();
            return true;
        }

        if (id == R.id.activity_multimedia) {
            startActivity(new Intent(this, Multimedia.class));
            return true;
        }
        if (id == R.id.activity_login) {
            startActivity(new Intent(this, Login.class));
            return true;
        }

        return super.onOptionsItemSelected(item);


    }

}
