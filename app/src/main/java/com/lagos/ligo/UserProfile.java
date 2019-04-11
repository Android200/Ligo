package com.lagos.ligo;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UserProfile extends AppCompatActivity {
    Spinner spinner;
    FloatingActionButton floatingActionButton;
    ArrayAdapter<String> Helpers;
    String[] helpers = {"Assignment","House Chores"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_profile);
        spinner = findViewById(R.id.spinner);
        floatingActionButton =  findViewById(R.id.floatingActionButton);

        Helpers = new ArrayAdapter<>(UserProfile.this, android.R.layout.simple_list_item_1, helpers);
        spinner.setAdapter(Helpers);

        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(UserProfile.this, AskForHelp.class));
            }
        });



    }
}
