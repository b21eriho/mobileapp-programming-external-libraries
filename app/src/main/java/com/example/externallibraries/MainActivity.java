package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.github.muddz.styleabletoast.StyleableToast;

public class MainActivity extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StyleableToast.makeText(getApplicationContext(), "Heyo", Toast.LENGTH_LONG, R.style.CustomRedToast).show();
                StyleableToast.makeText(getApplicationContext(), "hoye", Toast.LENGTH_LONG, R.style.CustomBlueToast).show();
            }
        });
    }
}
