package com.sqlkomputer.latih04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText etUser = findViewById(R.id.etUsername);
        EditText etPass = findViewById(R.id.etPassword);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(view -> {
            //Mengosongkan Text
            etUser.setText("");
            etPass.setText("");
            etUser.requestFocus();
        });
        btLogin.setOnClickListener(view -> {
            etUser.setText("");
            etPass.setText("");
            Toast.makeText(this, "Selamat, Berhasil Login", Toast.LENGTH_SHORT).show();
        });

    }
}
