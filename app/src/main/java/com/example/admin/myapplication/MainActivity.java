package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.admin.myapplication.R.id.rep1;

public class MainActivity extends AppCompatActivity {

    private VraiOuFaux [] questions;

    private int numero = 0;
    private int score =0;
    private Button reponse1;
    private Button reponse2;
    private TextView editText;
    private TextView editReponse ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        questions =  new VraiOuFaux[]{
                new VraiOuFaux(getString(R.string.Q1), getString(R.string.R11), getString(R.string.R12), getString(R.string.R11)),
                new VraiOuFaux(getString(R.string.Q2),getString(R.string.R21),getString(R.string.R22),getString(R.string.R22)),
                new VraiOuFaux(getString(R.string.Q3),getString(R.string.R31),getString(R.string.R32),getString(R.string.R31)),
                new VraiOuFaux(getString(R.string.Q4),getString(R.string.R41),getString(R.string.R42),getString(R.string.R41)),
                new VraiOuFaux(getString(R.string.Q5),getString(R.string.R51),getString(R.string.R52),getString(R.string.R52))
        };

        setContentView(R.layout.activity_main);

        reponse1 =  (Button) findViewById(R.id.rep1);
        reponse2 = (Button) findViewById(R.id.rep2);
        editText = (TextView) findViewById(R.id.Question);
        editReponse = (TextView) findViewById(R.id.reponse);


        Edit();
    }
    private void afficher(int score){
        Intent intent = new Intent(MainActivity.this, ActivityResult.class);
        intent.putExtra("param", score);
        startActivity(intent);
        finish();
    }


    private void Edit() {
        editText.setText(questions[numero].getQuestion());

        reponse1.setText(questions[numero].getRep1());

        reponse2.setText(questions[numero].getRep2());
    }

    public void click1(View view) {
        if (questions[numero].getBonneRep() == reponse1.getText()) {
            editReponse.setText(R.string.Bravo);
            score++;
        }
        else{
            editReponse.setText(R.string.C_est_faux);
        }
        if (questions.length -1 > numero) {
            numero++;
        }
        else{
            this.afficher(score);
        }
        Edit();
    }

    public void click2(View view) {
        if (questions[numero].getBonneRep() == reponse2.getText()) {
            editReponse.setText(R.string.Bravo);
            score++;
        } else {
            editReponse.setText(R.string.C_est_faux);
        }
        if (questions.length -1 > numero) {
            numero++;
        }
        else{
            this.afficher(score);
        }
        Edit();
    }
}
