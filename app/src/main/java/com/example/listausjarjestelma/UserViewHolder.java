package com.example.listausjarjestelma;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class UserViewHolder extends RecyclerView.ViewHolder{
    TextView firstName, lastName, email, program;
    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
        firstName = itemView.findViewById(R.id.textFirstName);
        lastName = itemView.findViewById(R.id.textLastName);
        email = itemView.findViewById(R.id.textEmail);
        program = itemView.findViewById(R.id.textDegreeProgram);
    }
}
