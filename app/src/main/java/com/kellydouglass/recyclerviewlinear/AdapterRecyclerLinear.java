package com.kellydouglass.recyclerviewlinear;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdapterRecyclerLinear extends RecyclerView.Adapter<AdapterRecyclerLinear.MyHolder> {

    Context context;
    ArrayList<Pojo> pojo;
    LayoutInflater inflator;

    public AdapterRecyclerLinear(Context context, ArrayList<Pojo> pojo) {
        this.context = context;
        this.pojo = pojo;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.custom_list, parent, false);
        MyHolder myHolder = new MyHolder(view);
        return myHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        holder.codeName.setText(pojo.get(position).getCodeName());
        holder.codeVersion.setText(pojo.get(position).getCodeVersion());

    }

    @Override
    public int getItemCount() {
        return pojo.size();
    }

    public static class MyHolder extends RecyclerView.ViewHolder {

        TextView codeName, codeVersion;

        public MyHolder(@NonNull View itemView) {
            super(itemView);
            codeName = itemView.findViewById(R.id.code_name);
            codeVersion = itemView.findViewById(R.id.code_version);
        }
    }


}
