package com.example.pertemuan9a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText EdtNim, EdtNama, EdtKampus;
    TextView Lbl2, Lbl3, Lbl4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EdtNim = findViewById(R.id.EdtNim);
        EdtNama = findViewById(R.id.EdtNama);
        EdtKampus = findViewById(R.id.EdtKampus);
        Lbl2 = findViewById(R.id.Lbl2);
        Lbl3 = findViewById(R.id.Lbl3);
        Lbl4 = findViewById(R.id.Lbl4);
    }

    public void OK(View v){
        Lbl2.setText("NIM \t\t\t\t\t: " + EdtNim.getText());
        Lbl3.setText("Nama \t\t\t: " + EdtNama.getText());
        Lbl4.setText("Kampus \t: " + EdtKampus.getText());
    }
}
