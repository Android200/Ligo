package com.lagos.ligo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class ListAvailableHelp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_available_help);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        ArrayList <HelpersModel> helpersList = new ArrayList<HelpersModel>();

        HelpersAdapter helpersAdapter = new HelpersAdapter(R.layout.item_helpers,helpersList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        recyclerView.setAdapter(helpersAdapter);
        recyclerView.setHasFixedSize(true);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));
        helpersAdapter.notifyDataSetChanged();

        for(int i=0; i<100; i++){
            helpersList.add(new HelpersModel("Company Name" + i ,"Type of Help" + i));
        }


    }

}
