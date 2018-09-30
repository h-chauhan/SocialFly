package com.himanshu.socialfly;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.himanshu.socialfly.POJO.Customer;
import com.himanshu.socialfly.POJO.Seat;

import java.util.ArrayList;

class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    ArrayList<String> names;
    ArrayList<Seat> seats;

    MyAdapter(Customer customer, ArrayList<Seat> seats) {
        this.names = customer.getPassengers();
        this.seats = seats;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.boarding_pass, viewGroup, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder myViewHolder, int i) {
        myViewHolder.name.setText(names.get(i));
        myViewHolder.seat.setText(seats.get(i).getNumber());
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView name;
        TextView seat;

        MyViewHolder(@NonNull View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            seat = itemView.findViewById(R.id.seat);
        }
    }
}
