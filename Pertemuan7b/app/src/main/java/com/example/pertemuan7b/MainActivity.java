package com.example.pertemuan7b;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText Edt1;
    TextView Lbl3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Edt1 = findViewById(R.id.Edt1);
        Lbl3 = findViewById(R.id.Lbl3);
    }

    public void Tampil_Nama(View v){
        Lbl3.setText("Nama anda adalah : \n \n " + Edt1.getText());
    }
}
