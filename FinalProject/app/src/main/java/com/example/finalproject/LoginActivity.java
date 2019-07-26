package com.example.finalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class LoginActivity extends AppCompatActivity {

    EditText editUser, editPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        editUser = findViewById(R.id.editUsername);
        editPass = findViewById(R.id.editPassword);
    }

    public void Login(View v){
        if (editUser.getText().toString().equals("admin") && editPass.getText().toString().equals("admin")){
            startActivity(new Intent(this, MainActivity.class));
    } else {
            Toast.makeText(this, "Username dan Password salah", Toast.LENGTH_SHORT).show();
        }
    }
}
