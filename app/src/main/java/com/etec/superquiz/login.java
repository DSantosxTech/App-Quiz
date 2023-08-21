package com.etec.superquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;



public class login extends AppCompatActivity {

    private EditText nomeEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        nomeEditText = findViewById(R.id.txtUser);
    }

    public void comecarQuiz(View view) {
        String nome = nomeEditText.getText().toString();

        if (!nome.isEmpty()) {
            Toast.makeText(this, "Bem-vindo", Toast.LENGTH_SHORT).show();

            Intent intent = new Intent(login.this, Question1.class);
            intent.putExtra("nome", nome);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Por favor, insira seu nome", Toast.LENGTH_SHORT).show();
        }
    }
}