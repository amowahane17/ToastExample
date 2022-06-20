package com.example.toastexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button byDefaultToast, simpleGravityToast , nestedGravityToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        byDefaultToast = findViewById(R.id.byDefault);
        simpleGravityToast = findViewById(R.id.simple_gravity_toast);
        nestedGravityToast = findViewById(R.id.nested_gravity_toast);

        byDefaultToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "lol", Toast.LENGTH_SHORT).show();
            }
        });

        simpleGravityToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(MainActivity.this,"noice",Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.CENTER,0,0);

                toast.show();
            }
        });

        nestedGravityToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(MainActivity.this,"WOW!",Toast.LENGTH_SHORT);

                toast.setGravity(Gravity.BOTTOM|Gravity.END ,0,0);

                toast.show();

            }
        });

    }
}