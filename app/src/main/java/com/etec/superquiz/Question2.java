package com.etec.superquiz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Question2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);
    }

    public void Question3(View view) {
        RadioGroup botao = findViewById(R.id.optionsRadioGroup1);

        int selectedId = botao.getCheckedRadioButtonId();
        if (selectedId == -1) {
            Toast.makeText(this, "Selecione uma opção", Toast.LENGTH_SHORT).show();
            return;
        }

        RadioButton btn = findViewById(R.id.optionA1);
        int ponto = getIntent().getIntExtra("pontinho", 0);
        String nome = getIntent().getStringExtra("nome");

        if (btn.isChecked()) {
            ponto += 1;
            Toast.makeText(this, "Você Acertou +1", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Errou resposta certa Paris", Toast.LENGTH_SHORT).show();
        }

        Intent intent = new Intent(Question2.this, Question3.class);
        intent.putExtra("pontinho", ponto);
        intent.putExtra("nome", nome);
        startActivity(intent);
    }
}