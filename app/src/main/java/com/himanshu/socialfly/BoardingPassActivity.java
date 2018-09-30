package com.himanshu.socialfly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.himanshu.socialfly.POJO.Customer;
import com.himanshu.socialfly.POJO.Seat;

import java.io.Serializable;
import java.util.ArrayList;

public class BoardingPassActivity extends AppCompatActivity {

    private Customer customer;
    private ArrayList<Seat> seats;
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_boarding_pass);

        Intent intent = getIntent();
        customer = (Customer) intent.getSerializableExtra("customer");
        seats = (ArrayList<Seat>) intent.getSerializableExtra("seats");

        mRecyclerView = (RecyclerView) findViewById(R.id.my_recycler_view);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        mRecyclerView.setHasFixedSize(true);

        // use a linear layout manager
        LinearLayoutManager mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);

        // specify an adapter (see also next example)
        MyAdapter mAdapter = new MyAdapter(customer, seats);
        mRecyclerView.setAdapter(mAdapter);
    }
}
