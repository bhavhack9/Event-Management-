
package com.example.myapplication;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.regex.Pattern;

public class layoutPay extends Activity {

    Button button7;
    EditText txtName, txtDate, txtAddress, txtEvent;
    TextView txtPhone;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainpay);
        addListenerOnButton();
        txtPhone = (TextView) findViewById(R.id.txtphone);


    }

    public void addListenerOnButton() {

        final Context context = this;

        button7 = (Button) findViewById(R.id.button10);

        button7.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                Toast.makeText(getApplicationContext(), "Successfully Submitted you will be notified soon", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, MainActivity.class);
                startActivity(intent);
            }

        });


    }

    private boolean isValidMobile(String txtPhone) {
        if (!Pattern.matches("[a-zA-Z]+", txtPhone)) {
            return txtPhone.length() > 6 && txtPhone.length() <= 13;
        }
        return false;
    }
}
