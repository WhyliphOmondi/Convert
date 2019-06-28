package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.conb);
        Button button1 = (Button) findViewById(R.id.exitb);
        final EditText textView = (EditText) findViewById(R.id.milv);
        final EditText textView1 = (EditText) findViewById(R.id.inchv);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mil = Integer.parseInt(textView.getText().toString());
                double inches = mil/24.4;
                textView1.setText(String.valueOf(inches));

            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);

            }
        });



    }
}
