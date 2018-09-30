package com.himanshu.socialfly;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.himanshu.socialfly.POJO.Customer;
import com.himanshu.socialfly.POJO.ExampleData;
import com.himanshu.socialfly.POJO.RequestBody;
import com.himanshu.socialfly.POJO.Seat;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookingActivity extends AppCompatActivity {
    private Customer customer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);

        Intent intent = getIntent();
        customer = (Customer) intent.getSerializableExtra("customer");

        findViewById(R.id.fbbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSeats();
            }
        });

        findViewById(R.id.twbtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSeats();
            }
        });
    }

    private void getSeats() {
        final ProgressDialog progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading....");
        progressDialog.show();

        Call<ArrayList<Seat>> call = RetroClass.client.getSeats(
                new RequestBody(customer.getInterests(), customer.getPassengers().size()));
        call.enqueue(new Callback<ArrayList<Seat>>() {
            @Override
            public void onResponse(Call<ArrayList<Seat>> call, Response<ArrayList<Seat>> response) {
                progressDialog.dismiss();
                Intent intent = new Intent(BookingActivity.this, BoardingPassActivity.class);
                intent.putExtra("customer", customer);
                intent.putExtra("seats", response.body());
                startActivity(intent);
            }

            @Override
            public void onFailure(Call<ArrayList<Seat>> call, Throwable t) {
                progressDialog.dismiss();
                Toast.makeText(BookingActivity.this,
                        "Something went wrong...Please try later!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
