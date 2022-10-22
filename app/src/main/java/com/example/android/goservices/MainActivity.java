package com.example.android.goservices;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.button.MaterialButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button signup_servicemen = findViewById(R.id.signup_servicemen);

        signup_servicemen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gotoActivity(SignUpServicemen.class);
            }
        });

        Button login_servicemen = findViewById(R.id.login_servicemen);
        login_servicemen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gotoActivity(LoginServicemen.class);
            }
        });

        Button signup_customer = findViewById(R.id.signup_customer);
        signup_customer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gotoActivity(SignUpCustomer.class);
            }
        });

        Button login_customer = findViewById(R.id.login_customer);
        login_customer.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                gotoActivity(LoginCustomer.class);
            }
        });

    }
    private void gotoActivity(Class a){
        Intent new_intent = new Intent(this,a);
        startActivity(new_intent);
    }
}
