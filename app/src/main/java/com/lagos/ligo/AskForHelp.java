package com.lagos.ligo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AskForHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_for_help);

        Button submitButton = findViewById(R.id.button3);
        Button cancelButton = findViewById(R.id.button4);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Request sent", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AskForHelp.this, MainActivity.class));

            }
        });
        cancelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Request canceled", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(AskForHelp.this, MainActivity.class));
            }
        });
    }
}