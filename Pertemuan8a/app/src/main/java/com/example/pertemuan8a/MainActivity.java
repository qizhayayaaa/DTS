package com.example.pertemuan8a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText Edt1, Edt2;
    TextView Lbl3;
    Button BtnTambah, BtnKurang, BtnKali, BtnBagi, BtnReset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edt1 = findViewById(R.id.Edt1);
        Edt2 = findViewById(R.id.Edt2);
        BtnTambah = findViewById(R.id.BtnTambah);
        BtnKurang = findViewById(R.id.BtnKurang);
        BtnKali = findViewById(R.id.BtnKali);
        BtnBagi = findViewById(R.id.BtnBagi);
        BtnReset = findViewById(R.id.BtnReset);
        Lbl3 = findViewById(R.id.Lbl3);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.optionmenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId()==R.id.menu1){
            startActivity(new Intent(this, GanjilGenap.class));
        }
        return true;
    }

    public void Tambah(View v){
        if (Edt1.getText().length()>0 && Edt2.getText().length()>0) {
            int input1 = Integer.parseInt(Edt1.getText().toString());
            int input2 = Integer.parseInt(Edt2.getText().toString());
            int hasil = input1 + input2;
            Lbl3.setText(input1+" + "+input2+" = "+hasil);
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void Kurang(View v){
        if (Edt1.getText().length()>0 && Edt2.getText().length()>0) {
            int input1 = Integer.parseInt(Edt1.getText().toString());
            int input2 = Integer.parseInt(Edt2.getText().toString());
            int hasil = input1 - input2;
            Lbl3.setText(input1+" - "+input2+" = "+hasil);
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void Kali(View v){
        if (Edt1.getText().length()>0 && Edt2.getText().length()>0) {
            int input1 = Integer.parseInt(Edt1.getText().toString());
            int input2 = Integer.parseInt(Edt2.getText().toString());
            int hasil = input1 * input2;
            Lbl3.setText(input1+" x "+input2+" = "+hasil);
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void Bagi(View v){
        if (Edt1.getText().length()>0 && Edt2.getText().length()>0) {
            int input1 = Integer.parseInt(Edt1.getText().toString());
            int input2 = Integer.parseInt(Edt2.getText().toString());
            int hasil = input1 / input2;
            Lbl3.setText(input1+" / "+input2+" = "+hasil);
        } else {
            Toast toast = Toast.makeText(MainActivity.this, "Mohon Masukkan Angka", Toast.LENGTH_LONG);
            toast.show();
        }
    }

    public void Reset(View v){
        Edt1.setText(null);
        Edt2.setText(null);
        Lbl3.setText("------");
    }
}
