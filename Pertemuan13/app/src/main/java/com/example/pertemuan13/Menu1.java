package com.example.pertemuan13;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Menu1 extends AppCompatActivity {

    TextView DtHasil;
    EditText InNIM, InNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu1);

        DtHasil = findViewById(R.id.DtHasil);
        InNIM = findViewById(R.id.InNIM);
        InNama = findViewById(R.id.InNama);
    }

    public void Tampil(View view) {
        DtHasil.setText(InNama.getText() + " (" + InNIM.getText() + ") ");
    }
}
