package com.example.pertemuan10a;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class ExternalActivity extends AppCompatActivity {
    public static final String FILENAME = "namafile.txt";
    TextView textBaca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_external);
        textBaca = findViewById(R.id.textBaca);
    }

    public void buatFile(View v) {
        String isiFile = "Coba Isi Data File Text";
        String kondisi = Environment.getExternalStorageState();

        if (!Environment.MEDIA_MOUNTED.equals(kondisi)){
            return;
        }

        File file = new File(getExternalFilesDir(null), "namafile.txt");

        FileOutputStream outputStream = null;
        try {
            file.createNewFile();
            outputStream = new FileOutputStream(file, true);
            outputStream.write(isiFile.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ubahFile(View v) {
        String ubah = "Update Isi Data File Text";
        String kondisi = Environment.getExternalStorageState();

        if (!Environment.MEDIA_MOUNTED.equals(kondisi)){
            return;
        }

        File file = new File(getExternalFilesDir(null), "namafile.txt");

        FileOutputStream outputStream = null;
        try {
            file.createNewFile();
            outputStream = new FileOutputStream(file, false);
            outputStream.write(ubah.getBytes());
            outputStream.flush();
            outputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void bacaFile(View v) {
        File sdcard = getExternalFilesDir(null);
        File file = new File(getExternalFilesDir(null), FILENAME);

        if(file.exists()) {
            StringBuilder text = new StringBuilder();

            try {
                BufferedReader br = new BufferedReader(new FileReader(file));

                String line = br.readLine();

                while (line != null) {
                    text.append(line);
                    line = br.readLine();
                }
                br.close();
            } catch (IOException e) {
                System.out.println("Error " + e.getMessage());
            }
            textBaca.setText(text.toString());
        }
    }

    public void hapusFile(View v) {
        File file = new File(getExternalFilesDir(null), FILENAME);
        if (file.exists()) {
            file.delete();
        }
    }
}
