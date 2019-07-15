package com.example.pertemuan10a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnInt, btnExt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnInt = findViewById(R.id.btnInt);
        btnExt = findViewById(R.id.btnExt);
    }

    public void Internal(View v){
        Intent intent = new Intent(MainActivity.this, InternalActivity.class);
        startActivity(intent);
    }

    public void External(View v){
        Intent intent = new Intent(MainActivity.this, ExternalActivity.class);
        startActivity(intent);
    }

}
