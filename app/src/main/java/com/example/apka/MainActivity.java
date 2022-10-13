package com.example.apka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public Integer wylosowana=0;
    public ArrayList<Integer> obrazki = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        obrazki.add(R.drawable.dice_1);
        obrazki.add(R.drawable.dice_2);
        obrazki.add(R.drawable.dice_3);
        obrazki.add(R.drawable.dice_4);
        obrazki.add(R.drawable.dice_5);
        obrazki.add(R.drawable.dice_6);
        Button btn = findViewById(R.id.button);
        TextView diceText = findViewById(R.id.textView);
        diceText.setVisibility(diceText.INVISIBLE);
        ImageView koscObrazek = findViewById(R.id.imageView);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                wylosowana = (int)(Math.random()*6+1);
                diceText.setText(wylosowana.toString());
                diceText.setVisibility(diceText.VISIBLE);
                koscObrazek.setImageResource(obrazki.get(wylosowana-1));
            }
        });
    }
}