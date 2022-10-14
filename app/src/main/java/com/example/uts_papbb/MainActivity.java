package com.example.uts_papbb;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etUsername, etPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUsername = findViewById(R.id.et_username);
        etPassword = findViewById(R.id.et_password);
        btnLogin = findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usernameKey = etUsername.getText().toString();
                String passwordKey = etPassword.getText().toString();

                if (usernameKey.equals("pakjoko") && passwordKey.equals("yangpentingcuan")){
                    Intent intent = new Intent(MainActivity.this, InputData.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                }

                else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username atau Password anda salah").setNegativeButton("Retry", null).create().show();
                    etUsername.setText("");
                    etPassword.setText("");
                }
            }
        });
    }
}