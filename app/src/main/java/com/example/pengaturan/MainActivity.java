package com.example.pengaturan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.pengaturan_item, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        int id = item.getItemId();
        
        if (id == R.id.pengaturanakun) {
            Intent intent = new Intent(MainActivity.this, pengaturanakun.class);
            startActivity(intent);
        }
        else
            if (id == R.id.notifikasi){
                Intent intent = new Intent(MainActivity.this, notifikasi.class);
                startActivity(intent);
            }
            else
                 if (id == R.id.keamanan){
                     Intent intent = new Intent(MainActivity.this, keamanan.class);
                    startActivity(intent);
                 }
                else
                    if (id == R.id.info){
                        Intent intent = new Intent(MainActivity.this, info.class);
                        startActivity(intent);
                    }
                    else
                        if (id == R.id.keluar) {
                            Intent intent = new Intent(MainActivity.this, keluar.class);
                            startActivity(intent);
                        }

        return super.onOptionsItemSelected(item);
    }
}





