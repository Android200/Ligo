package com.lagos.ligo;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class HelpersAdapter extends RecyclerView.Adapter<HelpersAdapter.MyViewHolder> {
    private int listItem;
    private ArrayList<HelpersModel> helpersModelList;
    private Context context;

    public HelpersAdapter( int listItem, ArrayList<HelpersModel> helpersModelList){
        this.helpersModelList = helpersModelList;
        this.listItem = listItem;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(listItem, parent, false) ;

        return new  MyViewHolder(itemView);
    }
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder,final int position) {
        final HelpersModel helpersModel = helpersModelList.get(position);
        myViewHolder.company_name.setText(helpersModelList.get(position).getCompany_name());
        myViewHolder.type_of_help.setText(helpersModelList.get(position).getType_of_help());

        myViewHolder.ask_help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, " "+helpersModel.getType_of_help(), Toast.LENGTH_SHORT).show();
                context.startActivity(new Intent(context, AskForHelp.class));
            }
        });
    }


    @Override
    public int getItemCount() {
        return helpersModelList == null ? 0 :  helpersModelList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView company_name, type_of_help;
        public Button ask_help;

        public MyViewHolder(View view){
            super(view);
            company_name = view.findViewById(R.id.textView6);
            type_of_help = view.findViewById(R.id.textView7);
            ask_help = view.findViewById(R.id.buttonView);

        }
    }


}
