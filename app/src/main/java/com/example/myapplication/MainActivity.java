
        package com.example.myapplication;
        import android.app.Activity;
        import android.content.Context;
        import android.content.Intent;
        import android.os.Bundle;
        import android.widget.Button;
        import android.view.View;
        import android.view.View.OnClickListener;

        public class MainActivity extends Activity {

            Button button;

            @Override
            public void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);
                addListenerOnButton();
            }

            public void addListenerOnButton() {

                final Context context = this;

                button = (Button) findViewById(R.id.btn1);

                button.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View arg0) {

                        Intent intent = new Intent(context,layout1.class);
                        startActivity(intent);

                    }

                });

            }

        }