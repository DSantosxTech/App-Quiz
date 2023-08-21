package com.etec.superquiz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Result extends AppCompatActivity {

    private TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        int pontos = getIntent().getIntExtra("pontinho", 0);
        String nome = getIntent().getStringExtra("nome");

        TextView textViewPontos = findViewById(R.id.scoreValue);
        textViewPontos.setText("Pontos: " + pontos);

        resultadoTextView = findViewById(R.id.feedbackText);

        if (pontos <= 1) {
            resultadoTextView.setText("Oh não, " + nome + ", sua nota foi baixa. Tente novamente.\uD83D\uDE41");
        } else if (pontos<=2) {
            resultadoTextView.setText("Quase, " + nome + ", sua nota foi Media. Tente novamente.\uD83D\uDE2C");
        } else if (pontos<=3) {
            resultadoTextView.setText("Parabéns, " + nome + ", você concluiu o quiz!\uD83D\uDE01");
        }
    }

    public void voltarQuiz(View view) {
        Intent intent = new Intent(Result.this, login.class);
        startActivity(intent);
    }
}