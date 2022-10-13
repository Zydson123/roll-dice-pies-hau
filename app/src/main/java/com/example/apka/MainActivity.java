package com.example.apka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Integer wylosowana=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = findViewById(R.id.button);
        TextView diceText = findViewById(R.id.textView);
        diceText.setVisibility(diceText.INVISIBLE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wylosowana = (int)(Math.random()*6+1);
                diceText.setText(wylosowana.toString());
                diceText.setVisibility(diceText.VISIBLE);
                //pies
            }
        });
    }
}