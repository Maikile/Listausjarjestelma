package com.example.listausjarjestelma;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class UserViewAdapter  extends RecyclerView.Adapter<UserViewHolder> {

    private Context context;
    private ArrayList<User> users = new ArrayList<>();

    public UserViewAdapter(Context context, ArrayList<User> users) {
        this.context = context;
        this.users = users;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(context).inflate(R.layout.user_view_holder,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        holder.firstName.setText(users.get(position).getFirstName());
        holder.lastName.setText(users.get(position).getSurname());
        holder.email.setText(users.get(position).getMail());
        holder.program.setText(users.get(position).getProgram());
    }

    @Override
    public int getItemCount() {
        return users.size();
    }
}
