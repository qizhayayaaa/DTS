package com.example.pertemuan8a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class GanjilGenap extends AppCompatActivity {

    EditText EdtBilangan;
    TextView LblBilangan;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ganjil_genap);

        EdtBilangan = findViewById(R.id.EdtBilangan);
        LblBilangan = findViewById(R.id.LblBilangan);
    }

    public void Hitung(View v){
        String masukkan = EdtBilangan.getText().toString();
        int angka = Integer.parseInt(masukkan);
        int b = angka % 2;

        if (b == 0) {
            LblBilangan.setText("[Angka "+ angka +" adalah Bilangan Genap ]");
        }else {
            LblBilangan.setText("[Angka "+ angka +" adalah Bilangan Ganjil ]");
        }
    }

    public void Reset(View v){
        EdtBilangan.setText(null);
        LblBilangan.setText("------");
    }
}
