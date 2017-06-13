package com.example.admin.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        int score = intent.getIntExtra("param", 0);
        TextView editText = (TextView) findViewById(R.id.result);
        editText.setText("vous avez :"+score);

    }

    public void clickTA(View view) {
        Intent nouvelle = new Intent(ActivityResult.this, MainActivity.class);
        startActivity(nouvelle);
        finish();
    }
}
