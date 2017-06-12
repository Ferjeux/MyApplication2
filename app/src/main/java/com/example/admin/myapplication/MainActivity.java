package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.admin.myapplication.R.id.rep1;

public class MainActivity extends AppCompatActivity {

    private VraiOuFaux [] questions =new VraiOuFaux[]{
            new VraiOuFaux("arc ou lance?", "arc", "lance", "arc"),
            new VraiOuFaux("romain ou grec?","romain","grec","grec")
    };

    private int numero = 0;
    private Button reponse1;
    private Button reponse2;
    private TextView editText;
    private TextView editReponse ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        reponse1 =  (Button) findViewById(R.id.rep1);
        reponse2 = (Button) findViewById(R.id.rep2);
        editText = (TextView) findViewById(R.id.Question);
        editReponse = (TextView) findViewById(R.id.reponse);


        Edit();
    }

    private void Edit() {
        editText.setText(questions[numero].getQuestion());

        reponse1.setText(questions[numero].getRep1());

        reponse2.setText(questions[numero].getRep2());
    }

    public void click1(View view) {
        if (questions[numero].getBonneRep() == reponse1.getText()) {
            editReponse.setText("Bravo");
        }
        else{
            editReponse.setText("C'est faux");
        }
        if (questions.length -1 > numero) {
            numero++;
        }
        Edit();
    }

    public void click2(View view) {
        if (questions[numero].getBonneRep() == reponse2.getText()) {
            editReponse.setText("Bravo");
        } else {
            editReponse.setText("C'est faux");
        }
        if (questions.length -1 > numero) {
            numero++;
        }
        Edit();
    }
}
