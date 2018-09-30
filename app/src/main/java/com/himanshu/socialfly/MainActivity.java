package com.himanshu.socialfly;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.himanshu.socialfly.POJO.Customer;
import com.himanshu.socialfly.POJO.ExampleData;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = findViewById(R.id.go_btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBookingActivity();
            }
        });
    }

    void openBookingActivity() {
        Intent intent = new Intent(this, BookingActivity.class);
        EditText editText = findViewById(R.id.ticketEditText);
        Customer customer = null;
        for (Customer c : ExampleData.getData()) {
            if (c.getTicketNumber().equals(editText.getText().toString())) {
                customer = c;
                break;
            }
        }
        intent.putExtra("customer", customer);
        startActivity(intent);
    }
}
