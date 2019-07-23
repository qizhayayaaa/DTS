package com.example.pertemuan15;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText User, Pass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        User = findViewById(R.id.User);
        Pass = findViewById(R.id.Pass);
    }

    public void Login(View v){
        String username = User.getText().toString();
        String password = Pass.getText().toString();
        if(username.equals("Admin") && password.equals("ADMIN")) {
            Intent intent = new Intent(MainActivity.this, MenuUtama.class);
            MainActivity.this.startActivity(intent);
            finish();
        }else{
            Toast.makeText(this, "Username dan Password salah", Toast.LENGTH_LONG).show();
        }
    }

}
