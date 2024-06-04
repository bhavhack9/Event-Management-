package com.example.myapplication;
import android.app.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

import com.example.myapplication.R;
import com.example.myapplication.layout1;

public class layout3 extends AppCompatActivity {

    Button button6;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main3);
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        final Context context = this;

        button6 = (Button) findViewById(R.id.button);

        button6.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Intent intent = new Intent(context, layoutPay.class);
                startActivity(intent);

            }

        });

    }

}


