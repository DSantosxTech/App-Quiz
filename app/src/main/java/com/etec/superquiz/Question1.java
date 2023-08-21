package com.etec.superquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class Question1 extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);

    }

    public void Question2 (View view){
        RadioGroup botao = findViewById(R.id.optionsRadioGroup);

        int selectedId = botao.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton btn = findViewById(R.id.optionC);
        int ponto = getIntent().getIntExtra("pontinho", 0);
        String nome = getIntent().getStringExtra("nome");
        if (btn.isChecked()) {
            ponto += 1;
            Toast.makeText(this, "Você Acertou +1", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Errou resposta certa Brasília", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(Question1.this, Question2.class);
        intent.putExtra("pontinho", ponto);
        intent.putExtra("nome",nome);
        startActivity(intent);
    }
}
